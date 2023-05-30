import java.util.Scanner;
public class bubblesort
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int[] array = new int[12];
		System.out.println("This array contains 12 elements.");
		for(int i=0; i<12; i++)
		{
			int a=12-i;
			System.out.println("Give me "+a+" numbers:");
			int element=keyboard.nextInt();
			array[i]=element;
		}
		for(int i=0; i<11; i++)
		{
			for(int j = 1;j<(11-i);j++)
			{
				if(array[j-1]>array[j])
				{
					int temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		for(int i=0; i<12; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}