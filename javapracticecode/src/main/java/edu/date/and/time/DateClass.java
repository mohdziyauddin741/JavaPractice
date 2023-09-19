package edu.date.and.time;

import java.util.Calendar;
import java.util.Date;

public class DateClass {
	public static boolean validateLeapYear(int year) {
		String methodName = "validateLeapYear";
		System.out.println(":::::::::::::::::::Start of Method " + methodName + ":::::::::::::::::::");
		boolean isLeapYear = false;

		// System.out.println("year % 4 == " + year % 4);
		// System.out.println("year % 100 == " + year % 100);
		// System.out.println("year % 400 == " + year % 400);

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
		}

		System.out.println("Is input year ==== " + year + " ,a leap year >>>> " + isLeapYear);

		System.out.println(":::::::::::::::::::End of Method " + methodName + ":::::::::::::::::::");
		return isLeapYear;
	}
}
