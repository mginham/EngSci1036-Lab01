package mginham;

import java.util.Scanner;

public class mginham_lab01_q3 {

	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double a = 0, b = 0, c = 0, root1 = 0, root2 = 0, determinent = 0;
		
		// Display information & mission to user
		System.out.println("*******************************************");
		System.out.println("ES1036: Lab 01 Q3");
		System.out.println("Date: September 26, 2018");
		System.out.println("Name: Megan Ginham");
		System.out.println("Student Number: 251029381");
		System.out.println("Program's mission: Solve a quadratic with\nthe form ax^2 + bx + c = 0.");
		System.out.println("*******************************************");
				
		// Prompt user for input
		System.out.println("Please input a: ");
			a = input.nextDouble();
		System.out.println("Please input b: ");
			b = input.nextDouble();
		System.out.println("Please input c: ");
			c = input.nextDouble();
			
		// Determine classification of roots
		if(a==0) {
			if(b==0) {
				if(c==0) { // a=0, b=0, c=0 | does not exist
					System.out.println("Every x is the solution");
				}
				else { // a=0, b=0, c!=0 | no solution
					System.out.println("A solution does not exist for this function");
				}
			}
			else { // a=0, b!=0 | single root solution
				root1 = -c/b;
				
				System.out.println("Single root solution: " + root1);
			}
		}
		else { // a!=0
			// Calculate determinant
			determinent = (Math.pow(b,2) - 4*a*c);
			
			if(determinent >= 0) { // 2 real roots
				// Calculate the roots
				root1 = (-b + Math.sqrt( Math.pow(b,2) - 4*a*c) ) / (2*a);
				root2 = (-b - Math.sqrt( Math.pow(b,2) - 4*a*c) ) / (2*a);
				
				// Display the roots to user
				System.out.println("Your equation has real roots: " + root1 + " and " + root2);
			}
			else { // 2 complex roots
				double realComp = 0, imaginaryComp = 0;
				// Calculate the roots
				realComp = -b / (2*a);
				imaginaryComp = ( Math.sqrt(4*a*c - Math.pow(b, 2)) ) / (2*a);
				
				// Display the roots to user
				System.out.println("Your equation has complex roots: " + realComp + "+" + imaginaryComp + "i and " + realComp + "-" + imaginaryComp + "i");
			}
		}
		
		input.close();
		
	} // end main

} // end class
