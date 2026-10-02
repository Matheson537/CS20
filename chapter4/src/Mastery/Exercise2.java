/*

Program: java          Last Date of this Revision: October 2, 2026

Purpose: To determine whether a customers package abides by the rules of the packaging system, if it's too large or too heavy.


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;
import java.util.Scanner;

public class Exercise2 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		//define variables
				int length;
				int width;
				int height;
				int weight;
				
				//asking user for dimensions
				System.out.println("Enter the length of your package: ");
				length = input.nextInt();

				System.out.println("Enter the width of your package: ");
				width = input.nextInt();
				
				System.out.println("Enter the height of your package: ");
				height = input.nextInt();
				
				//asks for the weight
				System.out.println("Enter the weight of your package in kilograms: ");
				weight = input.nextInt();
				
				//runs tests to see if the dimensions of the package are good or too big
				if (length * width * height > 100000 && weight > 27) {
				System.out.println("Reject package too large and too heavy.");
				}
				else if (width * length * height > 100000){
				System.out.println("Reject package too large.");
				}
				
				else if (weight > 27){
					System.out.println("Reject package too heavy.");
					}
			
				else  {  
					System.out.println("Your package is good to go.");
					}
		
	
		
		// TODO Auto-generated method stub

	}

}
/*
 
Enter the length of your package: 
100
Enter the width of your package: 
40
Enter the height of your package: 
30
Enter the weight of your package in kilograms: 
20
Reject package too large.

 
 */
