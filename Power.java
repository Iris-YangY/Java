// Yadi Yang Assignment D(b) Mar 7, 2017
// This system prints out the calculation of a random number

import java.util.Scanner;// Declare the class that allow to communicate with the users by keyboard
import java.lang.Math;// Declare the class that allow the system to calculate

public class Power// The name of the program
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);// The code that allow users to input by keyboard
		int number;// Declare the input's name

		System.out.println("Please enter an integer-->");
		number = keyboard.nextInt();// The user input the random number here

		System.out.println("The Square = " + (int)Math.pow(number,2));// Prints out the integer for square of the number
		System.out.println("The Cube = " + (int)Math.pow(number,3));// Prints out the integer for cube of the number
		System.out.println("The Fourth Power = " + (int)Math.pow(number,4));// Prints out the integer for fourth power of the number
	}
}