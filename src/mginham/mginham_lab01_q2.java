package mginham;

import java.util.Scanner;

public class mginham_lab01_q2 {

	public static void main(String[] args) {
		
		// Declare & initialize variables
		Scanner input = new Scanner(System.in);
		char letter = 0;
		
		// Display information & mission to user
		System.out.println("*******************************************");
		System.out.println("ES1036: Lab 01 Q2");
		System.out.println("Date: September 26, 2018");
		System.out.println("Name: Megan Ginham");
		System.out.println("Student Number: 251029381");
		System.out.println("Program's mission: Convert a lowercase\ncharacter to its uppercase variant.");
		System.out.println("*******************************************");
		
		// Prompt user to input single char
		System.out.println("Input a character:");
			letter = input.next().charAt(0);
		
		// Convert lowercase letter to uppercase letter according to ASCII table
		letter = (char) (letter-32);
			
		// Output uppercase variant
		System.out.println("The uppercase character is: " + letter);

		input.close();
	} // end main

} // end class
