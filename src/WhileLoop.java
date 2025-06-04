public class WhileLoop {
    //초기값 세팅
    int i = 0;
    boolean a = false;
    public void run() {
        while (i < 5) {
            System.out.println(i); //반복할 코드
            i++; //값 증가,감소
        }
    }
    public void infiniteWhileLoop() {
        while (a) {
            System.out.println("무한루프");
        }
    }
    //최소 1번 실행을 보장받는 do-while loop
    public void infiniteDoWhileLoop2() {
        do {
            System.out.println("무한루프");
        } while (a);
    }
}
