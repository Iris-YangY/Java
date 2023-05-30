// Yadi Yang Assignment H May, 2 2017
// This program print out the BMI range of a random person

import java.util.Scanner;// Declare the class with allow users to communicate with the system
import java.lang.Math;// Declare the class with allow system to calculate

public class BMIcategory// The name of the program
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
		float apple = (float)(Math.round(result * 10))/10;
		System.out.println("Your BMI is " + apple);// Prints out the result
		if (apple>=40.0)// Giving the first condition, if the condition is met, then the system will print out the following statement, if not, the system will search from the following statement until it find the fit one
		{
			String name = "\"morbidly\"";
			System.out.println("BMI Category: very severely (or " + name + ") underweight");
		}
		else if (apple>=35.0)
		{
			System.out.println("BMI Category: severely obese");
		}
		else if (apple>=30.0)
		{
			System.out.println("BMI Category: moderately obese");
		}
		else if (apple>=25.0) 
		{
			System.out.println("BMI Category: overweight");
		}
		else if (apple>=18.5) 
		{
			System.out.println("BMI Category: normal weight");	
		}
		else if (apple>=16.1) 
		{
			System.out.println("BMI Category: underweight");
		}
		else if (apple>=15.0) 
		{
			System.out.println("BMI Category: severely underweight");	
		}
		else if (apple<15.0) 
		{
			System.out.println("BMI Category: very severely underweight");	
		}
	}
}