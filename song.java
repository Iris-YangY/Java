// Yadi Yang Assignment 3.9 Sep 18, 2017
import java.util.Scanner;
public class song
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		for(int a=100; a>=99; a--)
		{
			System.out.println(a+" bottles of beer on the wall");
			System.out.println(a+" bottles of beer");
			System.out.println("If one of those bottles should happen to fall");
			int b=a-1;
			System.out.println(b+" bottles of beer on the wall");
		}
	}

}