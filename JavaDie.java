//package javaappdie;

import java.util.Scanner;
import java.util.Random;  

public class JavaDie 
{
	public static void main(String[] args) 
	{
    	class Die 
    	{  
			public final int MIN_FACES = 4;
			private int faceValue;
			Random generator = new Random();
			int numFaces;
		
			public void Die()
			{
				numFaces=6;
				faceValue = 1;
			}
			public void Die(int faces)
			{
				if (faces < MIN_FACES)
					numFaces=6;
				else
					numFaces = faces;
					faceValue = 1;
			}
			public int roll()
			{
				faceValue = generator.nextInt(numFaces)+1;
				return faceValue;
			}
			public int getFaceValue()
			{return faceValue;}
		}    

		Scanner g = new Scanner(System.in);
	    Scanner keyboard = new Scanner(System.in);
	    
	    Random rand = new Random();
	    Die o = new Die();

	    System.out.println("no of faces ");
	    int no = keyboard.nextInt();
	    o.Die(no); 
	    System.out.println("Do you want to roll the dice?(Y/N) ");
	    String in = keyboard.next();
	    while (in.equals("Y") || in.equals("y"))
	    {
	   		int pick = o.roll();
	      	System.out.println(pick);
		    System.out.println("Do you want to roll the dice?(Y/N) ");
		    in = keyboard.next();
		}
	}
}
    