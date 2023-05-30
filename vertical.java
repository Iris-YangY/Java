// Yadi Yang Assignment I May 16, 2017
import java.util.Scanner;
public class vertical
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string -->");
		String a = keyboard.nextLine();// Initialize the string
		int length = a.length();
		for(int n = 0; n<length; n++)// Giving the condition
		{
			System.out.println(a.charAt(n));
			System.out.println(" ");
		}
		/*
		int a = a.length();
		for(int n = 0; n<=a; n++)
		{
			System.out.println(a.substring(n,n+1))
		}
		*/
	}
}