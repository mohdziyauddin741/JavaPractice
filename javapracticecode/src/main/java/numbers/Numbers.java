package numbers;

import java.util.Scanner;

/**
 * @author Mohd Ziyauddin
 *
 */
public class Numbers {

	Scanner scanKeyboard = new Scanner(System.in);

	/**
	 * Prints fibnocci series of size passed as argument to the method
	 */
	public void fibnocci(int length) {
		System.out.println(":::::::::::::::::::Start of Method:::::::::::::::::::");
		long f1 = 0;
		long f2 = 1;
		long f3 = -1;

		if (length >= 2) {
			length = length - 2; // calculating iteration length
			System.out.print(f1 + "\t" + f2 + "\t"); // printing first two element of fibnocci series
		}

		else {
			if (length < 0) {
				System.out.println("Invalid fibnocci length passed");
			}

			if (length == 0) {
				System.out.println("Length is zero");
			}

			if (length == 1) {
				System.out.println(f1);
				length = 0; // making it zero to bypass loop
			}
		}

		for (int i = 0; i < length; i++) {
			try {
				f3 = Math.addExact(f1, f2); // calculation current iteration fibnocci number
			}

			catch (Exception exe) {
				System.out.println("\nAt element = " + i + 1);
				exe.printStackTrace();
				break;
			}

			if (i % 5 == 0) {
				System.out.println();
			}

			System.out.print(f3 + "\t");
			f1 = f2; // re-initializing for next iteration
			f2 = f3;
		}
		System.out.println(":::::::::::::::::::End of Method:::::::::::::::::::");
	}

	/**
	 * Swaps two number without using third variable
	 */
	public int[] swapWithoutThirdVar(int num_a, int num_b) {
		String methodName = "swapWithoutThirdVar";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		System.out.println("Before swapping num_a ==== " + num_a + " , num_b ==== " + num_b);

		int[] out = new int[2];
		num_b = num_a + num_b;
		num_a = num_b - num_a;
		num_b = num_b - num_a;

		out[0] = num_a;
		out[1] = num_b;

		System.out.println("After swapping num_a ==== " + out[0] + " , num_b ==== " + out[1]);

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return out;
	}

	/**
	 * Validates weather the inserted number is prime number or not
	 */
	public boolean validateIsPrimeNo(int num) {
		String methodName = "validateIsPrimeNo";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		boolean isPrimeNo = true;

		if (num == 0 || num == 1) {
			isPrimeNo = false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrimeNo = false;
			}
		}

		System.out.println("Prime Number validation for number ==== " + num + ", status >>>> " + isPrimeNo);

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return isPrimeNo;
	}

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
