package basicsyntax;

public class IfElse {
    int num = 1;
    String mood = "angry";

    public void run() {
        if (num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }
    }

    public void run2() {
        if (mood == "happy") {
            System.out.println("나는 행복하다");
        } else if (mood == "angry") {
            System.out.println("나는 화가난다");
        } else if (mood == "sad") {
            System.out.println("나는 슬프다");
        } else {
            System.out.println("지금 내 기분은 이 단어들로는 표현할 수 없다.");
        }
    }
}
