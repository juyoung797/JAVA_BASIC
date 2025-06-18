package TIL250618.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrice = new HashMap<>();
        fruitPrice.put("사과", 17000);
        fruitPrice.put("배", 10320);
        fruitPrice.put("수박", 15920);
        fruitPrice.put("멜론", 10630);

        for (Map.Entry<String, Integer> entry : fruitPrice.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());
        }
        System.out.println(fruitPrice.size());

        int sum = 0;
        for (int price : fruitPrice.values()) {
            sum += price;
        }
        System.out.println("Sum of fruit price is: " + sum / fruitPrice.size());
    }
}