package strings;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import hybrid.Hybrid;
import numbers.Numbers;

public class CodeStrings {

	/**
	 * reverses the string passed into the method
	 */
	public String reverseString(String inputStr) {
		String methodName = "reverseString";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String revStr = "";

		if (inputStr == null) {
			throw new IllegalArgumentException("input string is null");
		}

		else if (inputStr.length() == 0) {
			throw new IllegalArgumentException("input string has zero character count");
		}

		char[] inputStrInChar = inputStr.toCharArray();

		for (int i = inputStrInChar.length - 1; i >= 0; i--) {
			revStr = revStr + inputStrInChar[i];
		}

		System.out.println("Reversed string ==== " + revStr);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return revStr;
	}

	/**
	 * Checks weather the argumently passed string contains vowel character or not
	 * 
	 * @param inputStr string in which vowel check to be made
	 * @return
	 */

	public boolean doesStringContainsVowel(String inputStr) {
		String methodName = "doesStringContainsVowel";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		boolean isVowelPresent = false;

		char[] inputStrInChar = inputStr.toCharArray();

		for (int i = 0; i < inputStrInChar.length; i++) {
			/*
			 * if (isVowelPresent) { break; }
			 */
			switch (inputStrInChar[i]) {

			case 'a':
				if (!isVowelPresent) {
					isVowelPresent = true;
				}
				System.out.println("Vowel is preset at index ==== " + (i + 1) + ", vowel character ==== " + 'a');
				break;

			case 'e':
				if (!isVowelPresent) {
					isVowelPresent = true;
				}
				System.out.println("Vowel is preset at index ==== " + (i + 1) + ", vowel character ==== " + 'e');
				break;

			case 'i':
				if (!isVowelPresent) {
					isVowelPresent = true;
				}
				System.out.println("Vowel is preset at index ==== " + (i + 1) + ", vowel character ==== " + 'i');
				break;

			case 'o':
				if (!isVowelPresent) {
					isVowelPresent = true;
				}
				System.out.println("Vowel is preset at index ==== " + (i + 1) + ", vowel character ==== " + 'o');
				break;

			case 'u':
				if (!isVowelPresent) {
					isVowelPresent = true;
				}
				System.out.println("Vowel is preset at index ==== " + (i + 1) + ", vowel character ==== " + 'u');
				break;
			}
		}

		System.out.println("Is vowel present in word ==== " + inputStr + ", status >>>> " + isVowelPresent);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return isVowelPresent;
	}

	/**
	 * Checks weather string is palindrome or not
	 */
	public boolean verifyPalindrome(String str) {
		String methodName = "verifyPalindrome()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String strInLowerCase = "";

		boolean isPalindrome = true;

		strInLowerCase = str.toLowerCase();

		for (int i = 0; i < strInLowerCase.length(); i++) {
			if (strInLowerCase.charAt(i) != strInLowerCase.charAt(strInLowerCase.length() - i - 1)) {
				isPalindrome = false;
			}
		}
		System.out.println("Is string ==== " + str + ", palindrome >>>> " + isPalindrome);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return isPalindrome;
	}

	public String expelSpacesInString(String str) {
		String methodName = "expelSpacesInString()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int spaceCount = 0;

		String noSpaceStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ' && str.charAt(i) != '\t') {
				noSpaceStr = noSpaceStr + str.charAt(i);
			}

