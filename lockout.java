// Yadi Yang Assignment I May 10, 2017
import java.util.Scanner;
public class lockout// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 0;
		int count = 1;
		System.out.println("Welcome to EF bank");
		System.out.println("Enter your PIN: ");
		pin = keyboard.nextInt();
		while (pin!=12345&&count<3)// If PIN is not correct, and the running time is less than three times, the loop will always running
		{
			System.out.println("INCORRECT PIN. TRY AGAIN");
			pin = keyboard.nextInt();
			count ++;
		}
		if (pin==12345&&count<=3)// After at least of three times of trying, if the PIN is correct, system will print out the next statement
		{
			System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACOONT.");
		}
		else// If not, meaning after three times of trying and PIN is still not correct, system will print out the following statement
		{
			System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		}
	}
}