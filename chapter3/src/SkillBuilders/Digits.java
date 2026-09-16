package SkillBuilders;

import java.util.Scanner;

public class Digits 
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		
		//Define Variables
		int number;
		int tens;
		int ones;
		

		//user enters the two digit number
		System.out.println("Enter your 2 digit number: ");
		number = input.nextInt();
		
		
		//finding the tens
		tens = number / 10;
		
		
		//finding the ones
		ones = number % 10;
		
		
		//printing the final results for the tens digit and ones digit
		System.out.println("The tens digit from you two digit number is: "+ tens);
	
		System.out.println("The ones digit from you two digit number is: "+ ones);
		
	}

}