			else {
				spaceCount++;
			}

		}

		System.out.println("String ==== '" + str + "', after removing spaces ==== " + noSpaceStr);
		System.out.println("Number of whitespaces ==== " + spaceCount);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return noSpaceStr;
	}

	public String[] splitSentence(String str) {
		String methodName = "splitSentence()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String temp = "";
		ArrayList<String> strArrLst = new ArrayList<String>();

		boolean isSpcSeen = false;

		for (int i = 0; i < str.length(); i++) {

			if (i == (str.length() - 1)) {
				temp = temp + str.charAt(i);
				strArrLst.add(temp);
				temp = "";
			}

			if (str.charAt(i) == ' ' || str.charAt(i) == '\t') {
				if (temp.length() == 0) {
					continue;
				}
				strArrLst.add(temp);
				temp = "";
			}

			else {
				isSpcSeen = false;
				temp = temp + str.charAt(i);
			}
		}

		System.out.println("strArrLst.size() ====" + strArrLst.size());
		System.out.println("strArrLst ==== " + strArrLst);

		String[] strArr = new String[strArrLst.size()];

		for (int i = 0; i < strArrLst.size(); i++) {
			strArr[i] = strArrLst.get(i);
		}

		System.out.println("strArr :::: ");
		for (String string : strArr) {
			System.out.print(string);
		}

		System.out.println();

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return strArr;
	}

	/**
	 * Returns the duplicate characters present in a string
	 */
	public TreeSet<Character> getDuplicateChrInStr(String str) {
		String methodName = "getDuplicateChrInStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int count = 0;
		TreeSet<Character> dupChr = new TreeSet<Character>();

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					dupChr.add(str.charAt(i));
					System.out.println("Duplicate Character ==== " + str.charAt(i) + " , at index ==== " + j);
					count++;
				}
			}
		}

		System.out.println("All duplicate characters are ==== " + dupChr);
		System.out.println("Total no of duplicate characters ==== " + count);

		/*
		 * TreeSet<Character> dupChr = new TreeSet<Character>(); char currentChr;
		 * 
		 * str = str.toLowerCase();
		 * 
		 * for (int i = 0; i < str.length() - 1; i++) { currentChr = str.charAt(i); if
		 * (str.indexOf(currentChr, i + 1) != -1) {
		 * System.out.println("Duplicate Character ==== " + currentChr +
		 * " , at index ==== " + i); dupChr.add(currentChr); } }
		 * 
		 * System.out.println("All duplicate characters are ==== " + dupChr);
		 */

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return dupChr;
	}

	/**
	 * Returns duplicate characters with count
	 */
	public TreeMap<Character, Integer> dupChrWithCountInStr(String str) {
		String methodName = "dupChrWithCountInStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		TreeMap<Character, Integer> dupChrCount = new TreeMap<Character, Integer>();
		int val = 1;
		char targetChar;

		str = str.toLowerCase();
		// System.out.println("str ==== " + str);

		for (int i = 0; i < str.length(); i++) {

			targetChar = str.charAt(i);

			if (dupChrCount.containsKey(targetChar)) {
				continue;
			}

			for (int j = i + 1; j < str.length(); j++) {

				if (targetChar == str.charAt(j)) {

					if (dupChrCount.containsKey(targetChar)) {
						val = dupChrCount.get(targetChar);
						dupChrCount.put(targetChar, ++val);
						System.out.println("targetChar ==== " + targetChar + " , occurence val ==== " + val);
					}

					else {
						dupChrCount.put(targetChar, 2);
						System.out.println("targetChar ==== " + targetChar + " , first occurence");
					}

				}
			}
		}

		System.out.println("Duplicate character count ::::: " + dupChrCount);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return dupChrCount;
	}

	/**
	 * Returns string after eliminating duplicate characters from the input string
	 */
	public String removeDuplicateChrInStr(String str) {
		String methodName = "removeDuplicateChrInStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String strNoDuplicateChr = "";

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (strNoDuplicateChr.indexOf(str.charAt(i)) == -1) {
				strNoDuplicateChr = strNoDuplicateChr + str.charAt(i);
			}

		}

		System.out
		.println("Input string ==== " + str + " , without dublicate characters are ==== " + strNoDuplicateChr);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return strNoDuplicateChr;
	}

	/**
	 * Converts string from one case to another case 
	 * 1 -> upper case 
	 * 2 -> lower case
	 */
	public String strCaseConverter(int targetCase, String str) {
		String methodName = "strCaseConverter()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String out = "";
		String caseName = "";

		boolean isNoBlock = true;

		// gives meaning to codes
		if (targetCase == 1) {
			caseName = "Upper Case";
		}

		else if (targetCase == 2) {
			caseName = "Lower Case";
		}

		else {
			System.out.println("Invalid case type passed as argument");
			return null;
		}

		for (int i = 0; i < str.length(); i++) {

			// converts to upper case
			if (targetCase == 1 && str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				out = out + (char) ((int) (str.charAt(i)) - 32);
				isNoBlock = false;
				// System.out.println("i ==== " + i + ", upper case block out ==== " + out);
			}

			/*
			if (targetCase == 1 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				out = out + str.charAt(i);
			}
			 */

			// converts to lower case
			if (targetCase == 2 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				out = out + (char) ((int) (str.charAt(i)) + 32);
				isNoBlock = false;
				// System.out.println("i ==== " + i + ", lower case block out ==== " + out);
			}

			/*
			if (targetCase == 2 && str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				out = out + str.charAt(i);
			}
			 */

			if (isNoBlock) {
				out = out + str.charAt(i);
				// System.out.println("i ==== " + i + ", in no block block out ==== " + out);
			}

			isNoBlock = true;

		}

		System.out.println(str + " in " + caseName + " ==== " + out);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return out;
	}

	/**
	 * Checks weather the two input strings are anagram or not
	 */
	public boolean verifyIsAnagram(String anagStr1, String anagStr2) {
		String methodName = "verifyIsAnagram()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		boolean out = true;
		char str2Char;
		String reason = "";
		ArrayList<Character> mismatchChar = new ArrayList<Character>();

		anagStr1 = anagStr1.toLowerCase();
		anagStr2 = anagStr2.toLowerCase();

		if (anagStr1.length() == anagStr2.length()) {

			for (int i = 0; i < anagStr1.length(); i++) {
				str2Char = anagStr2.charAt(i);
				if (anagStr1.indexOf(str2Char) == -1) {
					if (out) {
						out = false;
						reason = "characters are mismatching";
					}
					mismatchChar.add(str2Char);
				}
			}
		}

		else {
			out = false;
			reason = "lengths are unequal";
		}

		System.out.println("Is '" + anagStr1 + "' & '" + anagStr2 + "' anagram >>>> " + out);

		if (!out) {
			System.out.println("Reason ==== " + reason);
		}

		if (!out && reason.equalsIgnoreCase("characters are mismatching")) {
			System.out.println("Mismatch character in second string ==== " + mismatchChar);
		}

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return out;
	}

	/**
	 * Removes a character from the input string
	 */
	public String removeChrInStr(String targetStr, char targetChr) {
		String methodName = "removeChrInStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");	

		String out = "";

		// fetches the index of character present in the target string
		Set<Integer> positions = findChrOccurencesInStr(targetStr, targetChr);

		// checks weather the target character is present in target string or not
		if (positions.size() == 0) {
			System.out.println("Warning :::: The target character is not present in the target string");
			System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
			return null;
		}

		// iterates to eliminate the character in the target string
		for (int i = 0; i < targetStr.length(); i++) {

			// includes only character other than elimination character
			if(positions.contains(i) == false) {
				out = out + targetStr.charAt(i);
			}

		}

		System.out.println("Input string ==== " + targetStr + " , post eliminating character ==== " + targetChr + " , is " + out);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return out;
	}

	/**
	 * Gives the occurrences of a character in string
	 */
	public Set<Integer> findChrOccurencesInStr(String targetStr, char targetChr) {
		String methodName = "findChrOccurencesInStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		TreeSet<Integer> occurences = new TreeSet<Integer>();

		boolean isLoopContinued = true;

		int startPoint = 0;
		int occurrencePointer = -1;

		do {

			if (targetStr.indexOf(targetChr, startPoint) != -1) {
				occurrencePointer = targetStr.indexOf(targetChr, startPoint);
				occurences.add(occurrencePointer);
				startPoint = occurrencePointer + 1;
			}

			else {
				isLoopContinued = false;
			}

		} while (isLoopContinued);

		if (occurences.size() == 0) {
			System.out.println("No occurences of character ==== " + targetChr + 
					" in string ==== " + targetStr + " is found");
		}

		else {
			System.out.println("Number of occurrences of character ==== " + targetChr 
					+ " are ==== " + occurences.size());
			System.out.println("Occurrences of character ==== " + targetChr + " are :::: " + occurences);
		}

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return occurences;
	}

	/**
	 * Checks the case type in input string
	 *
	 * caseCode :-
	 * 	0 -> all are in lower case
	 *  1 -> all are in upper case
	 *  2 -> both upper & lower case
	 */
	public int findStrCase(String targetStr) {
		String methodName = "findStrCase()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int caseCode = -1;

		boolean isUpperCase = false;
		boolean isLowerCase = false;

		if (targetStr.isEmpty() || targetStr == null) {
			System.out.println("Input string is either empty or null");
			return caseCode;
		}

		for (int i = 0; i < targetStr.length(); i++) {

			// checks weather any character is upper case or not
			if (targetStr.charAt(i) >= 'A' && targetStr.charAt(i) <= 'Z' && isUpperCase == false) {
				isUpperCase = true;
			}

			// checks weather any character is lower case or not
			if (targetStr.charAt(i) >= 'a' && targetStr.charAt(i) <= 'z' && isLowerCase == false) {
				isLowerCase = true;
			}

		}

		// assigns the code for the case type
		if (isLowerCase == true && isUpperCase == false) {
			caseCode = 0;
			System.out.println("All characters / character are in lower case");
		}

		else if (isLowerCase == false && isUpperCase == true) {
			caseCode = 1;
			System.out.println("All characters / character are in upper case");
		}

		else if (isLowerCase && isUpperCase) {
			caseCode = 2;
			System.out.println("Characters are both in upper case & lower case");
		}

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return caseCode;
	}

	public int findStringLength(String targetString) {
		String methodName = "findStrCase()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int i = 0;
		int noOfChars = 0;

		try {
			while (targetString.indexOf(targetString.charAt(i)) != -1) {
				noOfChars++;
				i++;
				//				System.out.println("i ==== " + i + " , noOfChars ==== " + noOfChars);
			}
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println("End of string reached");
		}

		catch (Exception exe) {
			exe.printStackTrace();
		}

		System.out.println("No of characters in " + targetString + " ==== " + noOfChars);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return noOfChars;
	}

	/**variantCharacter definition 
	 * 0 -> vowels
	 *  1 -> consonants
	 *  2 -> numbers
	 *  3 -> space
	 *  4 -> special character
	 */
	public int[] chrTypeCounter(String targetStr) {
		String methodName = "findStrCase()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");
		int[] variantCount = {0, 0, 0, 0, 0};

		boolean isVowel = false;

		for (int i = 0; i < targetStr.length(); i++) {

			if (targetStr.charAt(i) == 'a' || targetStr.charAt(i) == 'A'
					||	targetStr.charAt(i) == 'e' || targetStr.charAt(i) == 'E'
					||	targetStr.charAt(i) == 'i' || targetStr.charAt(i) == 'I'
					||	targetStr.charAt(i) == 'o' || targetStr.charAt(i) == 'O'
					||	targetStr.charAt(i) == 'u' || targetStr.charAt(i) == 'U') {
				variantCount[0]++;
				//				System.out.println("i ==== " + i + ", character ==== " + targetStr.charAt(i) + " is vowel");
				isVowel = true;
			}

			else if (!isVowel && Character.isAlphabetic(targetStr.charAt(i))) {
				variantCount[1]++;
				//				System.out.println("i ==== " + i + ", character ==== " + targetStr.charAt(i) + " is consonants");
			}

			else if (Character.isDigit(targetStr.charAt(i))) {
				variantCount[2]++;
				//				System.out.println("i ==== " + i + ", character ==== " + targetStr.charAt(i) + " is digit");
			}


			else if (targetStr.charAt(i) == ' ') {
				variantCount[3]++;
				//				System.out.println("i ==== " + i + ", character ==== " + targetStr.charAt(i) + " is space");

			}

			else {
				variantCount[4]++;
				//				System.out.println("i ==== " + i + ", character ==== " + targetStr.charAt(i) + " is special character");
			}
			isVowel = false;
		}

		System.out.println("Input String ===== " + targetStr + " character statistics");
		System.out.println("Number of Vowels            ==== " + variantCount[0]);
		System.out.println("Number of Consonant         ==== " + variantCount[1]);
		System.out.println("Number of Numbers           ==== " + variantCount[2]);
		System.out.println("Number of Spaces            ==== " + variantCount[3]);
		System.out.println("Number of Special Character ==== " + variantCount[4]);


		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return variantCount;
	}

	public int countNoOfWords(String sentence) {
		String methodName = "countNoOfWords()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int noOfWords = 0;

		boolean isSpaceFound = false;
		/*
		 * for (int i = 0; i < sentence.length(); i++) { if (sentence.charAt(i) == ' '
		 * || sentence.charAt(i) == '/t' && !isSpaceFound) { noOfWords } }
		 */

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return 0;
	}

	public String convertStrArrToStr(String[] target) {
		String methodName = "convertStrArrToStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");
		String str = "";

		for (int i = 0; i < target.length; i++) {
			str = str + target[i] + ";";
		}

		System.out.println("conversion result ==== " + str);
		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return str;
	}

	/**Finds the non - repeating characters in the string
	 * @param inputStr
	 * @return
	 */
	public String getUniqueElements(String inputStr) {
		String methodName = "getUniqueElements()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String uniqueChr = "";

		boolean isUnique = true;

		for (int i = 0; i < inputStr.length(); i++) {

			isUnique = true;

			for(int j = 0; j < inputStr.length(); j++) {

				if(inputStr.charAt(i) == inputStr.charAt(j) && i != j) {
					isUnique = false;
				}

			}

			if(isUnique) {
				System.out.println("Unique character ====" + inputStr.charAt(i));
				uniqueChr = uniqueChr + inputStr.charAt(i);
			}

		} 

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return uniqueChr;
	}

	/**Removes junk characters from the string
	 * @param inputStr
	 * @return
	 */
	public String removeUnwantedChrInStr(String inputStr) {
		String methodName = "removeUnwantedChrInStr()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		String filteredStr = "";

		filteredStr = inputStr.replaceAll("[^a-zA-Z0-9]", "");


		/* start ziya
		for (int i = 0; i < inputStr.length(); i++) {

		String filteredStr = "";
		String junkStr = "";

			// if (Character.isLetter(inputStr.charAt(i))) {\
			if ((inputStr.charAt(i) >= 'A' && inputStr.charAt(i) <= 'Z')
					|| (inputStr.charAt(i) >= 'a' && inputStr.charAt(i) <= 'z')) {
				filteredStr = filteredStr + inputStr.charAt(i);
				// System.out.println("chr ==== " + inputStr.charAt(i) + " at position i ==== "
				// + i +" is alphabetic");
			}

			else if (inputStr.charAt(i) >= '0' && inputStr.charAt(i) <= '9') {
				filteredStr = filteredStr + inputStr.charAt(i);
				// System.out.println("chr ==== " + inputStr.charAt(i) + " at position i ==== "
				// + i +" is digit");
			}

			else {
				junkStr = junkStr + inputStr.charAt(i);
				// System.out.println("chr ==== " + inputStr.charAt(i) + " at position i ==== "
				// + i +" is neither alphabet nor digit");
			}

		}*/ // end ziya

		System.out.println("Given String ===== " + inputStr);
		System.out.println("Filtered String ===== " + filteredStr);
//		System.out.println("Junk String ===== " + junkStr);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return filteredStr;
	}

}
