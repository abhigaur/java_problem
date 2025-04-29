package testproject;

public class CompressString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Input s=aaabbcccccd
        // output s=a3b2c5d1

        String s = "aaabbcccccd";

       char[] chr=s.toCharArray();

        int length = chr.length;

        for(int i=0;i<length;i++)
        {
            int count=1;

            for(int j=i+1;j<length;j++)
            {
                if (chr[i]==chr[j])
                {
                    chr[j]='*';
                    count ++;
                }
            }

            if(count>=1 && chr[i]!='*')
            {
                System.out.print(chr[i]+""+count);
            }

        }



    }
}
