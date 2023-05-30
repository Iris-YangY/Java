// Yadi Yang Assignment I May 4, 2017
public class While// Name of the program
{
	public static void main(String[] args) 
	{
		int count = 1;// State the starting of the loop
		while(count<26)// State the condition, if the condition is true, the loop will sork
		{
			System.out.print(count + " ");
			count ++;// System prints out the result of looping
		}
		System.out.println(" ");
		System.out.println(" ");// An empty line

		int a = 50;// State the starting of the loop
		while(a<71)// State the condition
		{
			System.out.print(a + " ");
			a ++;
		}
		System.out.println(" ");
		System.out.println(" ");

		int count3 = 0;
		while(count3<101)
		{
			System.out.print(count3 + " ");
			count3 += 5;
		}
		System.out.println(" ");
		System.out.println(" ");

		int count4 = 1;
		while(count4<=15)
		{
			System.out.println("computer");
			count4++;
		}
	}
}