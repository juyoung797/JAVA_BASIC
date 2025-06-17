package TIL250617.trycatchfinally;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: 0으로 나눔.");
        } finally {
            System.out.println("Cleanup: 이 블록은 항상 실행됩니다.");
        }
    }
}
