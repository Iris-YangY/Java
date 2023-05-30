// Yadi Yang Assignment G
import java.util.Scanner;// Declare the class which allow the users to put in the words

public class acronym// The name of the file
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);// Declare the class that allow the user to put in words
		String a, b, c;// Declare the variables
		System.out.println("Enter 3 words -->");
		a = keyboard.next();
		b = keyboard.next();
		c = keyboard.next();// The user put in three words
		System.out.println("New word = " + a.substring(0,1) + b.substring(0,1) + c.substring(0,1));// Output with the first three letter of the users' input
	
	}
}