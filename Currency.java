import java.util.Scanner;

public class Currency
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int usd;
		double euro, yenis;

		System.out.println("Enter your currency(USD): ");
		usd = keyboard.nextInt();

		euro = 0.93 * usd;
		float e = (float)(Math.round(euro * 100))/100;
		System.out.println("Your currency exchange in euro is " + e);

		yenis = 113.38 * usd;
		float y = (float)(Math.round(yenis * 10))/10;
		System.out.println("Your currency exchange in Japanese Yenis is " + y);
	}
}