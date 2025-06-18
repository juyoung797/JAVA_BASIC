package TIL250618.treeset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("cherry");
        for (String fruit : treeSet) {
            System.out.println(fruit.hashCode());
        }
        System.out.println(treeSet);
    }
}

