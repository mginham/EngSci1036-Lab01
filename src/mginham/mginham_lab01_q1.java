package mginham;

import java.util.Scanner;

public class mginham_lab01_q1 {

	public static void main(String[] args) {
		
		// Declare & initialize variables
		Scanner input = new Scanner(System.in);
		double grade1 = -1, weight1 = -1, grade2 = -1, weight2 = -1, grade3 = -1, weight3 = -1, grade4 = -1, weight4 = -1;
		double courseGrade  = -1;
		
		// Display information & mission to user
		System.out.println("*******************************************");
		System.out.println("ES1036: Lab 01 Q1");
		System.out.println("Date: September 26, 2018");
		System.out.println("Name: Megan Ginham");
		System.out.println("Student Number: 251029381");
		System.out.println("Program's mission: This program calculates\na weighted average of four grades.");
		System.out.println("*******************************************");
		
		// Prompt user for grade & weight input
		System.out.println("Input the first grade:");
			grade1 = input.nextDouble();
		System.out.println("Input the first grade weight:");
			weight1 = input.nextDouble();
			
		System.out.println("Input the second grade:");
			grade2 = input.nextDouble();
		System.out.println("Input the second grade weight:");
			weight2 = input.nextDouble();
			
		System.out.println("Input the third grade:");
			grade3 = input.nextDouble();
		System.out.println("Input the third grade weight:");
			weight3 = input.nextDouble();
			
		System.out.println("Input the fourth grade:");
			grade4 = input.nextDouble();
		System.out.println("Input the fourth grade weight:");
			weight4 = input.nextDouble();
			
		// Calculate course grade based on user input
		courseGrade = grade1*weight1 + grade2*weight2 + grade3*weight3 + grade4*weight4;
			
		// Display final course grade to user
		System.out.println("The course grade is: " + (int)courseGrade);
			
	} // end main

} // end class
