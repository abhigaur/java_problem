package testproject;

public class CompressString1 {

    public static void main(String[] args) {


        String s = "aaabbcccccd";

        char[] chr=s.toCharArray();

        for(int i=0;i<chr.length;i++)
        {
            int count=1;

                for(int j=i+1;j<chr.length;j++)
                {
                    if(chr[i]==chr[j])
                    {
                        count++;
                        chr[j]='*';
                    }
                }

                if(count>0 && chr[i]!='*')
                {

                    System.out.print(chr[i]+""+count);
                }
        }
    }
}
