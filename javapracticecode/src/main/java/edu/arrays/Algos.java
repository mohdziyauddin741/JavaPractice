package edu.arrays;

import java.util.Arrays;

import edu.hybrid.Hybrid;
import edu.numbers.Numbers;

/**
 * @author Ahmedi
 *
 */
public class Algos {
	
	ArrayUtil arrUtl = new ArrayUtil();

	/**
	 * Searches for an element in an array using binary search algo
	 */
	public int[] binarySearch(int[] arr, int key) {
		String methodName = "binarySearch";
		System.out.println("::::::::::: " + methodName + " started" + " :::::::::::");

		Arrays.sort(arr);
		System.out.println("Sorted Array :::: ");
		Numbers num = new Numbers();
		arrUtl.displaySeries(arr);

		int high = arr.length - 1;
		int low = 0;
		int mid = -1;
		int k = 0;

		int[] keyLoc = new int[arr.length];

		boolean isKeyFound = false;
		boolean isDuplicate = false;

		mid = (high + low) / 2;

		while (!isKeyFound) {

			if (mid == low || mid == high) {
				keyLoc[0] = -1;
				isKeyFound = true;
				// System.out.println("No element block");
				// System.out.println("************Key ==== " + key + " is not
				// found************");
			}

			else if (arr[mid] < key) {
				low = mid;
				mid = (high + low) / 2;
				// System.out.println("Lesser if block");
				// System.out.println("High ==== " + high);
				// System.out.println("Low ==== " + low);
				// System.out.println("Mid ==== " + mid);
				// break;
			}

			else if (arr[mid] > key) {
				high = mid;
				mid = (high + low) / 2;
				// System.out.println("Higher if block");
			}

			else if (arr[mid] == key) {
				System.out.println("Equal Block");
				keyLoc[0] = mid;
				isKeyFound = true;
				System.out.println("************ Key ==== " + key + " is  Found************");
			}
		}

		do {

			if (isKeyFound && arr[keyLoc[k] + 1] == key) {
				keyLoc[k++] = keyLoc[k] + 1;
				isDuplicate = true;
				System.out.println("Is Key ==== " + key + ",  duplicated >>>> " + isDuplicate + " its location ==== "
						+ k + " in sorted array");
			}

			else
				break;
			
		} while (isDuplicate);

		System.out.println("::::::::::: " + methodName + " end " + " :::::::::::");
		return keyLoc;
	}

}
