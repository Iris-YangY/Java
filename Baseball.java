// Yadi yang Assignment c Mar 2, 2017
// This system prints out the average number of baseball

public class Baseball// The name of the program
{
	public static void main(String[] args) 
	{	
		int hits = 27, atBats = 80, roundedAvg = 0;// Declare variables
		double battingAvg = 0;
		Double hitsnum = new Double((double)hits);// Store int number into double
		battingAvg = hitsnum / atBats;// Calculating the batting average
		battingAvg += 0.0005;
		battingAvg *= 1000;
		roundedAvg = (int) battingAvg;// Store the double number into integer

		System.out.println("Hits = " + hits);// Prints out the hits number
		System.out.println("At Bats = " + atBats);// Prints out the at bats number
		System.out.println("- - - - - - - - - - - - - - - - -");// A line
		System.out.println("Batting Average = " + roundedAvg);// Prints out the integer of the result calculated by the formula


	}
}