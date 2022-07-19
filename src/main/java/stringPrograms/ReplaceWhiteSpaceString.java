package stringPrograms;

public class ReplaceWhiteSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "this    is aa good boysss   ";
		
		String afterRemovingSpace = s.replaceAll("\\s", "");
		
		System.out.println(afterRemovingSpace);

	}

}
