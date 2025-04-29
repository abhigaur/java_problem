package testproject;

public class CharSumDigit {

    public static void main(String[] args) {


        String s = "A2M3I5T2";
        StringBuilder sb= new StringBuilder();

        int sum = 0;
        char[] charr = s.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (Character.isDigit(charr[i])) {
                sum = sum + Character.getNumericValue(charr[i]);
            }
            else {
                sb.append(charr[i]);

            }


        }
        sb.append(sum);

        System.out.println(sb);
    }
}
