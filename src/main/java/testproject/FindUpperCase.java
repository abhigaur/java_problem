package testproject;

public class FindUpperCase {

    public static void main(String[] args) {
        String s="This is Abhilash gaUrR";
        char[] chr= s.toCharArray();

        for(int i=0;i<chr.length;i++)

        {
            if(chr[i]>='A' && chr[i]<='Z')
            {
                System.out.print(chr[i]);

            }
        }

    }
}
