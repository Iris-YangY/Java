// Yadi Yang Assignment G Apr, 19, 2017
import java.util.Scanner;// Declare the class which allow users to put in variable strings
public class lastletter// The name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the method of the keyboard
		System.out.println("Enter a string - ->");
		String str = keyboard.nextLine();// The user enter a string
		int len = str.length();// Calculate the length of the string and store it into ingeter named len
		int a = len - 1;// Calculate the index of the last letter
		System.out.println("Last letter = " + str.substring(a,len));// Prints out the last letter
	}
}