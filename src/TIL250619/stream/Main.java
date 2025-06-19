package TIL250619.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();
        stream.filter(n -> n % 2 == 0); // 2, 4


        String[] strings = new String[numbers.size()];
        Stream<String> stream1 = Arrays.stream(strings);
    }
}
