// Yadi Yang Assignment G Apr, 20, 2017
import java.util.Scanner;// Declare the class which allow the user to put in string
public class mixup// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);// Declare the method which allow the user to put in words
		System.out.println("Enter a string - ->");
		String a = keyboard.next();// The user put in words
		int len = a.length();// Calculate the length of the word
		double num = len / 2;// Declare the middle index of the mixed string
		int half = (int)num;// Store the number into integer
		System.out.println("Mixed up string = " + a.substring(half,len) + a.substring(0,half));// Prints out the result with substring and concatenation operator
	}
}