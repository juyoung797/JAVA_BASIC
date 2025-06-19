package TIL250619.treeset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new TreeMap<>();
        fruitPrice.put("사과", 17000);
        fruitPrice.put("배", 10320);
        fruitPrice.put("수박", 15920);
        fruitPrice.put("멜론", 10630);
        fruitPrice.put("멜론", 78787);

        for(Map.Entry<String, Integer> entry : fruitPrice.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
