package arrays;

import java.util.Scanner;

public class ArrayUtil {
	
	Scanner scanKeyboard = new Scanner(System.in);
	
	/**
	 * Checks weather the passed array has only odd numbers
	 * 
	 * @param numList : Array of type int
	 * @return
	 */
	public boolean checkSeriesIsOdd(int[] numList) {
		String methodName = "checkSeriesIsOdd";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		boolean isElementEven = false;

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] % 2 == 0) {
				System.out.println("Even number at index ==== " + i + " value ==== " + numList[i]);
				if (!isElementEven) {
					isElementEven = true;
				}
			}
		}

		System.out.println("Does the number series contains only odd number >>>> " + !isElementEven);

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return !isElementEven;
	}

	/**
	 * Fetches array of type int from keyboard
	 */
	public int[] getSeries() {
		String methodName = "getSeries()";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		int arraySize = -1;
		int[] numSeries = null;

		System.out.println("Enter the size of Array");
		arraySize = scanKeyboard.nextInt();
		numSeries = new int[arraySize];

		System.out.println("Enter the Array Elements");
		for (int i = 0; i < numSeries.length; i++) {
			numSeries[i] = scanKeyboard.nextInt();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return numSeries;
	}

	/**
	 * Displays array on console
	 */
	public void displaySeries(int[] numSeries) {
		String methodName = "displaySeries()";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		System.out.println("Array size ==== " + numSeries.length);
		System.out.println("Array :---");
		for (int i = 0; i < numSeries.length; i++) {
			System.out.print(numSeries[i] + "\t");
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

}
