// Yadi Yang Assignment C Feb 28, 2017
// This program prints out the mystery number

public class Mystery// The name of the program
{
	public static void main(String[] args) 
	{	int mystery = 100;// Declare and initialize the variables which has the name of mystery and has the initial value of 100
		mystery += 50;
		mystery -= 1;
		mystery *= 3;
		mystery += 1;
		mystery /= 2;
		mystery += 15;
		mystery -= 7;
		mystery += 1;
		mystery -= 23;
		mystery *= 10;
		mystery -= 1;
		mystery %= 99;// The calculation steps which directly change the value of the number and store the result again in mystery
		System.out.println("The Mystery Number = " + mystery);// Prints out the results based on all of the calculation
	}
}