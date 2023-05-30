// Yadi Yang Assignment F Apr 7, 2017
// This program prints out the minimum and maximum of the users' input

import java.util.Scanner;// Allow the user input the value
import java.lang.Math;// Allow the system to do the calculation

public class Number// Namt of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare keyboard's name which allow the system communicate with the users
		int a, b, c;// Declare integer

		System.out.println("Enter 1st Integer --> ");
		a = keyboard.nextInt();// The user input the first integer
		System.out.println("Enter 2nd Integer --> ");
		b = keyboard.nextInt();// The user input the second integer
		System.out.println("Enter 3rd Integer --> ");
		c = keyboard.nextInt();// The user input the third integer
		int first = 0;
		int smallest = 0;
		first = Math.min(a, b);// Compare the smaller between the two
		smallest = Math.min(first, c);// Compare the smallest between the three
		System.out.println("Smallest = " + smallest);// Prints out the result of the smallest number

		int big = 0;
		int biggest = 0;
		big = Math.max(a, b);// Compare the bigger between the two
		biggest = Math.max(big, c);// Compare the biggest between the three
		System.out.println("Largest = " + biggest);// Prints out the result of the biggest number

	}
}