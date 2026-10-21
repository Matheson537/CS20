
/*

Program: java          Last Date of this Revision: October 21, 2026

Purpose: To calculate the amount of money the user has using a method.


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/




package Mastery;
import java.util.Scanner;
public class Exercise5
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		//define variables
		
		int quarters;
		
		int dimes;
		
		int nickels;
		
		int pennies;

		//Ask for inputs
		System.out.println("Enter your amount of quarters: ");
		quarters = input.nextInt();
		
		System.out.println("Enter your amount of dimes: ");
		dimes = input.nextInt();
		
		System.out.println("Enter your amount of nickels: ");
		nickels = input.nextInt();
		
		System.out.println("Enter your amount of pennies: ");
		pennies = input.nextInt();
		
		//define totalmoney and set it equal to calculatetotaldollars and display the total
		double totalMoney = calculateTotalDollars(quarters,dimes,nickels,pennies);
		System.out.println("Total money: $" + totalMoney);
		
	}
		//calculate the total using a method
		public static double calculateTotalDollars(int quarters, int dimes, int nickels, int pennies)
		
		{
		return (quarters * 0.25) + (dimes * 0.10) + (nickels * 0.05) + (pennies * 0.01);
		
		
		}
		
		
		// TODO Auto-generated method stub

	}



/*

Enter your amount of quarters: 
6
Enter your amount of dimes: 
3
Enter your amount of nickels: 
4
Enter your amount of pennies: 
5
Total money: $2.05

*/