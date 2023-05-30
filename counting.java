// Yadi Yang Assignment I May 15, 2017
import java.util.Scanner;
public class counting// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int count;
		System.out.println("Enter any number to count: ");
		count = keyboard.nextInt();
		for(int a = 0; a <= count; a++)// States the number, giving the condition, and provide the count
		{
			System.out.print(a + " ");
		}
	}
}