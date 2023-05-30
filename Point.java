import java.util.Scanner;
public class point
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String choice = "yes";
		System.out.println("You want to join in?(Yes or No)");
		choice = keyboard.next();
		while(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("Set up the point:");
			x = keyboard.nextInt();
			y = keyboard.nextInt();

			System.out.println("Hello. The point now is: "+"("+x+","+y+")");
			System.out.println("Moving the point by:");
			int movex = keyboard.nextInt();
			int movey = keyboard.nextInt();

			if(movex!=0||movey!=0)
			{
				int newx = x+movex;
				int newy = y+movey;
				System.out.println("The point now is: "+"("+newx+","+newy+")");
				System.out.println("I said do not touch it!");
			}
			else if(movex==0&&movey==0)
			{
				System.out.println("Nice job! Thank you!");
			}
			System.out.println("You want to join in?(Yes or No)");
			choice = keyboard.next();
		}
		System.out.println("Huh...Okay.");
	}
}