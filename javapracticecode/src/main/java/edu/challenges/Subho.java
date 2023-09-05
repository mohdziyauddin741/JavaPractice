package edu.challenges;

public class Subho {
	/**Prints the upper case letters in a sentence & words starting in upper case
	 * @param inputString
	 */
	public static void findUpperAlpAndWords(String inputString) {
		String methodName = "findUpperAlpAndWords()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");
		
		inputString = inputString.trim();
		System.out.println("List of upper case alphabets in the input string :::: ");

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z') {
				System.out.print(inputString.charAt(i));
			}
		}
		System.out.println();

		System.out.println("List of words starting with  in upper case alphabets are :::: ");
		String[] words = inputString.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) >= 'A' && words[i].charAt(0) <= 'Z') {
				System.out.println(words[i]);
			}
		}
		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
	}
}
