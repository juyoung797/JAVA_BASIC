package TIL250618.listandset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> listFruits = new ArrayList<>();
        Set<String> setFruits = new HashSet<>();

        listFruits.add("apple");
        listFruits.add("banana");

        setFruits.add("apple");
        setFruits.add("banana");

        listFruits.add("banana");
        setFruits.add("banana");

        System.out.println(listFruits);
        System.out.println(setFruits);
    }
}
