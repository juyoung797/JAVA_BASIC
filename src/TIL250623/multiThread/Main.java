package TIL250623.multiThread;

class SumThread extends Thread {
    private int[] array;
    private int start, end;
    private int partialSum = 0;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += array[i];
        }
    }
    public int getPartialSum() {
        return partialSum;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        int numThreads = 4; // 덩어리 = 4개
        int chunkSize = numbers.length / numThreads; // 한 덩어리 크기 = 25
        SumThread[] threads = new SumThread[numThreads]; // 덩어리 4개 들어있는 SumThread[]

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? numbers.length : start + chunkSize;
            // start = 0, 25, 50, 75
            // end = 25, 50, 75, 100

            threads[i] = new SumThread(numbers, start, end);
            threads[i].start();
        }

        int totalSum = 0;
        try {
            for (SumThread thread : threads) {
                thread.join();
                totalSum += thread.getPartialSum();
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted : " + e.getMessage());
        }

        System.out.println("Total sum : " + totalSum);
    }
}
