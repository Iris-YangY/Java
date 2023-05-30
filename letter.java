// Yadi Yang Assignment H May, 1, 2017
// This system prints out the number grade in terms of letter
import java.util.Scanner;// Delcare the class which allows the users to put in variable values of grade
public class letter// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the method which allows the users to put in values
		int grade;// Declare the name of the input
		System.out.println("Enter a Numerical Grade -->");
		grade = keyboard.nextInt();// The user put in the value of the grade
		if(grade<=100)// Giving the first condition, if the condition is met, then the system will find the following statement which meets the condition
		{
			if(grade>=97)// If the second condition is met, system will print out the following statement
			{
				System.out.println("Letter Grade = A+");
			}
			else if(grade>=94)// If the second condition is no met, system will find the following the statement which meets the condition of the input, once the condition is meet, system will print out the statement
			{
				System.out.println("Letter Grade = A");
			}
			else if(grade>=90)
			{
				System.out.println("Letter Grade = A-");
			}
			else if(grade>=87)
			{
				System.out.println("Letter Grade = B+");
			}
			else if(grade>=84)
			{
				System.out.println("Letter Grade = B");
			}
			else if(grade>=80)
			{
				System.out.println("Letter Grade = B-");
			}
			else if(grade>=77)
			{
				System.out.println("Letter Grade = C+");
			}
			else if(grade>=74)
			{
				System.out.println("Letter Grade = C");
			}
			else if(grade>=70)
			{
				System.out.println("Letter Grade = C-");
			}
			else if(grade<70)
			{
				System.out.println("Letter Grade = F");
			}
		}
	}
}