package strings;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {

	public static boolean isPalidromePermutation(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (!map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), 1);
				} else {
					map.replace(str.charAt(i), map.get(str.charAt(i)), map.get(str.charAt(i)) + 1);
				}
			}
		}
		int counter = 0;
		for (Map.Entry<Character, Integer> pair: map.entrySet()) {
			if (pair.getValue() % 2 != 0){
				counter++;
			}
		}
		return counter == 0 || counter == 1;
	}

	public static void main(String[] args) {
		String tester = "acto cta";
		System.out.println(isPalidromePermutation(tester));
	}
}
