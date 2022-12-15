package patternprogramming;

import java.util.Iterator;

public class SquarePattern {

	public void hollowSquarePattern(int squareSize) {
		String methodName = "hollowSquarePattern";
		System.out.println("::::::::::Start of method " + methodName + "::::::::::");

		for (int i = 0; i < squareSize; i++) {

			for (int j = 0; j < squareSize; j++) {

				if (i == 0 || i == squareSize - 1 
						|| j == 0 || j == squareSize - 1) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

		System.out.println("::::::::::End of method " + methodName + "::::::::::");
	}

	public void zebaLogicSquare(int max) {
		String methodName = "zebaLogicSquare";
		System.out.println("::::::::::Start of method " + methodName + "::::::::::");

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				if (i != 0 &&  i != (max - 1)) {
					if(j == 0 || j == (max - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}

				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("::::::::::End of method " + methodName + "::::::::::");	
	}
}

