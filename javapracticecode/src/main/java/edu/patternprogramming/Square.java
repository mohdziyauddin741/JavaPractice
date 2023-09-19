package edu.patternprogramming;

public class Square {

	/**
	 * Print square containing stars
	 * 
	 * @param sqSize
	 */
	public static void starSquared(int sqSize) {
		String methodName = "starSquared";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		for (int i = 0; i < sqSize; i++) {
			for (int j = 0; j < sqSize; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	/**
	 * Prints square in number having increment of number column wise
	 * 
	 * @param sqSize
	 */
	public static void columnWiseAscending(int sqSize) {
		String methodName = "columnWiseAscending";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		for (int i = 1; i <= sqSize; i++) {
			for (int j = 1; j <= sqSize; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	/**
	 * Print square with number having row wise incrementing
	 * 
	 * @param sqSize
	 */
	public static void rowWiseAscending(int sqSize) {
		String methodName = "rowWiseAscending";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		for (int i = 1; i <= sqSize; i++) {
			for (int j = 1; j <= sqSize; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	public static void columnWiseDescending(int sqSize) {
		String methodName = "columnWiseDescending";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		for (int i = sqSize; i >= 1; i--) {
			for (int j = 1; j <= sqSize; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	public static void rowWiseDescending(int sqSize) {
		String methodName = "rowWiseDescending";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		for (int i = 1; i <= sqSize; i++) {
			for (int j = sqSize; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	public static void sqaureNumber(int sqSize) {
		String methodName = "sqaureNumber";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		int count = 1;

		for (int i = 1; i <= sqSize; i++) {
			for (int j = 1; j <= sqSize; j++) {
				// System.out.print(count++ + " ");
				System.out.printf("%2d ", count++);

			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	// pattern 8
	public static void oddNumbersSquare(int sqSize) {
		String methodName = "oddNumbersSquare";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		int count = 1;

		for (int i = 1; i <= sqSize; i++) {
			for (int j = sqSize; j >= 1; j--) {
				System.out.printf("%2d ", count);
				count += 2;
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	// pattern 9
	public static void evenNumbersSquare(int sqSize) {
		String methodName = "oddNumbersSquare";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		int count = 2;

		for (int i = 1; i <= sqSize; i++) {
			for (int j = 1; j <= sqSize; j++) {
				System.out.printf("%2d ", count);
				count += 2;
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	// pattern 9

	public static void rowWiseTables(int sqSize) {
		String methodName = "rowWiseTables";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		int sum = 0;

		for (int i = 1; i <= sqSize; i++) {
			for (int j = 1; j <= sqSize; j++) {
				sum = sum + i;
				System.out.printf("%2d ", sum);
			}
			System.out.println();
			sum = 0;
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

	// pattern 10
	public static void changingColumnSqare(int sqSize) {
		String methodName = "changingColumnSqare";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");

		for (int i = 1; i <= sqSize; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + " " + i + " ");
			}
			System.out.println();
		}

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}

}
