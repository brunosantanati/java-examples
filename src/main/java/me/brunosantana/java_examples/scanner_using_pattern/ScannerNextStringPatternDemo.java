package me.brunosantana.java_examples.scanner_using_pattern;

import java.util.Scanner;

/*
 * This is a java example source code that shows how to use
 * next(Pattern pattern) method of Scanner class.
 * Split the string into integer tokens
 */

public class ScannerNextStringPatternDemo {

	public static void main(String[] args) {

		// Initialize Scanner object
		//Scanner scan = new Scanner("12 313 55 123");
		Scanner scan = new Scanner("Bruno Programador Java");
		// intialize the String pattern
		//String pattern = "[0-9]*";
		String pattern = "[A-Za-z]*";
		// Printing the tokenized Strings
		while (scan.hasNext()) {
			System.out.println(scan.next(pattern));
		}
		// closing the scanner stream
		scan.close();

	}

}