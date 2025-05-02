package stringPrograms;

import java.util.Scanner;

public class DoubleLetterSquenceLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner in=new Scanner(System.in); int i,j,p=0,len1,len2; char ch1,ch2,ch3;
		 * String s1,s2; System.out.println("Enter a Sentence"); s1=in.nextLine();
		 * s1=s1.toUpperCase(); s1=s1+" "; len1=s1.length(); in.close();
		 * for(i=0;i<len1;i++) { ch1=s1.charAt(i); if(ch1==' ') { s2=s1.substring(p,i);
		 * p=i+1; len2=s2.length(); for(j=0;j<(len2-1);j++) { ch2=s2.charAt(j);
		 * ch3=s2.charAt(j+1); if(ch3-ch2==1) { System.out.print(s2+" "); break; } } } }
		 */

		/*
		 * 
		 * String sentence, words[]; // Use Scanner class to accept any sentence from
		 * user Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter any sentence: "); sentence =
		 * sc.nextLine().toLowerCase(); // Find all words from given sentence words =
		 * sentence.split(" "); System.out.print("Double Letter Sequence Words are: ");
		 * // Use for loop to transverse all words of sentence for(int i = 0; i <
		 * words.length; i++) { String temp = words[i]; // Use for loop to find double
		 * letter sequence words for(int j = 0; j < temp.length() - 1; j++) { // Check
		 * for sequence letter is same or not if(temp.charAt(j) == temp.charAt(j + 1))
		 * System.out.print(temp + " "); } }
		 */

		String s = "abbhis iss is  test ram  penp shyam good  ramm";

		String[] words = s.split(" ");

		//System.out.println(words.length);

		for (int i = 0; i < words.length; i++) {
			char[] charArr = words[i].toCharArray();
			
			for (int j = 0; j < charArr.length-1; j++) {

				for (int k = j + 1; k < j+2; k++) {
					if (charArr[j] == charArr[k]) {
						System.out.println("Words having similar sequence char" +" "+ words[i]);

					}

				}

			}

		}


		/*


		String[] splt=s.split(" ");

        for(int i=0;i<splt.length;i++)
        {
            char[] chr=splt[i].toCharArray();
            for(int j=0;j<chr.length-1;j++)
            {
                if(chr[j]==chr[j+1])
                {
                    System.out.println(splt[i]);
                    break;
                }
            }
        }
		 */

	}

}
