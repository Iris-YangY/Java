// Yadi Yang Assignment F Apr 10, 2017
// This program prints out the random rages of the number
public class random
{
	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random() * 26);
		int num2 = (int)(Math.random() * 3) + 1;
		int num3 = (int)(Math.random() * 51) + 50;
		int num4 = (int)(Math.random() * 10) - 10;
		int num5 = (int)(Math.random() * 201) - 100;
		int num6 = (int)(Math.random() * 26) + 65;// Create random number with the range that include both side
		System.out.println("Random Ranges");
		System.out.println("===============");
		System.out.println("1. Range: 0 to 25 = " + num1);
		System.out.println("2. Range: 1 to 3 = " + num2);
		System.out.println("3. Range: 50 to 100 = " + num3);
		System.out.println("4. Range: -1 to -10 = " + num4);
		System.out.println("5. Range: -100 to 100 = " + num5);// Prints out the result in integer
		System.out.println("6. Range: A to Z = " + (char)num6);// Prints out the result in character
		double num7 = ((int)(Math.random() * 999)) * 0.001;// Create random number and make it into three decimal
		int num8 = ((int)(Math.random() * 10) + 1) * 1000;// Create random number and make it bigger into thousand and tem thousand
		System.out.println("7. Range: 0.1 to 1 = " + num7);
		System.out.println("8. Range: 1000 to 10000 = " + num8);// Prints out the result
	}
}