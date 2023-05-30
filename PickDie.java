import java.util.Scanner;
public class PickDie
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int sides;
		String answer = "yes";
		System.out.println("Play a die?");
		answer = keyboard.next();
		while(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Pick up the number of sides of your die:");
			sides = keyboard.nextInt();
			if(sides>0)
			{
				int pick = (int)(Math.random()*sides)+1;
				System.out.println("The dies is now "+pick);
			}
			else
			{
				System.out.println("Hey! Be logical!");
			}
			System.out.println("Start over agian?[Yes or No]");
			answer = keyboard.next();
		}
		System.out.println("Thank you for using!");
	}
}