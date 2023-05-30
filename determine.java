// Yadi Yang Assignment Sep 15, 2017
import java.util.Scanner;
public class determine
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = keyboard.nextInt();
		if(input==0)
		{
			System.out.println("The number is zero.");
		}
		else if(input%2==0&&input!=0)
		{
			System.out.println("The number is an even number.");
		}
		else if(input%2!=0&&input!=0)
		{
			System.out.println("The number is an odd number.");
		}
	}
}