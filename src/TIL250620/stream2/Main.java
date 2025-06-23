package TIL250620.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> values = Arrays.asList(10.0, 20.0, 30.0);

        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}
