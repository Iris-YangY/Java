// Yadi Yang Assignment 3.5 Sep 15, 2017
import java.util.Scanner;
public class readstring
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = keyboard.nextLine();
		int length = word.length();
		for(int a=0; a<length; a++)
		{
			System.out.println(word.charAt(a));
		}
	}
}