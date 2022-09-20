package arraysPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class tests {

	public static void main(String[] args) {

		String s = "aaabbccc";

		if (s == null || s.length() <= 0) {
			return;
		}

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArr = s.toCharArray();

		for (char chr : charArr) {
			if (map.keySet().contains(chr)) {
				map.put(chr, map.get(chr) + 1);
			} else {
				map.put(chr, 1);
			}
		}

		StringBuilder sb = new StringBuilder();

		for (char chr : map.keySet()) {
			sb.append(chr);
			sb.append(map.get(chr));
		}

		if (Objects.nonNull(sb)) {
			System.out.println(sb);
		}

	}

}
