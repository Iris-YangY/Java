//3.12 d
public class ssstars
{
	public static void main(String[] args) 
	{
		int max = 10;
		for(int row=0; row<max;row++)
		{
			for(int a=0; a<=row; a++)
			{
				System.out.print(" ");
			}
			for(int i=0; i<max-row; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}