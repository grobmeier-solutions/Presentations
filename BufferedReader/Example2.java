package com.acn.bufferedreaderpres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) {

		// Default size buffered reader
		try (BufferedReader reader = new BufferedReader(new FileReader("bsp.txt"))) {

			assert reader.markSupported() : "mark() not supported!";
			reader.mark(4000); // Startpunkt im Reader markieren

			char[] array = new char[10];
			array[0] = (char) reader.read();
			reader.read(array, 1, array.length - 1);
			System.out.println(new String(array));

			reader.reset(); // siehe Zeile 15
			char wiederAmAnfang = (char) reader.read();
			System.out.println(wiederAmAnfang);

			reader.skip(2);
			System.out.println(reader.readLine());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
