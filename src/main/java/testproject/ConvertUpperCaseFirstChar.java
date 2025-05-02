package testproject;

public class ConvertUpperCaseFirstChar {
    public static void main(String[] args) {

        String s="this is abhilash";

        String[] word = s.split(" ");

        for(int i=0;i<word.length;i++)
        {
            String firstWorld=word[i].substring(0,1).toUpperCase();
            String remaining=word[i].substring(1);

            s=firstWorld+remaining+" ";
            System.out.println(s);

        }


    }
}
