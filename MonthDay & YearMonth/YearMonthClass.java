package JavaTime;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthClass {

	// YearMonth is an immutable date-time object that represents the combination of
	// a year and month.
	// This class does not store or represent a day, time or time-zone.
	// https://docs.oracle.com/javase/8/docs/api/java/time/YearMonth.html

	public static void main(String[] args) {

		YearMonth today = YearMonth.now(); // default time-zone
		System.out.println("Current month & year: " + today);

		// now formatting

		String todayFormat = today.format(DateTimeFormatter.ofPattern("MM.yyyy"));
		System.out.println("Current month & year: " + todayFormat + "\n");

		// getting month & year

		int month = today.getMonthValue();
		System.out.println("Current month: " + month);

		Month monthEnum = today.getMonth();
		System.out.println("Current month: " + monthEnum);

		int year = today.getYear();
		System.out.println("Current year: " + year + "\n");

		// leapYear or not

		boolean leapYear = today.isLeapYear();
		if (leapYear) {
			System.out.println("Current year " + year + " is a leap Year.");
		} else {
			System.out.println("Current year " + year + " is not a leap Year.");
		}

		// how long is the current month

		int monthLength = today.lengthOfMonth();
		System.out.println("Current month " + monthEnum + " is " + monthLength + " days long");

		// how long is the year

		int yearLength = today.lengthOfYear();
		System.out.println("Current year " + year + " is " + yearLength + " days long \n");
	}

}
