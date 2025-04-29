package testproject;

public class String12 {
    public static void main(String[] args) {

        String s = "This is Abhilash";

//output= siht si hsaliba
      String[]  split=s.split(" ");
   //     char[] chr = s.toCharArray();
        StringBuilder sb = new StringBuilder();


        for(int i=0;i<split.length;i++)
        {
            for(int j= split[i].length()-1;j>=0;j--)
            {
                sb.append(split[i].charAt(j));
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }

}
