package JavaTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MonthDayClass {

	// MonthDay is an immutable date-time object that represents the combination of
	// a month and day-of-month.
	// This class does not store or represent a year, time or time-zone.
	// https://docs.oracle.com/javase/8/docs/api/java/time/MonthDay.html

	public static void main(String[] args) {
		// looking for current dates

		MonthDay today = MonthDay.now(); // default time-zone
		System.out.println("Current date: " + today);

		today = MonthDay.now(ZoneId.of("Europe/Paris")); // time-zone as parameter
		System.out.println("Current date: " + today + "\n");

		// we need a year!!!

		LocalDate todayYear = today.atYear(2021);
		System.out.println("Current date: " + todayYear  + "\n");

		// now formatting
		
		String todayFormat = today.format(DateTimeFormatter.ofPattern("dd.MM"));
		System.out.println("Current date: " + todayFormat);

		String todayYearFormat = todayYear.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("Current date: " + todayYearFormat + "\n");

		// getting month & day

		int month = today.getMonthValue();
		System.out.println("Current month: " + month);

		Month monthEnum = today.getMonth();
		System.out.println("Current month: " + monthEnum);

		int day = today.getDayOfMonth();
		System.out.println("Current day: " + day + "\n");

		// comparison

		MonthDay endOfJumpStart = MonthDay.parse("--06-23");
		boolean comparison = endOfJumpStart.equals(today);
		System.out.println("Comparison result: " + comparison);

	}

}
