/*

Program: java          Last Date of this Revision: October 2, 2026

Purpose: To calculate the total price and individual price of copies base on the amount purchased.


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/

package Mastery;
import java.util.Scanner;

public class Exercise1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//define my variables
		int copies;
		double total;
		
		System.out.println("Enter the amount of copies you require: ");
		copies = input.nextInt();
		
		if (copies <= 99) {
		System.out.println("The price per copy is: $0.30");
total = copies * 0.30;
System.out.println("The total price for your copies is: $" + String.format("%.2f", total));
		}


else if (copies <= 499) {
System.out.println("The price per copy is: $0.28");
total = copies * 0.28;

System.out.println("The total price for your copies is: $" + String.format("%.2f", total));
}
		
		
else if (copies <= 749) {
System.out.println("The price per copy is: $0.27");
total = copies * 0.27;
System.out.println("The total price for your copies is: $" + String.format("%.2f", total));
}

else if (copies <= 1000) {
System.out.println("The price per copy is: $0.26");
total = copies * 0.26;
System.out.println("The total price for your copies is: $" + String.format("%.2f", total));
}

else if (copies > 1000) {
System.out.println("The price per copy is: $0.25");
total = copies * 0.25;
System.out.println("The total price for your copies is: $"  + String.format("%.2f", total));
}
		
		
		
		// TODO Auto-generated method stub

	}

}

/*
 
 Enter the amount of copies you require: 
30042
The price per copy is: $0.25
The total price for your copies is: $7510.50

*/
