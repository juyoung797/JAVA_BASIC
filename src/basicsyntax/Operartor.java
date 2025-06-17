package basicsyntax;

public class Operartor {
    int a = 10;
    int b = 13;
    int max;
    String color = "주황";
    public void run() {
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);
    }
    public void run2() {
        if (color == "빨강") {
            System.out.println("빨강");
        } else if (color == "파랑") {
            System.out.println("파랑");
        } else {
            System.out.println("보라");
        }
        String color2 = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : (color == "보라") ? "보라" : "주황";
        System.out.println(color2);
    }
}
