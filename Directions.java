// Yadi Yang Assignment B(a) Feb 21, 2017
// This program prints out the distance units

public class Directions
{//Name of the program
	public static void main(String[] args) 
	{   System.out.println("      Units and Conversion Factors");//The title of the output
	    System.out.println("----------------------------------------");//A line
	    double inch, yard, mile, centimeter, meter, kilometer, lightYear;//All names in the list
	    inch = 2.54;//Inch has the value of 2.54
	    yard = 0.9144;//Yard has the value of 0.9144
	    mile = 1.609;//Mile has the value of 1.609
	    centimeter = 0.3937;//Centimeter has the value of 0.3937
	    meter = 1.094;//Meter has the value of 1.094
	    kilometer = 0.6214;//Kilometer has the value of 0.6214
	    lightYear = 9.464E12;//Lightyear has the value of 9.464E12

	    System.out.println("1 inch = " + inch + " centimeters");//Prints out 1 inch = 2.54 centimeters
	    System.out.println("1 yard = " + yard + " meters");//Prints out 1 yard = 0.9144 meters
	    System.out.println("1 mile = " + mile + " kilometers");//Prints out 1 mile = 1.609 kilometers
	    System.out.println("1 centimeter = " + centimeter + " inches");//Prints out 1 centimeter = 0.3937 inches
	    System.out.println("1 meter = " + meter + " yards");//Prints out 1 meter = 1.094 yards
	    System.out.println("1 kilometer = " + kilometer + " miles");//Prints out 1 kilometer = 0.6214 miles
	    System.out.println("1 light year = " + lightYear + " kilometers");//Prints out 1 light year = 9.464E12 kilometers
		
	}
}