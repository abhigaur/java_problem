package testproject;

public class ExpandSequence1 {
    public static void main(String[] args) {

        String s = "b3d4a2g";
        char[] chr=s.toCharArray();
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<chr.length;i++)
        {
            if(Character.isDigit(chr[i]))
            {
                int nm = Character.getNumericValue(chr[i]);
                while(nm>0)
                {
                    sb.append(chr[i-1]);
                    nm--;
                }
            }
            else
            {
                sb.append(chr[i]);
            }


        }
        System.out.println(sb);
    }
}
