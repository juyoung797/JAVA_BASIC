//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mood = "happy";
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
            case "fear":
                System.out.println("나는 겁이난다");
                break;
            default:
                System.out.println("나는 편안하다");
        }
    }
}
