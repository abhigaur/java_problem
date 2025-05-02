package testproject;

public class DoubleSequenceLetter1 {

    public static void main(String[] args) {

        String s = "abbhis iss is  test ram  penp shyam good  ramm";

       String[] word= s.split(" ");
       for(int i=0;i<word.length;i++)
       {
           char[] crr=word[i].toCharArray();
           for(int j=0;j<word[i].toCharArray().length-1;j++)
           {
               if(crr[j]==crr[j+1])
               {
                   System.out.println("word has repeaded char "+word[i]);
               }
           }
       }
    }
}
