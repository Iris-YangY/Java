// Yadi Yang Assignment Sep 18, 2017
import java.util.Scanner;
public class guess
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int guess, correct,answer;
		int count=1;

		do
		{
			int number = (int)(Math.random()*100)+1;
		
			System.out.println("What is your guess?(Enter 0 to quit)");
			guess = keyboard.nextInt();

			while(guess!=number&&guess!=0)
			{
				if(guess<number)
				{
					System.out.println("Your guess is smaller!");
					System.out.println("Continue by entering your guess, enter 0 to quit.");
					guess = keyboard.nextInt();
				}
				else if(guess>number)
				{
					System.out.println("Your guess is greater!");
					System.out.println("Continue by entering your guess, enter 0 to quit.");
					guess = keyboard.nextInt();
				}
				count++;
			}
			if(guess==number)
			{
				System.out.println("You guess correctly!");
				System.out.println("Numbers of guessing: "+count);
			}
			else if(guess == 0)
			{
				System.out.println("You quit.");
				System.out.println("Numbers of guessing: "+count);
			}
			System.out.println("Do you want another game? Enter 123 to continue, enter 0 to quit.");
			answer = keyboard.nextInt();
		}
		while(answer==123);
	}
}