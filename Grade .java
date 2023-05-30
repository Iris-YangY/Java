// Yadi Yang Assignment C Mar 1, 2017
// This program prints out the student's grade

public class Grade// The name of the program
{
	public static void main(String[] args) 
	{   double dailyAvg = 88, quizAvg = 74, testAvg = 95, sixWeeksAvg = 0;
		int roundedAvg = 0;
		sixWeeksAvg = dailyAvg * 0.3 + quizAvg * 0.2 + testAvg * 0.5;
		roundedAvg = sixWeeksAvg + 0.5;

		System.out.println("Daily Average = " + dailyAvg);
		System.out.println("Quiz Average = " + quizAvg);
		System.out.println("Test Average = " + testAvg);
		System.out.println("- - - - - - - - - - - - - - - - -");
		System.out.println("Six Weeks Average = " + roundedAvg);
	}
}