package com.judy;

/*
 * https://docs.oracle.com/javase/8/docs/api/
 * 
 * Calendar class: provides methods for manipulating dates with the help of calendar fields
 */
import java.util.Calendar; //abstract class -> extends Object, belongs to java.util package
import java.util.GregorianCalendar; //direct subclass
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalenderClass {

	public static void main(String[] args) {

		Calendar now = getCurrentTime();
		setTime(now);
		timeInMillis(now);
		getTime(now);
		getHour(now);
		Calendar greg = getGregorianTime();
		getYearMonthMinute(now);
		addMethod(now);
		rollMethod(now);
		beforeMethod(greg, now);
		compareMethod(greg, now);

	}

	private static void compareMethod(Calendar greg, Calendar now) {
		/*
		 * 0 -> same -1 -> less 1 -> greater
		 */
		System.out.println("Comparison:");
		System.out.println(greg.compareTo(now));
		System.out.println();

	}

	private static void beforeMethod(Calendar greg, Calendar now) {

		if (now.before(greg)) {
			System.out.println("Before: NOW " + now.getTime());
		} else {
			System.out.println("Before: GREG: " + greg.getTime());
		}
		System.out.println();

		// after functions the same
	}

	private static void rollMethod(Calendar now) {
		// adds the days but doesn't change the month
		System.out.println("Before roll: " + now.getTime());
		now.roll(Calendar.DATE, 10);

		System.out.println("After roll: " + now.getTime());
		System.out.println();
	}

	private static void addMethod(Calendar now) {
		// adding amount to a date field -> updates all other fields automatically
		now.add(Calendar.YEAR, 5);

		System.out.println("Add method:");
		System.out.println(now.getTime());
		System.out.println();
	}

	private static void getYearMonthMinute(Calendar now) {
		System.out.println("YEAR: " + now.get(Calendar.YEAR));
		System.out.println("MONTH: " + now.get(Calendar.MONTH)); // says 5 -> June
		System.out.println("MINUTE: " + now.get(Calendar.MINUTE));

		System.out.println();

	}

	private static Calendar getGregorianTime() {

		// making an instance throw GregorianCalendar
		Calendar gregCalendar = new GregorianCalendar();

		System.out.println("Gregorian time:");
		System.out.println(gregCalendar.getTime());
		System.out.println();

		return gregCalendar;
	}

	private static void getHour(Calendar now) {

		// returns the hour of the day, 24h system
		// if we want 12h system, - Calendar.HOUR
		System.out.println("Hour of the day:");
		System.out.println(now.get(Calendar.HOUR_OF_DAY));

		System.out.println();
	}

	private static void getTime(Calendar now) {
		// like the getInstance() but a bit nicer:
		Date date = now.getTime();
		System.out.println("Date:" + date);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		String sDate = sdf.format(date);
		System.out.println("Formatted date: " + sDate);

		System.out.println();
	}

	private static void timeInMillis(Calendar now) {

		// time in milliseconds after January 1, 1970
		long inMillis = now.getTimeInMillis();

		System.out.println("Time in miliseconds:");
		System.out.println(inMillis);
		System.out.println();

	}

	private static void setTime(Calendar now) {
		// set time: days from 1, months from 0
		now.set(2021, 5, 22, 18, 23);

		System.out.println("Set time:");
		System.out.println(now.getTime());
		System.out.println();

		// Leniency -> recalculates
		// if we turn it off, we get IllegalArgumentException
//		now.setLenient(false);
//		now.set(2021, 5, 33, 18, 23);

	}

	public static Calendar getCurrentTime() {
		// getting calendar instance: static method
		Calendar rightNow = Calendar.getInstance();

		System.out.println("Instance:");
		System.out.println(rightNow);
		System.out.println();
		return rightNow;
	}

	// months go from 0-11, Sunday first day of the week
	// not possible to store date without time -> has to be rounded
	// time zones represented as strings, error prone -> no ENUM, just IDs
	// not intuitive
	// formatting needs Date and DateFormat classes
	// mutable, it can lead to problems
	// to be stored in a database -> has to be turned into sql.Date
}
