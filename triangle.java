// Yadi Yang Assignment H Apr, 28, 2017
// This system prints out the type of the triangle
import java.util.Scanner;// Delcare the class which allows the users to put in variable values
public class triangle// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the method which allows the users to put in values
		int a, b, c;// Declare the integers which the users will put in

		System.out.println("Enter Side 1 -->");
		a = keyboard.nextInt();
		System.out.println("Enter Side 2 -->");
		b = keyboard.nextInt();
		System.out.println("Enter Side 3 -->");
		c = keyboard.nextInt();// The users put in three side of a triangle
		if (a==b)// Giving the condition if first two of the sides are equal, if the condition is met, the system will follow the step and search which of the following condition met the requirement of the triangle
		{
			if (a==c)// If threee sides of the triangle are equal, then the system will print out the following statement
			{
				System.out.println("This triangle is an equilateral");
			} 
			else// If only two sides of the triangle are equal, the system will print out the following statement
			{
				System.out.println("This triangle is an isosceles");
			}
		}
		else// If first two sides of the triangle are not equal, the systme will search the following statement
		{
			if (a==c || b==c)// If either of the statement is met which is either two sides are equal, the system will print out the following statement
			{
				System.out.println("This triangle is an isosceles");
			}
			else// If none of the sides of the triangle are equal, the system will print out the following statment
			{
				System.out.println("This triangle is a scalene");
			}
		}
	}	
}