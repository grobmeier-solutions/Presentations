package com.acn.localdate;

import java.time.LocalDate; 
import java.time.DayOfWeek;


/*
 * Gehört zum Package java.time
 * LocalDate = Datum ohne Zeitzone im ISO-8601 Kalendersystem, z.B. 2021-06-23 (Jahr, Monat, Tag)
 * Verwendung immer, wenn keine Zeitzone benötigt wird
 */

public class LocalDateExercise {

	public static void main(String[] args) {
		
		// Statische Methoden:
		
		// now() = Aufruf des aktuellen Datums auf Basis der Systemeinstellungen
		LocalDate today = LocalDate.now();
		System.out.println("Datum heute: " + today);
		
		// of() = gibt Datum im Format Jahr, Monat, Tag wieder
		LocalDate dateOf = LocalDate.of(2020, 12, 24);
		System.out.println("Beliebiges Datum: " + dateOf);
		
		// ofYearDay() => das Datum des n-ten Tag eines Jahres
		LocalDate yearDay = LocalDate.ofYearDay(2020, 30);
		System.out.println("Der n-te Tag des Jahres: " + yearDay);
		
		// parse() = wandelt einen String in ein Datum um
		LocalDate stringToDate = LocalDate.parse("2020-12-24");
		System.out.println("Umwandlung String zu Datum: " + stringToDate);
		
		
		// Nicht-statische Methoden:
		
		// plusDays() => gibt neues Datum mit der Anzahl an addierten Tagen zurück
		// plusYears(), plusMonths(), plusWeeks()
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Datum morgen: " + tomorrow);
		
		// minusDays() => gibt neues Datum mit der Anzahl an subtrahierten Tagen zurück
		// minusYears(), minusMonths(), minusWeeks()
		LocalDate yesterday = today.minusDays(1);
		System.out.println("Datum gestern: " + yesterday);
		
		// getDayOfWeek() => gibt den Wochentag zurück
		DayOfWeek weekday = LocalDate.parse("2021-06-23").getDayOfWeek();
		System.out.println("Welcher Tag ist am 23.06.2021: " + weekday);
		
		// isLeapYear() => prüft auf Schaltjahre
		boolean leapYear = today.isLeapYear();
		System.out.println("Ist 2021 ein Schaltjahr: " + leapYear);
		
	}

	
	

}
