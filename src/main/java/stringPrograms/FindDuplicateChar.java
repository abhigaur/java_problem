package stringPrograms;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "ajeet is pramjeet";

		char[] chr = string1.toCharArray();

		System.out.println(chr.length);

		for (int i = 0; i < chr.length; i++) {
			int count = 1;
			// System.out.println(chr[i]);

			for (int j = i + 1; j < chr.length; j++) {
				if (chr[i] == chr[j]) {
					count++;
					chr[j] = '0';
				}
			}

			if (count > 1 && chr[i] != '0') {
				System.out.println(chr[i]);
				
				//System.out.println("test");
			}

		}

	}

}
