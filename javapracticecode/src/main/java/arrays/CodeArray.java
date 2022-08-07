package arrays;

import java.util.TreeMap;

/**
 * @author Ahmedi
 *
 */
public class CodeArray {

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



















}
