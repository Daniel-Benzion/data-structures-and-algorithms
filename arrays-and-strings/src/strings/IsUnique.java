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
	//Time: O(n)
	//Space: O(n)
	


	//Without using additional data structures?
	public static boolean solution2(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) return false;
			}
		}
		return true;
	}
	//Time: O(n^2)
	//Space: O(1)

}
