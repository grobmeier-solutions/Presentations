package com.accenture.presentation;

public class App {

	public static void main(String[] args) {

		String a = "hello World";
		String b = "hello World";

		// vergleicht nicht den Inhalt
		if (a == b) {
			System.out.println("Sind gleich");
		} else {
			System.out.println("nicht gleich");// nicht gleich
		}

		// überprüft Inhalt
		if (a.equals(b)) {
			System.out.println("Sind gleich"); // sind gleich
		} else {
			System.out.println("nicht gleich");
		}

		Integer x = 100;
		Integer y = 100;

		if (x == y) {
			System.out.println("Sind gleich"); // sind gleich
		} else {
			System.out.println("nicht gleich");
		}

		String init = "Hello";
		StringBuffer sb1 = new StringBuffer(init);
		StringBuffer sb2 = new StringBuffer(init);

		if (sb1 == sb2) {
			System.out.println("Sind gleich");
		} else {
			System.out.println("nicht gleich"); // nicht gleich
		}
		
		if (sb1.equals(sb2)) {
			System.out.println("Sind gleich");
		} else {
			System.out.println("nicht gleich"); // nicht gleich
		}

	}

}
