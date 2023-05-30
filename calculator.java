// Yadi Yang project 1 Mar 10, 2017
// This program prints out the loans and monthly payment

import java.text.DecimalFormat;// Declare the class which allow the system to make the number arrange in format
import java.util.Scanner;// Declare the class which allow users to communicate with the system
import java.lang.Math;// Declare the class which allow the system to do the power calculation

public class calculator// The name of the program
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int loan, time;
		double rate, payment, j, k, a, b;// Declare the variables

		System.out.println("Enter the loan amount you want to borrow: ");
		loan = keyboard.nextInt();// The user inputs the value of loans
		System.out.println("Enter the length of the loan(in years): ");
		time = keyboard.nextInt();// The user inputs the time of the loans
		System.out.println("Enter the interest rate for the loan: ");
		rate = keyboard.nextDouble();// The user inputs the interest rate for the loans
		
		System.out.println("Amount borrowed: $" + new DecimalFormat(",###").format(loan) + ".00");// The process which allow the system to group the number which their decimals are as a group of three
		System.out.println("Length of the loan: " + time + " years");// Prints out the year of the loans
		j = rate / 100 / 12;
		a = 1 + j;
		b = time * (-12);
		k = Math.pow(a,b);
		payment = loan * (j / (1 - k));// Calculation of the loans
		float result = (float)(Math.round(payment * 100))/100;// To keep two decimals
		System.out.println("Your monthly payment is: $" + result);// Prints out the result

	}
}