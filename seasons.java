// Yadi Yang Assignment H May, 1, 2017
// This system prints out the 
import java.util.Scanner;// Delcare the class which allows the users to put in variable values of grade
public class seasons// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String s1 = "Spring";
		String s2 = "Summer";
		String s3 = "Fall";
		String s4 = "Winter";

		System.out.println("Enter a Season -->");
		String season = keyboard.next();
		if(season.equalsIgnoreCase(s1))// Giving the condition if the string has the same characters with the declared string, system will print out the following statement, if not, system will search at the following statement and find out the fit one then print out the result
		{
			System.out.println("Season: Spring");
			System.out.println("  Meteoroloical:");
			System.out.println("    March 20 - June 21");
			System.out.println("  Astronomical:");
			System.out.println("    Vernal Equinox - Summer Solstice");
		}
		else if (season.equalsIgnoreCase(s2)) 
		{
			System.out.println("Season: Summer");
			System.out.println("  Meteoroloical:");
			System.out.println("    June 21 - September 22");
			System.out.println("  Astronomical:");
			System.out.println("    Summer Solstice - Autumnal Equinox");
		}
		else if (season.equalsIgnoreCase(s3)) 
		{
			System.out.println("Season: Fall");
			System.out.println("  Meteoroloical:");
			System.out.println("    September 22 - December 21");
			System.out.println("  Astronomical:");
			System.out.println("    Autumnal Equinox - Winter Solstice");
		}
		else if (season.equalsIgnoreCase(s4)) 
		{
			System.out.println("Season: Winter");
			System.out.println("  Meteoroloical:");
			System.out.println("    December 21 - March 20");
			System.out.println("  Astronomical:");
			System.out.println("    Winter Solstice - Vernal Equinox");
		}
	}
}