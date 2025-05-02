package testproject;

public class Revsnmber {
    public static void main(String[] args) {
        int num=9876;
        int revese=0;

        while(num>0)
        {
           int mod=num%10;

           revese=revese*10+mod;
             num=num/10;


        }
        System.out.println(revese);
    }
}
