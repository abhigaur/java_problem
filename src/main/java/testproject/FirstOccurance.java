package testproject;

public class FirstOccurance {

    public static void main(String[] args) {
        String s = "this is a book";

        

        String[] splitwd = s.split(" ");
        
        char ss = 0;
        
        for(int i=0;i<splitwd.length;i++)
        {
            char[] chr=splitwd[i].toCharArray();

            for(int j=0;j<1;j++)
            {
                 ss = chr[j];

                
            }
            System.out.println(ss);
        }



    }
}
