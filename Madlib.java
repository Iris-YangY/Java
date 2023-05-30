// Yadi Ysng Assignment G
import java.util.Scanner;// This method allows the users to put in words

public class Madlib// Name of the program
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String a, b, c, d, e, f, g, h, i, j, k, l;// Declare variables
		System.out.println("[1] Enter a NOUN -->");
		a = keyboard.nextLine();// nextLine method allow users to put in string with spaces between them
		System.out.println("[2] Enter a type of VEHICLE -->");
		b = keyboard.nextLine();
		System.out.println("[3] Enter an ADJECTIVE -->");
		c = keyboard.nextLine();
		System.out.println("[4] Enter an ADJECTIVE -->");
		d = keyboard.nextLine();
		System.out.println("[5] Enter a NOUN -->");
		e = keyboard.nextLine();
		System.out.println("[6] Enter a NOUN -->");
		f = keyboard.nextLine();
		System.out.println("[7] Enter an ADJECTIVE -->");
		g = keyboard.nextLine();
		System.out.println("[8] Enter a VERB ending in 'ed' -->");
		h = keyboard.nextLine();
		System.out.println("[9] Enter a NOUN -->");
		i = keyboard.nextLine();
		System.out.println("[10] Enter a NOUN -->");
		j = keyboard.nextLine();
		System.out.println("[11] Enter a NOUN -->");
		k = keyboard.nextLine();
		System.out.println("[12] Enter a NOUN -->");
		l = keyboard.nextLine();// The user put in all the variables
		System.out.println();
		System.out.println("       GILLIGAN'S ISLAND THEME       ");
		System.out.println();
		System.out.println("Just sit right back and you`ll hear a tale,");
		System.out.println("A tale of a fateful " + a + ",");
		System.out.println("That started from this tropic port,");
		System.out.println("Aboard this tiny " + b + ".");
		System.out.println();
		System.out.println("The mate was a " + c +" sailor man,");
		System.out.println("The skipper " + d + " and sure.");
		System.out.println("Five " + e + " set sail that day,");
		System.out.println("For a three hour " + f + ", a three hour " + f + ".");
		System.out.println();
		System.out.println("The weather started getting " + g + ",");
		System.out.println("The tiny " + b + " was " + h + ",");
		System.out.println("If not for the " + i + " of the fearless crew,");
		System.out.println("The " + j + " would be lost, the " + j + " would be lost.");
		System.out.println();
		System.out.println("The " + b + " set ground on the shore of this uncharted desert isle,");
		System.out.println("With Gilligan, The Skipper too,");
		System.out.println("The millionaire and his " + k + ", The movie " + l + ",");
		System.out.println("And The Rest, Here on Gilligan`s Isle.");// The variables are arranged into the song with their code
	}
}