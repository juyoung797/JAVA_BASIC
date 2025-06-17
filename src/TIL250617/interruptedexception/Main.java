package TIL250617.interruptedexception;

public class Main {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            try {
                System.out.println("worker is running");
                Thread.sleep(10_000); //ms 단위 type:long _:,
                System.out.println("work is done");
            } catch(InterruptedException e) {
                System.out.println("worker is interrupted");
            }

        });
    }
}