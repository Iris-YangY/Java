// Yadi Yang Assignment D Mar 3, 2017
// This system prints out the perimeter and the area of the rectangle

import java.util.Scanner;// Declare the class with allow users to communicate with the system through keyboard

public class Rectangle// The name of the program
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);// Declare the type of the program
		int length, width;// Declare the variables

		System.out.println("Enter the Length");
		length = keyboard.nextInt();// Interface with the users
		System.out.println("Enter the Width");
		width = keyboard.nextInt();// Interface with the users

		int perimeter = 0, area = 0;// Declare the varialbes of the results of the rectangle
		perimeter = 2 * length + 2 * width;
		area = length * width;// Formula for calculating the rectangles

		System.out.println("Perimeter = " + perimeter);
		System.out.println("Area = " + area);// Prints out the results

		
	}
}