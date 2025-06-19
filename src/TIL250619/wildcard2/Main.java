package TIL250619.wildcard2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void printElements(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
            if (o instanceof Integer) {
                Integer.toHexString((Integer)o);
            } else if (o instanceof String) {
                System.out.println((String)o);
            }
        }
    }

    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("a", "b", "c");
        List<Boolean> booleans = Arrays.asList(true, false, true);
        System.out.println("--printElements--");
        printElements(numbers);
        printElements(words);
        printElements(booleans);
        System.out.println("--sumList--");
        System.out.println(sumList(numbers));


    }
}
