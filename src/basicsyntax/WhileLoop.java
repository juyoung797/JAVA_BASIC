package basicsyntax;

public class WhileLoop {
    //초기값 세팅

    public static void run() {
        int i = 0;
        while (i < 5) {
            System.out.println(i); //반복할 코드
            i++; //값 증가,감소
        }
    }
    public static void infiniteWhileLoop() {
        boolean a = false;
        while (a) {
            System.out.println("무한루프");
        }
    }
    //최소 1번 실행을 보장받는 do-while loop
    public static void infiniteDoWhileLoop2() {
        boolean a = false;

        do {
            System.out.println("무한루프");
        } while (a);
    }
    public static void whileCase() {
        boolean a = true;
        int b = 1;
        while (a) {
            System.out.println(b);
            b++;

            if (b > 100) {
                a = false;
            }
        }
    }
    public static void doWhileCase() {
        int input = 2;
        do {
            System.out.println("안녕하세요 자판기 입니다.");
            //키입력
            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 고름");
            }
            input = 0;
        } while (input != 0);
    }
}
