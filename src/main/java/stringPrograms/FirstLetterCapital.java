package stringPrograms;

import java.util.stream.IntStream;

public class FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "this is a book";

		String blank = "";

		String[] splitwd = s.split(" ");

		for (int i = 0; i < splitwd.length; i++) {
			
			String firstChar = splitwd[i].substring(0,1);
			
			String remainingString = splitwd[i].substring(1);
			//System.out.println(remainingString);
			
			//System.out.println(firstChar.toUpperCase());
		
			blank=firstChar.toUpperCase()+remainingString+" ";
			System.out.print(blank);
					
		}

	}

}
