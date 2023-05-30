//Yadi Yang Assignment 3.4 Sep 15, 2017

import java.util.Scanner;
public class evensum
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		int sum = 0;

		System.out.println("Enter a number greater than 2:");
		input = keyboard.nextInt();
		if(input>=2)
		{
			for(int a=2; a<=input; a+=2)
			{
				sum+=a;
			}
			System.out.println("The sum is "+sum);
		}
		else if(input<2)
		{
			System.out.println("Error!");
		}
	}
}