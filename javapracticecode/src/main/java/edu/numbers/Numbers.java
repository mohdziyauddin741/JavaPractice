package edu.numbers;

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

	/**Checks weather the  number is am armstrong number
	 * @param num
	 * @return
	 */
	public boolean checkArmstrongNum(int num) {
		String methodName = "checkArmstrongNum()";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		boolean isArmstrongNo = false;
		int digit = 0;
		int cubeResult = 0;

		int numpreserved = num;

		System.out.println("num ==== " + num);

		while (num != 0) {
			digit = num % 10;
			cubeResult = cubeResult + digit * digit * digit;
			num = num / 10;
		}
		System.out.println("cubeResult ====" + cubeResult);

		if (cubeResult == numpreserved) {
			isArmstrongNo = true;
		}

		System.out.println("Is num ==== " + numpreserved + "  an Armstrong number >>>> " + isArmstrongNo);

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return isArmstrongNo;
	}

	/**Checks  weather the integer is palindrome or not
	 * @param num
	 * @return
	 */
	public boolean checkIsNoPalindrome(int num) {
		String methodName = "checkIsNoPalindrome()";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		boolean isNoPalindrome = false;

		int digit = 0;
		int revNo = 0;
		int number = num;

		while (num != 0) {
			digit = num % 10;
			revNo = revNo * 10 + digit;
			num = num / 10;
		}

		if (number == revNo) {
			isNoPalindrome = true;
		}

		System.out.println("actual No ==== " + number);
		System.out.println("reversed No ==== " + revNo);
		System.out.println("Is No palindrome ==== " + isNoPalindrome);

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return isNoPalindrome;
	}
}
