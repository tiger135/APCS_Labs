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
	// Given a string s, returns the number of spaces in s.
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

	// Given a string s, returns the number of vowels in s.
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

	// Given a string s and a letter, return the number of times letter appears in s.
	public static int letterCount(String s, String letter) {
		int returnValue = 0;
		for (int i = 0; i < s.length(); i++) {
			String sub = s.substring(i, i + 1);
			if (sub.compareTo(letter) == 0)
				returnValue++;
		}
		return returnValue;
	} // end letterCount

	// Given a string s, return the portion of the string that comes before substr. If substr is
	//not found, return the entire string s.
	public static String beforeString(String s, String substr) {
		String returnValue = "";
		int index = s.indexOf(substr);// Wo => 6
		if (index == -1)
			returnValue = s;
		else
			returnValue = s.substring(0, index);
		return returnValue;
	} // end beforeString

	// Given a string s, return the portion of the string that comes after substr. If substr is not
	//found, return an empty string
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

	// Given a string s, return the string with all vowels capitalized.
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
	} //end capVowel
	
	//Capitalizes the first word of input
	public static String capFirstWordOnly( String input) {
	  int len = input.length();
	  String charac = input.substring(0, 1);
	  String capWord = "";
      int i = 0;
      // Skips any spaces at the beginning of the sentence.
      while ( i < len-1 && charac.equals(" ")) {
        charac = input.substring( i + 1 , i + 2);
        capWord += " ";
        i++;
      }
      capWord += input.substring(i, i + 1).toUpperCase();
      capWord += input.substring(i+1);
      return capWord;
	} //end capFirstWordOnly
	
	// Given a string s that contains multiple sentences,return the same string except the first word of
//each sentence is capitalized. You may assume the only characters in the string are letters, numbers, spaces, and periods. Ex,
//capFirstWord("hello. my name is dave. goodbye.")
	public static String capFirstWord(String s) {
        String [] sentences = s.split("\\.");
        String returnValue = "";
		for (int i = 0; i < sentences.length; i++) {
		  returnValue += capFirstWordOnly(sentences[i]) + ".";
		}
		return returnValue;
	} //end capFirstWord

} //end String_Lab
