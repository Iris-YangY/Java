import java.util.Scanner;
public class Banking
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 0;
		int answer;
		String continuous;
		int value;
		int value1s=1000;
		int value2s=1000;
		int valuein1=0;
		int valuein2=0;

		System.out.println("Welcome to EF bank");
		
		while (pin!=12345)// If PIN is not correct, the loop will always running
		{
			System.out.println("Enter your PIN: ");
			pin = keyboard.nextInt();
			if(pin!=12345)// If the condition is met, which is incorrect PIN, system will print out the following statement
			{
				System.out.println("INCORRECT PIN. TRY AGAIN");
			}
			else// If the PIN is correct, system will end looping and print out the following result
			{
				System.out.println("PIN Accepted. You now have access to your accont.");
			}
		}

		System.out.println("Which account do you want to enter?[Type in Account: 1 or 2]");
		answer = keyboard.nextInt();

		if(answer==1)
		{
			System.out.println("You now have $"+value1s+" in account 1 and $"+value2s+" in account 2. For what amount you want to transfer from 1 to 2?");
			value = keyboard.nextInt();

			if(value<=value1s)
			{
				value1s = value1s-value;
				value2s = value2s+value;
				System.out.println("Now you have $"+value1s+" in account 1 and $"+value2s+" in account 2.");
			}
			else
			{
				System.out.println("You are having deficit in your account!");
			}
			
		}
		else if(answer==2)
		{
			System.out.println("You now have $"+value1s+" in account 1 and $"+value2s+" in account 2. For what amount you want to transfer from 2 to 1?");
			value = keyboard.nextInt();
			if(value<=value2s)
			{
				value1s = value1s+value;
				value2s = value2s-value;
				System.out.println("Now you have $"+value1s+" in account 1 and $"+value2s+" in account 2.");
			}
			else
			{
				System.out.println("You are having deficit in your account!");
			}
			
		}
		else
		{
			System.out.println("This is an invalid enter!");
		}

		System.out.println("Do you want to continue?(Yes or No)");
		continuous=keyboard.next();

		while(continuous.equalsIgnoreCase("yes"))
		{
			System.out.println("Which account do you want to enter?[Type in Account: 1 or 2]");
			answer = keyboard.nextInt();

			if(answer==1)
			{
				System.out.println("You now have $"+value1s+" in account 1 and $"+value2s+" in account 2. For what amount you want to transfer from 1 to 2?");
				int transfer = 0;
				transfer = keyboard.nextInt();

				if(transfer<=value1s)
				{
					value1s = value1s-transfer;	
					value2s = value2s+transfer;
					System.out.println("Now you have $"+value1s+" in account 1 and $"+value2s+" in account 2.");
				}
				else
				{
					System.out.println("You are having deficit in your account!");
				}
				
				
			}
			else if(answer==2)
			{
				System.out.println("You now have $"+value1s+" in account 1 and $"+value2s+" in account 2. For what amount you want to transfer from 2 to 1?");
				int transfer = 0;
				transfer = keyboard.nextInt();
				
				if(transfer<=value2s)
				{
					value1s = value1s+transfer;
					value2s = value2s-transfer;
					System.out.println("Now you have $"+value1s+" in account 1 and $"+value2s+" in account 2.");
				}
				else
				{
					System.out.println("You are having deficit in your account!");
				}
				
			}
			else
			{
				System.out.println("This is an invalid enter!");
			}
			System.out.println("Do you want to continue?(Yes or No)");
			continuous = keyboard.next();
		}
		System.out.println("Thank you for using EF Banking System!");
	}
}