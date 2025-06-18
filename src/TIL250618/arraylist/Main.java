package TIL250618.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("dragonfruit");
        fruits.add("mango");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
