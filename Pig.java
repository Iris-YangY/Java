import java.util.Scanner;
public class Pig
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String answer = "yes";
		
		do
		{
			System.out.println("You have a dice.");
			System.out.println("Start the game.");
			while(score1<100&&score2<100)
			{
				int num1 = (int)(Math.random() * 6) + 1;
				int num2 = (int)(Math.random() * 6) + 1;
				int result1 = num1 + num2;
				
				if(num1!=1&&num2!=1&&result1!=2&&result1<100)
				{
					int score1+=result1;
					System.out.println("You rolled "+num1+" and "+num2+", and your score now is "+score1+".");
					
					System.out.println("It's my turn now.");
					int num3 = (int)(Math.random() * 6) + 1;
					int num4 = (int)(Math.random() * 6) + 1;
					int result2 = num3 + num4;
					if(num3!=1&&num4!=1&&result2!=2&&result2<20)
					{
						int score2+=result2;
						System.out.println("I rolled "+num1+" and "+num2+", and my score now is "+score2+".");
					}
					else if()
				}	
			}

			System.out.println("Another one?");
			answer = keyboard.next();
		}
		while(answer.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using!");
	}
}