package testproject;

public class SamePlace {
    public static void main(String[] args) {

        String str = "to the god";
        //output =do geh tot

        StringBuilder sb= new StringBuilder();
        String withoutSpace=str.replaceAll(" ","");
        char[] chr=withoutSpace.toCharArray();
        char[] ss=str.toCharArray();

        for(int i=withoutSpace.length()-1;i>=0;i--)

        {
           sb.append(chr[i]);
        }

        for(int i=0;i< chr.length;i++)
        {
            if(ss[i]==' ')
            {
             sb.insert(i,' ');
            }

        }

        System.out.println(sb);

    }
}
