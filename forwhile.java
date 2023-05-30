// Yadi Yang Assignment I May 11, 2017
import java.util.Scanner;
public class forwhile
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		for(int a = 0; a<=25; a++)// Declare the number, giving the condition, make the loop running wiht the increasing by one each time
		{
			System.out.print(a+" ");
		}
		System.out.println(" ");
		for(int b = 10; b>0; b--)
		{
			System.out.print(b+" ");
		}
		System.out.println(" ");
		for(int c = 1; c<=40; c+=2)
		{
			System.out.print(c+" ");
		}
		System.out.println(" ");
		for(int d = 2; d<=40; d+=2)
		{
			System.out.print(d+" ");
		}
		System.out.println(" ");
		for(int e = 0; e<=200; e+=10)
		{
			System.out.print(e+" ");
		}
		System.out.println(" ");
		for(int f = -10; f >= (-20); f--)
		{
			System.out.print(f+" ");
		}
		System.out.println(" ");
		for(int g = 1; g <=10; g++)
		{
			System.out.println("Computer");
		}
	}
}