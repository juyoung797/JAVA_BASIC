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
        fruitPrice.put("멜론", 78787);

        for (Map.Entry<String, Integer> entry : fruitPrice.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());
        }
        System.out.println(fruitPrice.size());

        int sum = 0;
        for (int price : fruitPrice.values()) {
            sum += price;
        }
        System.out.println("Sum of fruit price is: " + sum / fruitPrice.size());

        System.out.println(fruitPrice.containsKey("사과"));
        System.out.println(fruitPrice.containsKey("포도"));
        System.out.println(fruitPrice.containsValue(15920));
        System.out.println(fruitPrice.containsValue(9999));

        System.out.println(fruitPrice.getOrDefault("사과", 1000));
        System.out.println(fruitPrice.getOrDefault("포도", 1000));

        System.out.println("--replace, remove--");

        fruitPrice.replace("사과", 100);
        fruitPrice.remove("멜론");

        for(Map.Entry<String, Integer> entry : fruitPrice.entrySet()) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());
        }

        System.out.println("--keySet--");

        for(String key: fruitPrice.keySet()) {
            System.out.println(key);
        }
    }
}