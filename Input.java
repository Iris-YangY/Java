import java.util.Scanner;

public class Input
{
	public static void main(String[] args) 
	{	
		Scanner keyboard = new Scanner(System.in);
		int age, height, weight;

		System.out.println("How old are you?");
		age = keyboard.nextInt();

		System.out.println("How tall are you in centimeter?");
		height = keyboard.nextInt();

		System.out.println("How much do you weigh in kilogram?");
		weight = keyboard.nextInt();

		System.out.println("So you're " + age + " years old, " + height + " cm tall and " + weight + " kg heavy");
	}
}