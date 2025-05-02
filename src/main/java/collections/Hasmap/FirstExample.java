package collections.Hasmap;

import java.util.HashMap;

public class FirstExample {
    public static void main(String[] args) {
        HashMap map= new HashMap();
        map.put(1,"abhi");
        map.put(2,"tinku");
        map.put(3,"shiva");
       // System.out.println(map);

        HashMap map1= new HashMap();
        map.put(4,"manisha");
        map.put(5,"monit");

        map1.putAll(map);

        System.out.println(map1);

        Object value = map1.get(1);
        System.out.println(value);

        map1.remove(1);

        boolean tt = map1.containsKey(1);
        System.out.println(tt);
        System.out.println(map1);
        System.out.println(map1.entrySet());
    }
}
