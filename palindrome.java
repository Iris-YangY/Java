// Yadi Yang Assignment 3.11 Sep 21, 2017
import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args) 
	{
		String input, another = "yes";
		int left, right;
		Scanner keyboard = new Scanner(System.in);

		while(another.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter a potential palindrome: ");
			input = keyboard.nextLine();

			left = 0;
			right = input.length()-1;

			while(input.charAt(left)==input.charAt(right)&&left<right)
			{
				left++;
				right--;
			}

			if(left<right)
			{
				System.out.println("That string is NOT a palindrome.");
			}
			else
			{
				System.out.println("That string IS a palindrome.");
			}
			System.out.println("Test another palindrome? Enter yes to continue, enter anything else to quit.");
			another = keyboard.nextLine();
		}
	}
}