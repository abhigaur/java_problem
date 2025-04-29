package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseOrderSort {
    public static void main(String[] args) {
        ArrayList al2= new ArrayList();
        al2.add("1");
        al2.add("4");
        al2.add("3");
        al2.add("2");  al2.add("5");
        al2.add("6");

        Collections.reverse(al2);
        System.out.println(al2);
    }
}
