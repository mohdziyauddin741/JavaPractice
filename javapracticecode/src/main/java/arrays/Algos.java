package arrays;

import java.util.Arrays;

import hybrid.Hybrid;
import numbers.Numbers;

/**
 * @author Ahmedi
 *
 */
public class Algos {
	
	/**
	 * Searches for an element in an array using binary search algo
	 */
	public int binarySearch(int[] arr, int key) {

		Arrays.sort(arr);
		System.out.println("Sorted Array :::: ");
		Numbers num = new Numbers();
		num.displaySeries(arr);

		int high = arr.length - 1;
		int low = 0;
		int mid = -1;
		int keyLoc = -1;

		boolean isKeyFound = false;

		mid = (high + low) / 2;

		while (!isKeyFound) {

			if (mid == low || mid == high) {
				keyLoc = -1;
				isKeyFound = true;
				System.out.println("No element block");
				System.out.println("************Key ==== " + key + " is not found************");
			}

			else if (arr[mid] < key) {
				low = mid;
				mid = (high + low) / 2;
				System.out.println("Lesser if block");
				System.out.println("High ==== " + high);
				System.out.println("Low  ==== " + low);
				System.out.println("Mid  ==== " + mid);
				// break;
			}

			else if (arr[mid] > key) {
				high = mid;
				mid = (high + low) / 2;
				System.out.println("Higher if block");
			}

			else if (arr[mid] == key) {
				System.out.println("Equal Block");
				keyLoc = mid;
				isKeyFound = true;
				System.out.println("************Key ==== " + key + " is  Found************");
			}
		}

		return keyLoc;
	}

}
