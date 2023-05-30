// Yadi Yang Assignment F Apr 7, 2017
// This program prints out the hypotenuse of the triangle

import java.util.Scanner;// Allow the user input the value
import java.lang.Math;// Allow the system to do the calculation

public class hypotenuse
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare keyboard's name which allow the system communicate with the users
		int a, b;// Declare integer
		double c;// Declare double number

		System.out.println("Enter side 1 --> ");
		a = keyboard.nextInt();// The user input the first integer
		System.out.println("Enter side 2 --> ");
		b = keyboard.nextInt();// The user input the second integer

		c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));// The formula of calculating the hypotenuse
		System.out.println();
		System.out.println("The hypotenus of the triangle = " + Math.round(c));// Prints out the rounded result
		
	}
}