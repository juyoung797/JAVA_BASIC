package TIL250618.hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> setFruits = new HashSet<>();
        setFruits.add("apple");
        setFruits.add("banana");
        for (String fruit : setFruits) {
            System.out.println(fruit.hashCode());
        }
        System.out.println(setFruits);
    }
}
