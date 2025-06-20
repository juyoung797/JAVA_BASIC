package TIL250620;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int result = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .mapToInt(x -> x.intValue())
                .sum(); // 2, 4
        System.out.println(result);
    }
}