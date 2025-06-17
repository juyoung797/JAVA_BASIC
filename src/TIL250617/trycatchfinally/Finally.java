package TIL250617.trycatchfinally;

public class Finally {
    public static void main(String[] args) {
        String input = "123a";
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Process completed.");
        }
    }
}
