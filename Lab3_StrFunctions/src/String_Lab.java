// Given a string s, returns the number of spaces in s.

public class String_Lab {

	public static void main(String[] args) {

		System.out.println(spaceCount("H E L L O"));
		System.out.println(beforeString("Hello World!", "Wo"));
		System.out.println(vowelCount("Hello"));
		System.out.println(letterCount("Hello World!", "l"));
		System.out.println(afterString("Hello World!", "Wo"));
		System.out.println(capVowel("Hello World!"));
		System.out.println(capFirstWord("hello. my name is dave. goodbye."));
		// TODO Auto-generated method stub

	}

	public static int spaceCount(String s) {
		int returnValue = 0;// count # of spaces
		String sub = "";// variable for substring
		for (int i = 0; i < s.length(); i++) {
			sub = s.substring(i, i + 1);// get 1 letter
			if (sub.compareTo(" ") == 0)
				returnValue++;// count + 1
		}
		return returnValue;
	} // end spaceCount

	public static int vowelCount(String s) {
		String vowels[] = { "a", "e", "i", "o", "u" };
		int returnValue = 0;// count # of spaces
		String sub = "";// variable for substring
		for (int i = 0; i < s.length(); i++) {
			sub = s.substring(i, i + 1);// get 1 letter
			for (int a = 0; a < vowels.length; a++) {
				if (sub.compareTo(vowels[a].toLowerCase()) == 0)
					returnValue++;// count + 1
			}

		}
		return returnValue;
	} // end vowelCount

	public static int letterCount(String s, String letter) {
		int returnValue = 0;
		for (int i = 0; i < s.length(); i++) {
			String sub = s.substring(i, i + 1);
			if (sub.compareTo(letter) == 0)
				returnValue++;
		}
		return returnValue;
	} // end letterCount

	public static String beforeString(String s, String substr) {
		String returnValue = "";
		int index = s.indexOf(substr);// Wo => 6
		if (index == -1)
			returnValue = s;
		else
			returnValue = s.substring(0, index);
		return returnValue;
	} // end beforeString

	public static String afterString(String s, String substr) {
		String returnValue = "";
		String last_letter = substr.substring(substr.length() - 1);// Wo => o
		// System.out.println(s.indexOf(last_letter));
		int index = s.indexOf(substr) + substr.indexOf(last_letter);
		if (index == -1)
			returnValue = s;
		else
			returnValue = s.substring(index + 1);
		return returnValue;
	} // end afterString

	public static String capVowel(String s) {
		String vowels[] = { "a", "e", "i", "o", "u" };
		String returnValue = "";// count # of spaces
		String vowel = "";
		String sub = "";// variable for substring
		for (int i = 0; i < s.length(); i++) {
			sub = s.substring(i, i + 1).toLowerCase();// get 1 letter
			if (sub.compareTo("a") == 0 || sub.compareTo("e") == 0 || sub.compareTo("i") == 0 || sub.compareTo("o") == 0
					|| sub.compareTo("u") == 0) {
				// ("Hello".substring(1, 2).toUpperCase());
				// System.out.println(sub.toUpperCase());
				returnValue += sub.toUpperCase();
			} // +
			else
				returnValue += sub;

		}
		return returnValue;
	}

	public static String firstWordCap(String str) {
		String returnVal = "";
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			while (str.substring(i, i + 1).compareTo(" ") == 0) {
				index++;
			}
			returnVal += str.substring(index, index + 1).toUpperCase();
		}
		returnVal += str.substring(index + 2);
		return returnVal;
	}

	public static String capFirstWord(String s) {
		String returnValue = "";
		int maxLen = s.length();
		String sentences[] = s.split("\\.");
		for (int i = 0; i < sentences.length; i++) {
			returnValue += firstWordCap(sentences[i]) + ". ";
		}

		// for (int i = 1; i < maxLen - 3; i++) {
		// String sub = s.substring(i, i + 1);
		// if (sub.compareTo(".") == 0) {
		// System.out.println(i);
		// returnValue += sub;
		// returnValue += s.substring(i + 1, i + 2);
		// System.out.println(s.substring(i + 2, i + 3).toUpperCase());
		// returnValue += s.substring(i + 2, i + 3).toUpperCase();
		// } else {
		// returnValue += s.substring(i + 3, i + 4);
		//
		// }
		// }
		return returnValue;
	}

}
