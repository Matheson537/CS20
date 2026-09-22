/*
Program: java          Last Date of this Revision: September 22, 2026

Purpose: Determines the number in the hundreds digit, tens digit, 
ones digit from a 3 digit number entered by the user
Author: Matheson Lee-Tremblay, 
School: CHHS
Course: Computer Programming 20-1
*/



package Mastery;

import java.util.Scanner;

public class Exercise6 
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		
		//Define Variables
		int number;
		int tens;
		int ones;
		int hundreds;

		//user enters the two digit number
		System.out.println("Enter your 3 digit number: ");
		number = input.nextInt();
		
		//finding the hundreds
		hundreds = number / 100;
		
		
		//finding the tens
		tens = (number % 100) / 10;
		
		
		//finding the ones
		ones = number % 10;
		
		
		//printing the final results for the hundreds digit tens digit and ones digit
		System.out.println("The hundreds digit from your three digit number is: "+ hundreds);
		
		System.out.println("The tens digit from your three digit number is: "+ tens);
	
		System.out.println("The ones digit from your three digit number is: "+ ones);
		
	}

}
/*
 
Enter your 3 digit number: 
874
The hundreds digit from your three digit number is: 8
The tens digit from your three digit number is: 7
The ones digit from your three digit number is: 4

*/