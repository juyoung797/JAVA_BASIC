package TIL250620.thread2;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable executed");
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(5000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " Thread executed");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new MyRunnable(), "First Thread");
        firstThread.start();
        Thread secondThread = new MyThread();
        secondThread.setName("second");
        secondThread.start();
    }
}
