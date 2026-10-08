/*

Program: java          Last Date of this Revision: October 8, 2026

Purpose: To calculate the amount of years it would take to reach $5000 from $2500 at a 7.5% rate


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;


public class Exercise3 
{

	public static void main(String[] args) 
	{
		
		
		//define the variables
		int end = 5000;
		int counter = 0;
		
		//creates a loop that will keep multiplying the starting balance by the rate until it reaches the final threshold
		 for (double num = 2500; num <= end; num *= 1.075)
			 
		 //will continuously count the amount of times the starting balance is multiplied by the rate
		 {
			 counter ++;
	             
	        }
		
		//displays the starting amount, the amount of years it will take, the rate, and the final amount
		System.out.println("You started with $2500, with a rate of 7.5% every year it will take " + counter);
		System.out.println("years and you will end around $5000");
		
		// TODO Auto-generated method stub

	}

}
/*

You started with $2500, with a rate of 7.5% every year it will take 10
years and you will end around $5000


*/