package edu.patternprogramming;

public class Square {
	
	/**Print square containing stars
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
	
	/**Prints square in number having increment of number column wise
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
	
	/**Print square with number having row wise incrementing
	 * @param sqSize
	 */
	public static void rowWiseAscending(int sqSize) {
		String methodName = "rowWiseAscending";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");
		
		for (int i = 1; i <= sqSize; i++) {
			for(int j = 1; j <= sqSize; j++) {
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
			for (int j = 1;  j <= sqSize; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
	}
	

}
