package company.interviews;

import numbers.Numbers;
import strings.CodeStrings;

public class NykaRound1 {

	/**
	 * Prints words of a sentence in reverse order
	 */
	public String reverseSentenceWords(String sentence) {
		System.out.println(":::::::::::::::::::Start of Method:::::::::::::::::::");

		String revSent = "";

		CodeStrings	codestr = new CodeStrings();

		//		String[] words = sentence.split(" ");
		String[] words = codestr.splitSentence(sentence);

		for (int i = words.length - 1; i >= 0; i--) {

			if (i != (words.length - 1)) {
				revSent = revSent + " ";
			}

			revSent = revSent + words[i];
		}

		System.out.println("Reversed Sentence ==== " + revSent);

		System.out.println(":::::::::::::::::::End of Method:::::::::::::::::::");
		return revSent;
	}

	/**
	 * Prints pyramid pattern with odd characters in a line & alternate star hash in
	 * each line
	 */
	public void starHashCharPyramid() {
		System.out.println(":::::::::::::::::::Start of Method:::::::::::::::::::");

		int noOfLines = 5;
		int noOfSpc = 4;
		int noOfChar = 1;

		System.out.println("Pattern :::: ");
		for (int i = 0; i < noOfLines; i++) {

			for (int k = 1; k <= noOfSpc; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= noOfChar; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				}

				else {
					System.out.print("#");
				}
			}

			noOfSpc--;
			noOfChar = noOfChar + 2;
			System.out.println();
		}
		System.out.println(":::::::::::::::::::End of Method:::::::::::::::::::");
	}
}
