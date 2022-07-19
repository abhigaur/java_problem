package stringPrograms;

public class ReplacingSpecialCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="@#$abhi#$%#abhi#$%#0234";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	}

}
