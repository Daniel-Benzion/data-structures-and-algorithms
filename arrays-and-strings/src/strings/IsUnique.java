package strings;

//Implement an algorithm to determine if a string has all unique characters.

import java.util.HashSet;

public class IsUnique {

	public static boolean solution(String str) {
		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			if (!set.add(str.charAt(i))) return false;
		}
		return true;
	}
}
