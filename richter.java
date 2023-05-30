// Yadi Yang Assignment H Apr, 27, 2017
// This program prints out the demage level of the earthquake
import java.util.Scanner;// Declare the class which allow the system to do math calculation
public class richter// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the method which allow the users to put in variables through keyboard
		double a;// Declare the number that user put in


		System.out.println("Enter a magnitude on the Richter scale -->");
		a = keyboard.nextDouble();// The user put in the number's value
		if (a>8.0)// Give the first condition, if the condition is met, which is the number the user put in is greate than 8.0, then the system prints out the following statement
		{
			System.out.println("Demage = Most structures fall");
		}
		else if (a>=7.0)// If the first statement is not met, then the system will find by teh following statements and prints out the one that matches the number's condition
		{
			System.out.println("Demage = Most buildings destroyed");
		}
		else if (a>=6.0)
		{
			System.out.println("Demage = Many buidings considerably damaged; some collapse");
		}
		else if (a>=4.5)
		{
			System.out.println("Demage = Damage to poorly constructed buildings");
		}
		else if (a>=3.5)
		{
			System.out.println("Demage = Felt by many people, no destruction");
		}
		else if (a>=0)
		{
			System.out.println("Demage = Generally not felt by people");
		}
		else if (a<0)
		{
			System.out.println("This number is not valid");
		}
	}
}