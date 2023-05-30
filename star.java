// Yadi Yang Assignemtn 3.12a Sep 21, 2017
public class star//3.12b
{
	public static void main(String[] args) 
	{
		int max = 10;
		for(int row=0; row<max; row++)
		{
			for(int i = 0; i<max-row; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}