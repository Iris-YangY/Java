// Yadi Yang Assignment D(c) Mar 8, 2017
// This system prints out the BMI value of a random person

import java.util.Scanner;// Declare the class with allow users to communicate with the system
import java.lang.Math;// Declare the class with allow system to calculate

public class value// The name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double height, weight;
		float result, value;// Declare the variables

		System.out.println("Your height in m: ");
		height = keyboard.nextDouble();// The users input the variables

		System.out.println("Your weight in kg: ");
		weight = keyboard.nextDouble();// The users input the variables

		result = weight / Math.pow(height,2);// The calculation
		float value = (float)(Math.round(result * 100000)/100000);
		System.out.println("Your BMI is " + value);// Prints out the result
	
	}
}