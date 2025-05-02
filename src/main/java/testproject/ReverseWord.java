package testproject;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "this is abhilash";

        String[] split = str.split(" ");

        for(int i=0;i<split.length;i++)
        {
            char[] chr=split[i].toCharArray();
            for(int j=split[i].toCharArray().length-1;j>=0;j--)
            {
                System.out.print(chr[j]);
            }
            System.out.print(" ");
        }
    }
}
