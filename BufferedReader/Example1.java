package com.acn.bufferedreaderpres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {

		// FileReader:
		FileReader fileReader = new FileReader("bsp.txt");
		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}
		fileReader.close();

		System.out.println("\n\n\n-------------------------\n\n");
		
		//BufferedReader:
		BufferedReader bufReader = new BufferedReader(new FileReader("bsp.txt"), 1024);
		String next;
		while((next = bufReader.readLine()) != null) {
			System.out.println(next);
		}
		bufReader.close();
		
	}

}
