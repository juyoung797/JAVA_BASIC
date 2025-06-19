package TIL250619.genericarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box {
    public static <T> void displayArray(ArrayList<T> arrayList) {
        for(T element : arrayList) {
            System.out.println(element);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"apple", "banana", "cherry"};
        ArrayList<Integer> numberslist = new ArrayList<>(Arrays.asList(numbers));
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        numberslist.add(1);
        numberslist.add(2);
        numberslist.add(3);

        Box.displayArray(wordsList);
        Box.displayArray(numberslist);

    }
}
