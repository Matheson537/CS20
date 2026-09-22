/*
Program: java          Last Date of this Revision: September 22, 2026

Purpose: An application that calculates the lowest amount of 
coins possible to reach a certain value

Author: Matheson Lee-Tremblay, 
School: CHHS
Course: Computer Programming 20-1
*/


package Mastery;
import java.util.Scanner;
public class Exercise5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//define variables, all in integers
		int change;
		int quarters;
		int nickels;
		int dimes;
		int pennies;
		
		
		//ask user for change
		System.out.println("Enter the change in cents: ");
		change = input.nextInt();
		
		//calculate max quarters
		quarters = change / 25;
		
		//calculate max dimes
				dimes = (change - quarters * 25) / 10;
		
		
		//calculate max nickels
				nickels = (change - quarters * 25 - dimes * 10) / 5;
		
		//calculate max pennies
				pennies = (change - quarters * 25 - dimes * 10 - nickels * 5) / 1;
		
		//display the final results
				System.out.println("The Minimum number of coins is: ");
				System.out.println("Quarters: "+ quarters);
				System.out.println("Dimes: "+ dimes);
				System.out.println("Nickels: "+ nickels);
				System.out.println("Pennies: "+ pennies);
		// TODO Auto-generated method stub

	}

}
/*

Enter the change in cents: 
93
The Minimum number of coins is: 
Quarters: 3
Dimes: 1
Nickels: 1
Pennies: 3

*/