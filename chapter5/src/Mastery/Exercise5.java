
/*

Program: java          Last Date of this Revision: October 8, 2026

Purpose: To calculate the number in each digits place of a entered number, displaying from the largest digits place to least.


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
		
		
		
		

		//user enters the two digit number
		System.out.println("Enter a positive integer: ");
		String numberStr = input.next();
		
		
		
		 for (int i = 0; i < numberStr.length(); i++) {
	            char digit = numberStr.charAt(i);
	            System.out.println(digit);
		}
	
	
	
	}
	
		
		
		// TODO Auto-generated method stub

	}


/*

Enter a positive integer: 
489524528789021
4
8
9
5
2
4
5
2
8
7
8
9
0
2
1

*/