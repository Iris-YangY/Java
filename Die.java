import java.util.Scanner;

public class Die
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		String answer = "yes";

		System.out.println("Do you want to join?[Yes or No]");
		answer = keyboard.next();
		while(answer.equalsIgnoreCase("yes"))
		{
			int pick = (int)(Math.random() * 6) + 1;
			System.out.println("The die is now "+pick);
			System.out.println("Start over again?[Yes or No]");
			answer = keyboard.next();
		}
		System.out.println("Thank you for using!");
	}
}