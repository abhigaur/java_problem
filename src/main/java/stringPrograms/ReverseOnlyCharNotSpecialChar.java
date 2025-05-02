package stringPrograms;

public class ReverseOnlyCharNotSpecialChar {
    public static void main(String[] args) {
        String s="Ab,c,de!$";
        //output    ed,c,bA!$

        char chr[]=s.toCharArray();
        StringBuilder sb= new StringBuilder();
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();

        for(int i=0;i<chr.length;i++)
        {
            if(chr[i]!='!' && chr[i]!='$')
            {
                sb.append(chr[i]);
            }
            else {
                sb1.append(chr[i]);
            }


        }

       String reverse= String.valueOf(sb.reverse());


        sb2.append(reverse);
        sb2.append(sb1);
        System.out.println(sb2);
    }
}
