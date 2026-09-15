package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		
		//Declare Variables
		int width;
		int length;
		int area; 
		int perimeter;
		
		//Ask for length and width
		System.out.println("Enter a Width: ");
		width = input.nextInt();
		
		System.out.println("Enter a Length: ");
		length = input.nextInt();
		
		// display length and width
		System.out.println("The length is: " + length);
		
		System.out.println("The width is: " + width);
		
		//Create formula for area
		area = width * length;
		
		//display area on the screen
		System.out.println("The area is: "+ area);
		
		//Create the formula for the perimeter
		perimeter = (2 * length + width *2);
		
		//Display the perimeter on the screen
		System.out.println("The perimeter is: " + perimeter);
		
		
	}

}
