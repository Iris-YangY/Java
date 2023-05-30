import java.util.Scanner;
public class sort
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
			int min = i;
			for(int j = i+1;j<12;j++)
			{
				if(array[j]<array[min])
				{
					min = j;
				}
			}
			int temp = array[min];
			array[min]=array[i];
			array[i]=temp;
		}
		for(int i=0; i<12; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}