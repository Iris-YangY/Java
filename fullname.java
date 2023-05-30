// Yadi Yang Assignment G
import java.util.Scanner;// Declare the Scanner class

public class fullname// The name of the file
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the name of keyboard
		String first, last, fullname;// Declare the name of the string
		System.out.println("Enter first name-->");
		first = keyboard.next();// The user put in their first name using keyboard
		System.out.println("Enter last name-->");
		last = keyboard.next();// The use put in their last name using keyboard
		fullname = last + ", " + first;// Declare the fullname equation
		System.out.println(fullname);// Prints out the fullname with a comma
	}
}