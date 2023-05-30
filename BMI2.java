// Yadi Yang Assignment D(c) Mar 8, 2017
// This system prints out the BMI value of a random person

import java.util.Scanner;// Declare the class with allow users to communicate with the system
import java.lang.Math;// Declare the class with allow system to calculate

public class BMI2// The name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double height, weight, meters, kg;
		double result;// Declare the variables

		System.out.println("Your height in inches: ");
		height = keyboard.nextDouble();// The users input the variables

		System.out.println("Your weight in pounds: ");
		weight = keyboard.nextDouble();// The users input the variables

		meters = height * 0.0254;
		kg = weight * 0.453592;
		result = kg / Math.pow(meters,2);// The calculation
		float apple = (float)(Math.round(result * 1000000))/1000000;
		System.out.println("Your BMI is " + apple);// Prints out the result
	
	}
}