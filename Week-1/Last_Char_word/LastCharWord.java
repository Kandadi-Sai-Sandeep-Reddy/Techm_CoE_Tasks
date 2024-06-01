package Last_Char_word;

import java.util.Scanner;

public class LastCharWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String result = getLastCharactersOfWords(input);

		System.out.println(result);
		scanner.close();
	}

	public static String getLastCharactersOfWords(String input) {
		StringBuilder result = new StringBuilder();
		String[] words = input.split("\\s+"); 

		for (String word : words) {
			if (!word.isEmpty()) {
				char lastChar = word.charAt(word.length() - 1);
				if (Character.isLetter(lastChar)) {
					result.append(lastChar);
				}
			}
		}

		return result.toString();
	}
}
