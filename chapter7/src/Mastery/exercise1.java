
/*

Program: java          Last Date of this Revision: November 16, 2026

Purpose: To calculate the amount of money for each amount of product and display their different nutrional stats.


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/
package Mastery;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) 
	{
		
		//import scanner input
		Scanner input = new Scanner(System.in);

		
		
		
		
		//ask the user for their amount of each product
		System.out.println("Enter your amount of hamburgers: ");
		   int hamburgers = input.nextInt();
		   
		   System.out.println("Enter your amount of salad: ");
		   int salad = input.nextInt();
		
		   System.out.println("Enter your amount of french fries: ");
		   int frenchfries = input.nextInt();
		   
		   System.out.println("Enter your amount of soda: ");
		   int soda = input.nextInt();
		   
		   //calculate the amount of money each product costs
		   double hamburgers1 = hamburgers * 1.85;
		   double salad1 = salad * 2.00;
		   double frenchfries1 = frenchfries * 1.30;
		   double soda1 = soda * 0.95;		   
		   
		//get the total price for their entire order
		   double total = soda1 + frenchfries1 + hamburgers1 + salad1;
		   
		   
		   //method to display everything including there individual prices, there amount, and the nutritional stats
		   int items = food(hamburgers,salad,frenchfries,soda);
			System.out.println("The total price for " + hamburgers + " hamburger(s) is " + String.format("%.2f", hamburgers1) + ". " + "For each hamburger it has 9g of fat, 33g carbohydrates, and 1g fiber\n" + 
					"The total price for " + salad + " salad(s) is " + String.format("%.2f", salad1) + ". " + "For each salad it has 1g of fat, 11g carbohydrates, and 5g fiber\n" +
					"The total price for " + frenchfries + " french frie(s) is " + String.format("%.2f", frenchfries1) + ". " + "For each french fries it has 11g of fat, 36g carbohydrates, and 4g fiber\n" +
					"The total price for " + soda + " soda(s) is " + String.format("%.2f", soda1) + ". " +  "For each soda it has 0g of fat, 38g carbohydrates, and 0g fiber\n");
	
			
			//display the total price for everything
			   System.out.println("Your total cost is " + String.format("%.2f", total));
			   
				

		// TODO Auto-generated method stub

	}

	//create the method food
	private static int food(int hamburgers, int salad, int frenchfries, int soda) {
		return 0;
	}

}

/*
 Enter your amount of hamburgers: 
4
Enter your amount of salad: 
4
Enter your amount of french fries: 
4
Enter your amount of soda: 
4
The total price for 4 hamburger(s) is 7.40. For each hamburger it has 9g of fat, 33g carbohydrates, and 1g fiber
The total price for 4 salad(s) is 8.00. For each salad it has 1g of fat, 11g carbohydrates, and 5g fiber
The total price for 4 french frie(s) is 5.20. For each french fries it has 11g of fat, 36g carbohydrates, and 4g fiber
The total price for 4 soda(s) is 3.80. For each soda it has 0g of fat, 38g carbohydrates, and 0g fiber
 */
