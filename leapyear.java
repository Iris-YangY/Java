import java.util.Scanner;
public class leapyear
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter the year to determine");
		int year = keyboard.nextInt();

		if (year<1582)
		{
			System.out.println("Year is less than 1582, please try again!");
		}
		else if ((year%4==0 && year%100!=0)||year%400==0)
		{
			System.out.println(year+" is a leap year.");
		}
		else
		{
			System.out.println(year+" is not a leap year.");
		}
	}
}