import java.util.Scanner;
public class leapyearloop
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter the year to determine");
		int year = keyboard.nextInt();
		int count = 1;
		while (year>1582&&year!=0)
		{
			if((year%4==0&&year%100!=0)||year%400==0)
			{
				System.out.println(year+" is a leap year.");
			}
			else
			{
				System.out.println(year+" is not a leap year.");
			}
			count ++;
		}
		if(year==0)
		{
			System.out.println("Program ends.");
		}
