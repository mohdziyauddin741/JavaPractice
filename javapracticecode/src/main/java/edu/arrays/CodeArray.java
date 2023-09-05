package edu.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

import edu.numbers.Numbers;

/**
 * @author Ziya
 *
 */
public class CodeArray {

	Algos algo = new Algos();
	Numbers numbi = new Numbers();

	public int[] firstThreeHighestElements(int[] arr) {
		String methodName = "firstThreeHighestElements()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int[] out = new int[3];
		int temp = -1;

		if (arr.length < 3) {
			System.out.println("Array size is lesser than 3 first 3 highest cannot be found");
			return null;
		}

		out[0] = arr[0];
		out[1] = arr[1];
		out[2] = arr[2];

		for (int i = 0; i < out.length; i++) {
			for (int j = 0; j < out.length - 1; j++) {
				if (out[j] < out[j + 1]) {
					temp = out[j];
					out[j] = out[j + 1];
					out[j + 1] = temp;
				}
			}
		}

		//		System.out.println("out[0] ==== " + out[0]);
		//		System.out.println("out[1] ==== " + out[1]);
		//		System.out.println("out[2] ==== " + out[2]);

		for (int i = 3; i < arr.length; i++) {
			if (out[0] < arr[i]) {
				out[2] = out[1];
				out[1] = out[0];
				out[0] = arr[i];
			}
		}

		System.out.println("First Largest  ==== " + out[0]);
		System.out.println("Second Largest ==== " + out[1]);
		System.out.println("Third Largest  ==== " + out[2]);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return out;
	}


	/** 
	 * Finds the largest / smallest element in the input array
	 * 1 -> smallest
	 * 2 -> largest
	 */
	public int smallestLargestElement(int[] arr, int typeCode) {
		String methodName = "smallestLargestElement()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int result = -1;

		if (arr.length == 0) {
			System.out.println("Array Size is Zero");
			return result;
		}

		else {
			result = arr[0];
		}

		// to find largest element
		if (typeCode == 1) {
			System.out.println("Finding for Largest element");

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > result) {
					result = arr[i];
				}
			}

			System.out.println("Largest element ==== " + result);

		}

		// to find smallest element
		if (typeCode == 2) {
			System.out.println("Finding for Smallest element");

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < result) {
					result = arr[i];
				}
			}

			System.out.println("Smallest element ==== " + result);

		}

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return result;
	}

	public TreeMap<Integer, Integer> countArrayElements(int[] arr) {
		String methodName = "countArrayElements()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");
		int value= 0;
		TreeMap<Integer, Integer> allElements = new TreeMap<Integer, Integer>();
		for (int i : arr) {

			if(allElements.containsKey(i)) {
				value = allElements.get(i);
				value++;
				allElements.put(i, value);
			}

			else {
				allElements.put(i, 1);
			}
			value = 0;
		}
		System.out.println(allElements);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return allElements;
	}

	/**Finds the intersection of two elements
	 * @param arr_1
	 * @param arr_2
	 * @return
	 */
	public int[] arrayIntersection(int[] arr_1, int[] arr_2) {
		String methodName = "arrayIntersection()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int interArrArrSize = Math.min(arr_1.length, arr_2.length); // finding out the maxi size that intermediate array can have
		int p = 0; //points to index of intermediate array interArr
		int m = 0; // points to index of result

		int[] interArr = new int[interArrArrSize];
		int[] result = null;

		Arrays.sort(arr_2); // binary search needs array in sorted form so sorting

		/*
		Algos algoCall = new Algos();
		 int[] resultx = algoCall.binarySearch(interArr, arr_1[0]);
		 */
		/*
		 *  iterating over arr_2 for presence of arr_1 elements in arr_2 using binary search
		 */
		for (int i = 0; i < arr_1.length; i++) {
			if(Arrays.binarySearch(arr_2, arr_1[i]) >= 0) {
				interArr[p++] = arr_1[i];
			}
		}

		p = p - 1;
		result = new int[p + 1];
		for(int elt : interArr) {
			if(m == p + 1) {
				break;
			}
			result[m++] = elt;

		}

		System.out.println("Inter sected array is :::: ");
		ArrayUtil arrUtil = new ArrayUtil();
		arrUtil.displaySeries(result);
		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return result;
	}

	/**
	 * Removes duplicate element
	 */
	public void detectDuplicates(int arr[]) {
		String methodName = "detectDuplicates()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");


		int[] dupIndexes =  new int[arr.length];
		int[] nonDupIndexes =  new int[arr.length];


		int dupIndexesIndex = 0;
		int nonDupIndexesIndex = 0;


		for (int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				//				System.out.println("arr[i] ==== " + arr[i] + ", arr[j] ==== " + arr[j]);
				if (arr[i] == arr[j] /* && arr[j] != -1 */) {
					dupIndexes[dupIndexesIndex++] = j;
					System.out.println(arr[i] + " is duplicate");
					//					arr[j] = -1;
				}
				/*
				else {

					nonDupIndexes[nonDupIndexesIndex++] = j;
					System.out.println(arr[i] + " is unique");

				}
				 */		
			}
		}

		int[] uniqueArray =  new int[arr.length];
		/*
		for (int i = 0; i < uniqueArray.length; i++) {
			uniqueArray[i] = arr[nonDupIndexes[i]];
		}
		 */

		ArrayUtil arrUtil = new ArrayUtil();
		arrUtil.displaySeries(dupIndexes);

		int m = 0;
		for (int i = 0; i < arr.length; i++) {

			Arrays.sort(dupIndexes);
			//			int[] result = algo.binarySearch(dupIndexes, 2);
			//			System.out.println("algo.binarySearch(dupIndexes, 2) ==== " + result.length);
			System.out.println("Arrays.binarySearch(dupIndexes, i) ==== " + Arrays.binarySearch(dupIndexes, i) + " i ==== " + i);
			if (Arrays.binarySearch(dupIndexes, i) < 0) {
				uniqueArray[m++] = arr[i];
				System.out.println("m ==== " + m + "arr[i] ==== " + arr[i] + " uniqueArray[m++] ==== " + uniqueArray[m]);

			}
		}

		arrUtil.displaySeries(uniqueArray);

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		//		return result;
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



}