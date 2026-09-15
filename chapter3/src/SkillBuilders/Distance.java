package SkillBuilders;

import java.util.Scanner;


public class Distance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//Define Variables
		float first;
		float second;
		float third;
		float total;
		

		//user enters the distance of each segment
		System.out.println("Enter the Distance for the first Segment: ");
		first = input.nextFloat();
		
		System.out.println("Enter the Distance for the second Segment: ");
		second = input.nextFloat();
		
		System.out.println("Enter the Distance for the third Segment: ");
		third = input.nextFloat();
		
		//create formula for total
		total = first + second + third;
		
		//display the total
		System.out.printf("The distance of your race is: %.1f\n", total);
		
		
	}

}
