package strings;

import java.util.Scanner;

public class StringUtil {

	/** Reads a array string
	 * @return
	 */
	public String[] getStringArray() {
		String methodName = "getStringArray()";
		System.out.println("::::::::::::::::::" + methodName + " method start::::::::::::::::::");

		int size = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of String Array");
		size = scan.nextInt();
		String[] strArr = new String[size];

		System.out.println("Enter the string array elements");
		for (int i = 0; i < size; i++) {
			strArr[i] = scan.next();
		}

		scan.close();

		System.out.println("::::::::::::::::::" + methodName + " method end::::::::::::::::::");
		return strArr;
	}

}
