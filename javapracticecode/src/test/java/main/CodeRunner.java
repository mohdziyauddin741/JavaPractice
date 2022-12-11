package main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import arrays.Algos;
import arrays.CodeArray;
import collections.CodeCollections;
import company.interviews.NykaRound1;
import numbers.Numbers;
import strings.CodeStrings;
import strings.StringUtil;

/**
 * @author Mohammed Ziyauddin
 *
 */
public class CodeRunner {

	public static void main(String[] args) {
		System.out.println("::::::::::::::::::: Welcome :::::::::::::::::::");

		String[] strArr = null;
		// String str = "Myth";
		String str = "";
		//		String inputStr = "";
		//		String outputStr = "";
		//		String sentence = "";
		//		String revSentResult = "";
		//		String strWithoutDupChr = "";
		//		String caseResult = "";
		//		String caseInputStr = "";
		//		String anaStr1 = "";
		//		String anaStr2 = "";
		//		String inputStrRemoveChr = "";
		//		String inputChrRemChr = "";
		//		String inputCaseTye = "";
		String lengthStr = "";



		int[] chrStatistics = new int [5];
		// int[] val = new int[2];
		int[] numArray = {};
				int num = -1;
		//		int arrSize = -1;
		//		int toBeSearchedElement = -1;
		//		int index = -1;
		//		int caseSelected = -1;
		//		int caseCheckResult = -1;
		//		int largestResult = -1;
		//		int smallestResult = -1;
		//		int endType = -1;
		int lengthResult = -1;
		int size = 0;



		// boolean vowelResult = false;
		// boolean isPrimeNoResult = false;
		// boolean isNumSeriesOnlyOdd = false;
		boolean palindromeResult = false;
		boolean anagramResult = false;
		boolean isArmstongNumResult = false;

		Scanner scanner = new Scanner(System.in);
		Numbers numbi = new Numbers();
		CodeStrings codeStr = new CodeStrings();
		Algos algo = new Algos();
		NykaRound1 nyka = new NykaRound1();
		CodeArray codeArr = new CodeArray();
		StringUtil strUtil = new StringUtil();

		TreeSet<Character> dupChrResult = new TreeSet<Character>();
		TreeMap<Character, Integer> dupChrCount = new TreeMap<Character, Integer>();

		// Fibnocci fib = new Fibnocci();
		// fib.fibnocci(5000);

		// String result = codeStr.reverseString(str);
		// System.out.println("Reversed string of " + str + " ==== " + result);

		// code to check weather string contains vowel or not
		// vowelResult = codeStr.doesStringContainsVowel(str);
		// System.out.println("Does word ==== " + str + ", contains vowel >>>> " +
		// vowelResult);

		// code to swap two numbers without third variable
		// val = numbi.swapWithoutThirdVar(24, 35);
		// System.out.println("Swapped values are :::: val_1 ==== " + val[0] + ", val_2
		// ==== " + val[1]);

		// code to check weather number is prime or not
		/*
		System.out.println("Enter the Number");
		num = scanner.nextInt();
		isPrimeNoResult = numbi.validateIsPrimeNo(num);
		System.out.println("Is number ==== " + num + ", Prime No >>>> " + isPrimeNoResult);
		 */
		
		// code to validate the entered number is Armstrong No
		System.out.println("Enter the Number for Armststrong validation");
		num = scanner.nextInt();
		isArmstongNumResult = numbi.checkArmstrongNum(num);
		System.out.println("Is " + num + " an Armstrong number >>> " + isArmstongNumResult);

		// main code to check weather all elements in the array are odd or not
		/*
		int[] numbers = numbi.getSeries();
		isNumSeriesOnlyOdd = numbi.checkSeriesIsOdd(numbers);
		System.out.println("Displaying array :::: ");
		numbi.displaySeries(numbers);
		System.out.println("Are all elements in the above displayed array odd >>>> " + isNumSeriesOnlyOdd);
		 */

		/*
		// code to check string is palindrome or not
		System.out.println("Enter the String");
		inputStr = scanner.next();
		palindromeResult = codeStr.verifyPalindrome(inputStr);
		System.out.println("Palindrome verification result for inputStr ==== " + inputStr + ", result >>>> " + palindromeResult);
		 */

		/*		
		// code to remove the spaces in the String
		System.out.println("Enter the String");
		inputStr = scanner.nextLine();
		outputStr = codeStr.expelSpacesInString(inputStr);
		System.out.println("inputStr ==== '" + inputStr + "' without spaces ==== " + outputStr);
		 */

		/*
		// To sort an array
		numArray = numbi.getSeries();
		Arrays.sort(numArray);
		numbi.displaySeries(numArray);
		 */

		/*
		// Find the largest element
		numArray = numbi.getSeries();
		System.out.println("Enter 1 to search for Largest Element");
		System.out.println("Enter 2 to search for Smallest Element");
		endType = scanner.nextInt();
		smallestResult = codeArr.smallestLargestElement(numArray, endType);
		 */

		/*
		// Binary Search Algo Implementation
		numArray = numbi.getSeries();
		System.out.println("Enter the element to be searched");
		toBeSearchedElement = scanner.nextInt();
		index = algo.binarySearch(numArray, toBeSearchedElement);
		 */

		// prints Pyramid pattern with alternate line having odd character & are star / hash
		// nyka.starHashCharPyramid();

		/*
		// break sentence into its words
		System.out.println("Input the Sentence to be splitted into words :::: ");
		sentence = scanner.nextLine();
		codeStr.splitSentence(sentence);
		 */

		/*
		// reversed sentence word wise
		System.out.println("Input the Sentence to be reversed :::: ");
		sentence = scanner.nextLine();
		revSentResult = nyka.reverseSentenceWords(sentence);
		 */ 

		/*
		// Duplicate character list
		System.out.println("Enter the String");
		inputStr = scanner.nextLine();
		dupChrResult = codeStr.getDuplicateChrInStr(inputStr);
		 */

		/*
		// Duplicate character list with count
		System.out.println("Enter the String");
		inputStr = scanner.nextLine();
		dupChrCount = codeStr.dupChrWithCountInStr(inputStr);
		 */

		/*
		// Returning string without duplicate characters
		System.out.println("Enter the String in which duplicate characters to be removed");
		inputStr = scanner.nextLine();
		strWithoutDupChr = codeStr.removeDuplicateChrInStr(inputStr);
		 */

		/*
		// Finding first, second & third highest in an array
		numArray = numbi.getSeries();
		codeArr.firstThreeHighestElements(numArray);
		 */

		// duplicate repeat
		/*
		numArray = numbi.getSeries();
		codeArr.countArrayElements(numArray);
		 */

		/*
		// test code to check weather delete works or not
		CodeCollections codeColl = new CodeCollections();
		codeColl.testCollectionDelete();
		 */

		/*
		// to convert string from one case to another case
		System.out.println("Enter 1 to convert to Upper Case");
		System.out.println("Enter 2 to convert to Lower Case");
		caseSelected = scanner.nextInt();
		System.out.println("Input the String whose case needs to be converted");
		caseInputStr = scanner.next();
		caseResult = codeStr.strCaseConverter(caseSelected, caseInputStr);
		 */

		/*
		// Test weather two strings entered are anagram
		System.out.println("Enter first string for anagram test");
		anaStr1 = scanner.next();
		System.out.println("Enter second string for anagram test");
		anaStr2 = scanner.next();
		anagramResult = codeStr.verifyIsAnagram(anaStr1, anaStr2);
		 */

		/*
		// eliminating a character from the string
		System.out.println("Enter the string in which character is to be removed");
		inputStrRemoveChr = scanner.next();
		System.out.println("Enter the character to be removed");
		inputChrRemChr = scanner.next();
		inputChrRemChr = codeStr.removeChrInStr(inputStrRemoveChr, inputChrRemChr.charAt(0));
		 */

		/*
		// to check the character type in the string
		System.out.println("Enter the string for which case check to be made");
		inputChrRemChr = scanner.next();
		caseCheckResult = codeStr.findStrCase(inputChrRemChr);
		System.out.println("Case type code ==== " + caseCheckResult);
		 */

		/*
		// to fetch the character count in a string
		System.out.println("Enter the string whose length is be finded");
		lengthStr = scanner.next();
		lengthResult = codeStr.findStringLength(lengthStr);
		 */
		
		// to get the unique elements in an string
		/*
		System.out.println("Enter the string in which unique characters to be detected");
		str = scanner.nextLine();
		codeStr.getUniqueElements(str);
		*/
		
		/*		
		// character type statistics in a string
		System.out.println("Enter the string whose statistics to be founded");
		str = scanner.nextLine();
		chrStatistics = codeStr.chrTypeCounter(str);
		 */

		/*
		// string array to string conversion
		strArr = strUtil.getStringArray();
		str = codeStr.convertStrArrToStr(strArr);
		 */

		/*
		// to find the intersection of two arrays
		int[] num_1 = numbi.getSeries();
		int[] num_2 = numbi.getSeries();
		codeArr.arrayIntersection(num_1, num_2);
		 */

		/*
		// to find duplicate elements
		int[] num_1 = numbi.getSeries();
		codeArr.detectDuplicates(num_1);
		System.out.println(" Exit ");
		 */
	}
}
