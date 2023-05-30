// Yadi Yang Assignment G Apr 26, 2017
// This statement prints out the comparison of two random number
import java.util.Scanner;// Declare the class which allow the user to put in the number
import java.lang.Math;// Declare the class which allow the system to do math calculation

public class compare// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the method which allow the users to put in variables through keyboard
		int a, b;// Declare the integers that user put in

		System.out.println("Enter Number 1 -->");
		a = keyboard.nextInt();// The user put in the first integer
		System.out.println("Enter Number 2 -->");
		b = keyboard.nextInt();// The user put in the second integer
		if(a>b)// The condition of comparison is a is greater than b, if so, than prints out the following statement
		{
			System.out.println(a + " is greater than " + b);// Prints out the result of comparison
		}
		if(a==b)// The condition of comparison is a is equal to b, if so, than prints out the following statement
		{
			System.out.println(a + " is equal to " + b);
		}
		if(a<b)// The condition of comparison is a is smaller than b, if so, than prints out the following statement
		{
			System.out.println(a + " is smaller than " + b);
		}
	}
}