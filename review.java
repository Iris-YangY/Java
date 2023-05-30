import java.text.DecimalFormat;// Arrange the number with three dicimal format
import java.util.Scanner;// Allow users to communicate with the system by keyboard
import java.lang.Math;// Allow the system doing higher level mathematic calculation

public class review// Name, consistent with the file's name
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the keyboard which allow users to communicate with the system, name can be random
		int a;// Declare integer at random
		double b, c, d;// Declare double number at random
		String name;// Declare a string which is put by the users

		int arbitrary = 50, rounded = 0;// Declare integer with certain value
		double random = 30;// Declare double number with certain value
		Double atarbitrary = new Double((double)arbitrary);// Store integer number into double
		rounded = (int)random;// Store double number into integer

		System.out.println("What's your name?");
		name = keyboard.next();// Input string

		System.out.println("Hi, " + name + "! Let's enter integer A...");
		a = keyboard.nextInt();// Input integer

		System.out.println("Enter a double number...");
		b = keyboard.nextDouble();// Input double number

		c = Math.pow(a,b);// Doing math calculation with power, the first one is the number n the second one is the power rising
		System.out.println("Output = " + new DecimalFormat(",###").format(c));// Store the number into the format of three decimal format
		d = b * c;// Calculation
		float result = (float)(Math.round(d * 1000))/1000;// Store with three decimal remaining
		System.out.println("Result = " + result);// Prints out the result with the foreseening step

		System.out.println("The Square = " + (int)Math.pow(result,2));// Doing the calculation meanwhile store the result into integer format

		System.out.println("The integer into double is " + atarbitrary);
		System.out.println("The double into integer is " + rounded);// Output the numbers that are declared and calculated before
	}
}