import java.util.Scanner;
public class PairOfDice
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String answer = "yes";
		

		do
		{
			System.out.println("You have two dice now.");
			System.out.println("Throw it for 1,000 times.");
			int count=0;
			for(int a=0 ;a<1000 ;a++)
			{
				
				int num1 = (int)(Math.random() * 6) + 1;
				int num2 = (int)(Math.random() * 6) + 1;
				int result = num1 + num2;
				System.out.print(result+" ");
				if(result==12)
				{
					count=count+1;
				}
			}
			System.out.println("There are "+count+" box cars!");

			System.out.println("Another one?");
			answer = keyboard.next();
		}
		while(answer.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using!");
	}
}