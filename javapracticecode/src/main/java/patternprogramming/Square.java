package patternprogramming;

public class Square {
	
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

}
