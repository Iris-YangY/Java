// Yadi Yang Assignment G Apr, 25, 2017
import java.util.Scanner;// Allow the users to put in the string or integers
public class Age// The name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the mothod that allow the users to input the variables
		System.out.println("Hey, what's your name?");
		String name = keyboard.nextLine();// The user put in their name
		System.out.println("Okay, " + name + ", how old are you?");
		int age = keyboard.nextInt();// The user put in the age
		if(age<16)// If the age is less than 16, than the condition is met, system prints out the following statement
		{
			System.out.println("You can't drive, " + name);
		}
		if(age<18)// If the age is less that 18, the condition is met, system prints out the following statement
		{
			System.out.println("You can't vote, " + name);
		}
		if(age<25)// If the age is less than 25, the condition is met, system prints out the following statement
		{
			System.out.println("You can't rent a car, " + name);
		}
		if(age>=25)// If the age is greater or equals to 25, the condition is met, system prints out the followint statement
		{
			System.out.println("You can do anything that's legal, " + name);
		}// All the statement will be browsed at the same time, system will print out all the statment that are met
	}
}