package stringPrograms;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "this is abhilash";

		

		char[] chr = name.toCharArray();

		// revesrse
		StringBuilder sb = new StringBuilder();
		

		for (int i = chr.length - 1; i >= 0; i--) {

			sb.append(chr[i]);
		}

		
		String revesrseString = sb.toString();
		String withoutspaceString = revesrseString.replace(" ", "");
		StringBuilder sb1 = new StringBuilder(withoutspaceString);
		
		

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				
				sb1.insert(i," ");

			}
		}
		//sb.append("");
		
		System.out.println(sb1);

	}

}
