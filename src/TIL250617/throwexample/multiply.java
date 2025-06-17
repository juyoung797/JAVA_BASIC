package TIL250617.throwexample;

public class multiply {
    public static int multiply(String input) throws NumberFormatException {
        String[] operand = input.split("\\*");
        int[] nums = new int[operand.length];
        try {
            for (int i = 0; i < operand.length; i++) {
                nums[i] = Integer.parseInt(operand[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("wrong format : " + e.getMessage());
        }
        return nums[0]*nums[1];
    }
    public static void main(String[] args) {
        System.out.println(multiply("9*9"));
    }
}
