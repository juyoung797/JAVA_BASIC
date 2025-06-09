public class Arrays {
    int[] numbers = {2, 4, 6, 8, 10};
    public static void reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[numbers.length - 1 - i]);
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    public static void sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
    public static void run() {
        String message = "Hello, Java!";
        System.out.println(message.length());
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.indexOf("J"));
        System.out.println(message.indexOf("l"));
        System.out.println(message.indexOf("a"));
        System.out.println(message.substring(0));
        System.out.println(message.substring(1));
        char c = 'l';
//        char[] array = message.toCharArray();
        for (int i = 0; i < message.length(); i++) {
            if (message.substring(i, i + 1).equals("l")) {
                System.out.println(i);
                break;
            }
        }
        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(
                address.substring(0, 7)
                        + address.substring(address.length() - 5)
        );
    }
}
