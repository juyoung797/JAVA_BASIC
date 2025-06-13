package TIL250613;

public class Main {
    public static String publicField = "testField";
    public static void main(String[] args) {
        System.out.println(new Main().publicField);
    }
}