// Yadi Yang Assignment I May 5, 2017

import java.util.Scanner;
public class average
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int number = 1;
		int count = 0; 
		int sum = 0;
		double average;
		
		while (number!=0)// If the input value is zero, the loop is going to stop, if not, the loop is continuous working
		{
			System.out.println("Enter an integer (0 to quit): ");
			number = keyboard.nextInt();
			sum += number;// Add up the total value for all the inputs
			count ++;// Add one for counting
			System.out.println("The sum is so far " + sum);
		}
		System.out.println("Number of values entered: " + count);
		average = ((double)sum)/count;
		System.out.println("The average is " + average);
	}
}