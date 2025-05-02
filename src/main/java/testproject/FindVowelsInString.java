package testproject;

import java.util.ArrayList;

public class FindVowelsInString {
    public static void main(String[] args) {
        String s="this is abhi";
        char[] chr=s.toCharArray();

        ArrayList as= new ArrayList();


        for(int i=0;i<chr.length;i++)
        {
            if(chr[i]=='a' || chr[i]=='e' ||chr[i]=='o' || chr[i]=='i' ||chr[i]=='u')
            {
                //System.out.println(" in the given string vowel is present " +chr[i] );
                as.add(chr[i]);
            }
        }
        System.out.println(as);
    }
}
