package testproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String s= "ajeet is pramjeet";
       char[] chr=s.toCharArray();

       for(int i=0;i<chr.length;i++)
       {
           int count=1;
           for(int j=i+1;j<chr.length;j++)
           {

               if(chr[i]==chr[j]) {

                   chr[j] = '*';

                   count++;
               }

           }
           if(count>1 && chr[i]!='*')
           {
               System.out.println(chr[i]);
           }

       }

    }
}
