package TIL250618.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> linkedSet = new LinkedHashSet<String>();
        linkedSet.add("banana");
        linkedSet.add("apple");
        linkedSet.add("cherry");
        for (String fruit : linkedSet) {
            System.out.println(fruit.hashCode());
        }
        System.out.println(linkedSet);
    }
}
