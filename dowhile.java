// Yadi Yang Assignment I May 10, 2017
public class dowhile// Name of the program
{
	public static void main(String[] args) 
	{
		int a = 0;
		do
		{
			System.out.print(a+" ");
			a ++;
		}// Print out a for one time
		while(a<=20);// Print out a until the statement does not stand

		System.out.println(" ");
		System.out.println(" ");
		int b = 1;
		do
		{
			System.out.print(b+ " ");
			b += 2;
		}
		while(b<=50);

		System.out.println(" ");
		System.out.println(" ");
		int c = 0;
		do
		{
			System.out.print(c+" ");
			c += 10;
		}
		while(c<=200);

		System.out.println(" ");
		System.out.println(" ");
		int d = 97;
		do
		{
			System.out.print((char)d+" ");
			d ++;
		}
		while(d<=122);
		System.out.println(" ");
		System.out.println(" ");
	}
}