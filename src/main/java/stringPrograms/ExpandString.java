package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExpandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "b3d4a2g";

		char[] chrArr = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < chrArr.length; i++) {
			if (Character.isDigit(chrArr[i])) {
				int nmValue = Character.getNumericValue(chrArr[i]);
				while (nmValue > 0) {
					sb.append(chrArr[i - 1]);
					nmValue--;
				}

			} else {

				sb.append(chrArr[i]);

			}
		}

		System.out.println(sb);

	}

}
