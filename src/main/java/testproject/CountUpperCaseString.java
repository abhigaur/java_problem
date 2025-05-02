package testproject;

public class CountUpperCaseString {
    public static void main(String[] args) {

        String s="This is Abhilash gaUrR";
      char[] chr= s.toCharArray();

        System.out.println(chr);
        int count =0;

        for(int i=0;i<chr.length;i++)
        {
            if(chr[i]>='A' && chr[i]<='Z')
            {
                count++;
            }
        }
        System.out.println("total number of upper case"+count);



    }
}
