package strings;

//Replace all spaces in a String with "%20"

public class URLify {

	public static int charCount(char[] str, int start, int end, char target) {
		int count = 0;

		for (int i = start; i < end; i++) {
			if (str[i] == target) count++;
		}
		return count;
	}

	public static void solution(char[] str, int trueLength) {
		int numberOfSpaces = charCount(str, 0, trueLength, ' ');
		int newIndex = trueLength - 1 + numberOfSpaces * 2;

		if (newIndex + 1 < str.length) str[newIndex + 1] = '\0';

		for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
			if (str[oldIndex] == ' ') {
				str[newIndex] = '0';
				str[newIndex - 1] = '2';
				str[newIndex - 2] = '%';
				newIndex -= 3;
			} else {
				str[newIndex] = str[oldIndex];
				newIndex--;
			}
		}
	}

	public static void main(String[] args) {
		String tester = "Mr John Smith    ";
		char[] tst = tester.toCharArray();
		solution(tst, 13);
		System.out.println(new String(tst));
	}
}
