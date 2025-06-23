package TIL250620.synchronization;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for(int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }
        for(Thread t: threads) {
            t.join(); // 각 스레드를 기다려준다.
        }
        System.out.println("Final count: " + counter.getCount());
    }
}
