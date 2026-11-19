
/*

Program: java          Last Date of this Revision: November 19, 2026

Purpose: To find different digits of the users 3 digit integer


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;
import java.util.Scanner;
public class exercise2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		//asking user for starting three digit integer
		System.out.println("Enter your 3 digit integer: ");
		   int num = input.nextInt();
		   
		   //giving the user the options for which digit they want
		   System.out.println("show (W)hole number.\n"
		   		+ "show (O)nes place number.\n"
				+ "show (T)ens place number.\n"
		   		+"show (H)undreds place number.\n"
				+ "(Q)uit\n"
				+ "Enter your choice of W, H, T, O, or Q: ");
		   
		   //reading the user's menu choice as a single uppercase character
		   char choice = input.next().toUpperCase().charAt(0);
		   
		    //calling the number method and storing the returned character in items
		   char items = (char) number(choice,num);
		   
		   //if statement to test for if the user wants a whole number
		    if (items == 'W') {
				System.out.println("The whole number is: " + num);
				} 
		   
			   //if statement to test for if the user wants the ones digit
		    else if (items == 'O')
		    
			    //doing algebra to find ones digit
		    {
		    	int num1 = num % 10;
				System.out.println("The Ones digit is: " + num1);
				} 
		   
			   //if statement to test for if the user wants the tens digit
		    else if (items == 'T') 
		    	
			    //doing algebra to find tens digit
		    {
		    	int num1 = num / 10;
		    	int num2 = num1 % 10;
				System.out.println("The Tens digit is: " + num2);
				} 
		    
			   //if statement to test for if the user wants the Hundreds digit
		    else if (items == 'H') 
		    	
		    //doing algebra to find hundreds digit
		    {
		    	int num1 = num / 100;
				System.out.println("The Hundreds digit is: " + num1);
				} 
		    
			   //if statement to test for if the user wants to quit
		    else if (items == 'Q') {
				System.out.println("Thanks for playing, see you next time!!");
				} 
		   
		   
		// TODO Auto-generated method stub

	}
	
//making it so that items is equal to choice
	private static int number(int choice, int num) {
		// TODO Auto-generated method stub
		return choice;
	}

	

}
/*
Enter your 3 digit integer: 
463
show (W)hole number.
show (O)nes place number.
show (T)ens place number.
show (H)undreds place number.
(Q)uit
Enter your choice of W, H, T, O, or Q: 
H
The Hundreds digit is: 4
*/