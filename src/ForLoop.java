//비효율적인 코드를 작성하게 되더라도 우선은 문제 해결에 집중하는 것이 좋다.
//효율에 집중해서 발도 못 떼는 경우가 있다.
//문제 해결이 먼저고 그 다음이 효율적인 코드, 디자인패턴 구현이다. 그런 정리 작업은 LLM도 잘한다.
public class ForLoop {
    int number = 5;
    int number2 = 6;
    public void run() {
        for (int i = 1; i <=9; i++) {
            System.out.println(number + "x" + i + " = " + (number * i));
        }
        for (int i = 1; i <=9; i++) {
            System.out.println(number2 + "x" + i + " = " + (number2 * i));
        }
    }
    public void run2() {
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.printf("%d x %d = %2d  ", j, i, i*j);
            }
            System.out.println();
        }
    }
    public void func369() {
        for (int i = 1; i <= 20; i++) {
            if (i >= 15) {
                break;
            }
            if (i % 3 == 0) {
                System.out.printf("(  ) ");
                continue;
            }
            System.out.printf("%d ",i);
        }
    }
}
