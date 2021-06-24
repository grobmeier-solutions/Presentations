package com.acn;
import java.time.LocalTime;		// Uhrzeit ohne Datum
import java.time.LocalDateTime;	// Uhrzeit mit Datum

public class LocalTimeLocalDateTimeExample {

	public LocalTimeLocalDateTimeExample() {
	}

	public static void main(String[] args) {
		System.out.println("--------------------------------------------------------");
		System.out.println("LocalTime: ");
		// LocalTime
		// Local Time hat keinen default constructor
		// Objekte können über static methods initiiert werden
		// LocalTime locTime = new LocalTime(0, 0, 0, 0);
		//LocalTime locTime1 = LocalTime.now(java.time.ZoneId.of("America/Los_Angeles"));
		LocalTime locTime1 = LocalTime.now();
		LocalTime locTime2 = LocalTime.now();
		LocalTime locTime3 = LocalTime.of(12, 10, 5, 495);
		LocalTime locTime4 = LocalTime.parse("10:15:30");
		
		System.out.println("Local Time now: " + locTime1.toString());
		System.out.println("Local Time now: " + locTime2.toString());
		System.out.println("Local Time of: " + locTime3.toString());
		System.out.println("Local Time parse: " + locTime4.toString());
		
		if (locTime1.isBefore(locTime2) || locTime1.equals(locTime2)){
			System.out.println("LocalTime conserves causality");
		} else {
			System.out.println("LocalTime does not conserve causality");
		}
	
		System.out.println("--------------------------------------------------------");
		System.out.println("LocalDateTime: ");
		// LocalDateTime
		LocalDateTime locDateTime1 = LocalDateTime.now();
		LocalDateTime locDateTime2 = LocalDateTime.now();
		LocalDateTime locDateTime3 = LocalDateTime.of(2100, 10, 8, 12, 0, 0, 0);
		LocalDateTime locDateTime4 = LocalDateTime.parse("2007-12-03T10:15:30");
		
		System.out.println("Local DateTime now: " + locDateTime1.toString());
		System.out.println("Local DateTime now: " + locDateTime2.toString());
		System.out.println("Local DateTime of: " + locDateTime3.toString());
		System.out.println("Local DateTime parse: " + locDateTime4.toString());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Aware DateTime: ");
		java.time.ZonedDateTime awareDateTime1 = locDateTime1.atZone(java.time.ZoneId.of("America/Los_Angeles"));
		java.time.ZonedDateTime awareDateTime2 = locDateTime1.atZone(java.time.ZoneId.of("Asia/Dhaka"));
		
		System.out.println("Aware DateTime: " + awareDateTime1.toString());
		System.out.println("Aware DateTime: " + awareDateTime2.toString());
		
		System.out.println("Aware DateTime Comparison: " + awareDateTime1.isAfter(awareDateTime2));
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Arithmetic with LocalDateTime: ");
		// Arithmetic mit LocalDateTime
		System.out.println(locDateTime1);
		System.out.println(locDateTime1.plus(1, java.time.temporal.ChronoUnit.CENTURIES));
		
		
		System.out.println("--------------------------------------------------------");
		
	}

}
