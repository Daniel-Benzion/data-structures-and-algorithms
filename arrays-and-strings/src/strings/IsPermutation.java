package strings;

//Check if a string is a permutation of another

public class IsPermutation {

	public static String sort(String s) {
		char[] arr = s.toCharArray();
		java.util.Arrays.sort(arr);
		return new String(arr);
	}

	public static boolean solution(String str1, String str2) {
		if (str1.length() != str2.length()) return false;

		return sort(str1).equals(sort(str2));
	}
}
