package Java.Programming;

import java.util.HashMap;

public class freqOfWord {

	static void countOfWord(String input) {
		HashMap<String, Integer> countOfWords = new HashMap<String, Integer>();
		String[] str = input.split(" ");

		for (int index = 0; index < str.length; index++) {
			String word = str[index];
			if (countOfWords.containsKey(word)) {
				countOfWords.put(word, countOfWords.get(word) + 1);
			} else {
				countOfWords.put(word, 1);
			}

		}
		System.out.println(countOfWords);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countOfWord("input i have provided is correct input as per schema validation");

	}

}
