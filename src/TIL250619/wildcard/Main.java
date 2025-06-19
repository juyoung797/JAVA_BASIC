package TIL250619.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] arr = new Integer[3]; // variant (공변)
//        List<Object> list = new ArrayList<Integer>(); // 타입안정성 때문에 invariant (불공변)


        List<? extends Number> wildcard = new ArrayList<Integer>();
    }
}
