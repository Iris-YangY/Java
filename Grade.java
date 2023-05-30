// Yadi Yang Assignment C Mar 1, 2017
// This program prints out the student's grade

public class Grade// The name of the program
{
	public static void main(String[] args) 
	{   double dailyAvg = 88, quizAvg = 74, testAvg = 95, sixWeeksAvg = 0;// Declare the value of variables
		int roundedAvg = 0;
		sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5;// Cst the calculation program
		sixWeeksAvg += 0.5;
		roundedAvg = (int) sixWeeksAvg;// Store the double number into int

		System.out.println("Daily Average = " + dailyAvg);// Prints out the daily average result
		System.out.println("Quiz Average = " + quizAvg);// Prints out the quiz average result
		System.out.println("Test Average = " + testAvg);// Prints out the test average result
		System.out.println("- - - - - - - - - - - - - - - - -");// A line
		System.out.println("Six Weeks Average = " + roundedAvg);// Prints out the result of the average grade with integer
	}
}