package testproject;

import java.util.Locale;

public class Example {

    public Person process(Person p)
    {

     p.name= p.name.toUpperCase();
     return p;
    }
}
