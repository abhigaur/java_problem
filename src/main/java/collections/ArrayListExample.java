package collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample  {
    public static void main(String[] args) {

        ArrayList al= new ArrayList();
        al.add("test");
        al.add("raja");
        al.remove("raja");
        System.out.println(al);
        ArrayList al2= new ArrayList();
        al2.add("1");
        al2.add("4");
        al2.add("3");
        al2.add("2");  al2.add("5");
        al2.add("6");

        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);






    }

}
