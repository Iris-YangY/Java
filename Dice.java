public class Dice
{
	public static void main(String[] args) 
	{
		int num1 = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		int result = num1 + num2;
		System.out.println("HERE COMES THE DICE!");
		System.out.println("Roll #1: " + num1);
		System.out.println("Roll #2: " + num2);
		System.out.println("The total is " + result + "!");
	}
}