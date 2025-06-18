package TIL250618.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        for (String fruit : fruits) {
            System.out.println(fruit.hashCode());
        }
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
