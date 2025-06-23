package TIL250623.exam;

public class Main {
    public static int getFullPageCount(int itemsCount, int itemsPerPage) {
        // 여기에 코드를 작성해 주세요.
        return itemsCount / itemsPerPage;
    }
    public static int getProductAbs(int x, int y) {
        // 여기에 코드를 작성해 주세요.
        if (x * y < 0) {
            return - (x * y);
        } else {
            return x * y;
        }
    }
    public static int getDivisorSum(int n) {
        // 여기에 코드를 작성해 주세요.
        int divisorSum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorSum += i;
            } else {
                continue;
            }
        }
        return divisorSum;
    }
//    public static boolean checkBrackets(String s) {
//        // 여기에 코드를 작성해 주세요.
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                for (int j = i + 1; j < s.length(); j++) {
//                    if (s.charAt(j) == ')') {
//                        s[i],
//                    }
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        System.out.println(getFullPageCount(10, 5));   // 2
        System.out.println(getFullPageCount(7, 2));    // 3

        System.out.println(getProductAbs(10, 20));      // 200
        System.out.println(getProductAbs(20, -40));     // 800

        System.out.println(getDivisorSum(12));   // 28
        System.out.println(getDivisorSum(5));    // 6

//        System.out.println(checkBrackets("()[]{}"));     // true
//        System.out.println(checkBrackets("([{}])"));     // true
//        System.out.println(checkBrackets("(]"));         // false
//        System.out.println(checkBrackets("([)]"));       // false
    }
}