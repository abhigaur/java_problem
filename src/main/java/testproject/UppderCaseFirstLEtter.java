package testproject;

public class UppderCaseFirstLEtter {

    public static void main(String[] args) {
        String s="This Is Abhi";

        String[] word = s.split(" ");

        // this logic to fetch first char of the string

        StringBuilder sb= new StringBuilder();



        for (int i=0;i<word.length;i++)
        {
            char[] chr = word[i].toCharArray();
            for(int j=0;j<word[i].length();j++)
            {
                //System.out.println(chr[j]);
                sb.append(chr[j]);
                break;
            }
        }

        System.out.println(sb);

    }
}
