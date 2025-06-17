package basicsyntax;

public class SwitchCase {
    String mood = "sad";
    public void run() {
        switch (mood) {
            case "happy":
                System.out.println("나는 행복하다");
                break;
            case "angry":
                System.out.println("나는 화가났다");
                break;
            case "sad":
                System.out.println("나는 슬프다");
                break;
            default:
                System.out.println("지금 내 기분은 이 단어들로는 표현할 수 없다.");
        }
    }
}