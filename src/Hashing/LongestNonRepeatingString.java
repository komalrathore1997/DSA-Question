package Hashing;

import java.util.HashMap;
import java.util.Map;

class LongestNonRepeatingString {
	public static void main(String[] args) {
		String s="abcabcbb";
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		System.out.println(ans);

	}
}
