package com.patterns.strategy;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample - Strategy Pattern
 * 
 * It allows to change the algorithm or implementation of 
 * an object at runtime without causing tight coupling.
 *
 */

public class App {

	public static void main(String[] args) {
		Client wordClient = new Client(new WordPrinter());
		wordClient.print("Hello World");
		
		Client pdfPrinter = new Client(new PdfPrinter());
		pdfPrinter.print("Welcome to Java!");
	}
}
