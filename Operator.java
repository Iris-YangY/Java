// Yadi Yang Assignment C Feb 27. 2017
// This program prints out the arithmetic process

public class Operator// The name of the program
{
	public static void main(String[] args) 
	{	int num1 = 77, num2 = 32;// Declare and initialize variables with num1 and num2 so we have two variables
		int sum = 0, difference = 0, product = 0, quotient = 0, remainder = 0;// Declare the output name and form
		// Declare the calcultaion process
		sum = num1 + num2;
		difference = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;
		remainder = num1 % num2;
		// Prints out the results
		System.out.println("           Arithmetic         ");// Title of the output
		System.out.println("================================");// A line
		System.out.println(num1 + " + " + num2 + " = " + sum);// Giving the equation
		System.out.println(num1 + " - " + num2 + " = " + difference);
		System.out.println(num1 + " * " + num2 + " = " + product);
		System.out.println(num1 + " / " + num2 + " = " + quotient);
		System.out.println(num1 + " % " + num2 + " = " + remainder);
	}
}