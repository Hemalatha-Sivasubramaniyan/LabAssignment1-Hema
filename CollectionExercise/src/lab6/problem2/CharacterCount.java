package lab6.problem2;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		/*
		 * Creating character array and HashMap with key-value as Character-Integer
		 */
		char[] charArr = { 'a', 'b', 'l', 'i', 'a', 'l' };
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		/*
		 * Calling the charCount function to perform character count and print the
		 * values
		 */
		charCountMap = charCount(charArr);

		for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	private static HashMap<Character, Integer> charCount(char[] charArr) {
		int len = charArr.length;
		HashMap<Character, Integer> charMap = new HashMap<>();
		int count = 0;
		char ch = '0';
		/*
		 * Character count is calculated by comparing the array elements and updating
		 * the count in map
		 */
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (charArr[i] == charArr[j]) {
					count++;
					ch = charArr[i];
				} else {
					count = 1;
					ch = charArr[i];
				}
			}
			charMap.put(ch, count);
		}
		/*
		 * returning the stored map
		 */
		return charMap;
	}

}
