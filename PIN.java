// Yadi Yang Assignment I May 8, 2017
import java.util.Scanner;
public class PIN
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 0;
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
	}
}