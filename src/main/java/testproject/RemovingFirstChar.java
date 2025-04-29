package testproject;

public class RemovingFirstChar {
    public static void main(String[] args) {

        String name="This is abhilsh";
        String[] split = name.split(" ");


        for(int i=0;i< split.length;i++)
        {
            String test = split[i].substring(1);
            for(int j=0;j<split[i].toCharArray().length;j++)
            {

            }
            System.out.println(test);
        }
    }
}
