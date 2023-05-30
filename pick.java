// Yadi Yang Assignment F Apr 10, 2017
// This program prints out the random number between 1 to 50
public class pick
{
	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random() * 50) + 1;
		int num2 = (int)(Math.random() * 50) + 1;
		int num3 = (int)(Math.random() * 50) + 1;
		int num4 = (int)(Math.random() * 50) + 1;
		int num5 = (int)(Math.random() * 50) + 1;
		int num6 = (int)(Math.random() * 50) + 1;// Create the range of random number
		System.out.println("Texas Lottery - Quick Pick");// Title of output
		System.out.println("================================");// A line
		System.out.println(num1 + "  " + num2 + "  " + num3 + "  " + num4 + "  " + num5 + "  " + num6);// Prints out 
	}
}