package edu.arrays;

import java.util.Scanner;

public class ArrayUtil {

	Scanner getKeyboardValue = new Scanner(System.in);
	
	/**
	 * Fetches array of type int from keyboard
	 */
	public int[] getSeries() {
		String methodName = "getSeries()";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		int arraySize = -1;
		int[] numSeries = null;

		System.out.println("Enter the size of Array");
		arraySize = getKeyboardValue.nextInt();
		numSeries = new int[arraySize];

		System.out.println("Enter the Array Elements");
		for (int i = 0; i < numSeries.length; i++) {
			numSeries[i] = getKeyboardValue.nextInt();
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
