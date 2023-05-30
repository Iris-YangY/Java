// Yadi Yang Assignment D(d) Mar 9, 2017
// This program prints out the results of changing in money

import java.util.Scanner;

public class money
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int quarters = 0;// Number of quarters
		int dimes = 0;// Number of dimes
		int nickels = 0;// Number of nickels 
		int pennies = 0;// Number of pennies
		int totalCents = 0;// Total cents collected
		int dollars = 0;// Dollar amount
		int cents = 0;// Cents amount

		System.out.println("How many pennies do you have --> ");
		pennies = keyboard.nextInt();// The user put in the pennies
		System.out.println("How many nickels do you have --> ");
		nickels = keyboard.nextInt();// The user put in the nickels
		System.out.println("How many dimes do you have --> ");
		dimes = keyboard.nextInt();// The user put in the nickels
		System.out.println("How many quarters do you have --> ");
		quarters = keyboard.nextInt();// The user put in the quarters

		totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;// The calculation
		dollars = totalCents / 100;
		cents = totalCents % 100;
		System.out.println("Total value = " + dollars + " dollars and " + cents + " cents");// Prints out the exchange result for money
		
	}
}