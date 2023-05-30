// Yadi Yang Assignment D Mar 16, 2017

import java.util.Scanner;

public class Temperature
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int f;
		double c;

		System.out.println("Enter temperature in Fahrenheit");
		f = keyboard.nextInt();
		c = (f - 32) / 1.8;
		float apple = (float)(Math.round(c * 1000000))/1000000;
		System.out.println("Temperature in Celsius = " + apple);

		
	}
}