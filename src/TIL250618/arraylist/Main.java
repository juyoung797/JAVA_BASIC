package TIL250618.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("dragonfruit");
        fruits.add("cherry");
        fruits.add("banana");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        Collections.sort(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        if(fruits.contains("apple")){
            System.out.println("apple");
        }
        fruits.remove("apple");
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        int index = fruits.indexOf("mango");
        System.out.println(index);
        fruits.set(2, "orange");
        System.out.println(fruits);
    }
}
