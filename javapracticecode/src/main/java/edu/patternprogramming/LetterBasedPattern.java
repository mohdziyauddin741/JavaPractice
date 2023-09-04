package patternprogramming;

import java.util.Iterator;

public class LetterBasedPattern {
	
	public void squareEToA() {
		char[] descLetterChar = {'E', 'D', 'C', 'B', 'A'};

		for (int i = 0; i < descLetterChar.length; i++) {

			System.out.print(descLetterChar[i] + " ");

			if (i == descLetterChar.length - 1) {
				System.out.println();
			} 
			
			else {
				System.out.print(" ");
			}
	
		}
	}

}
