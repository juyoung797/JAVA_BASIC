package TIL250620.threadExapleArray;

class SumRunnable implements Runnable {
    private final int[] numbers;

    SumRunnable(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;
        System.out.println("SumRunnable executed");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("SumRunnable interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + ": SumRunnable returned " + sum);
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] dataSets = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {7, 14, 21, 28},
                {100, 200, 300, 400}
        };
        for (int[] dataSet : dataSets) {
            Thread sumThread = new Thread(new SumRunnable(dataSet));
            sumThread.start();
        }
    }
}
