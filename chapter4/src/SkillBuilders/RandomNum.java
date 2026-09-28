package SkillBuilders;
import java.util.Scanner;
import java.lang.Math;
public class RandomNum 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
	
		int first;
		int second;
		int chance;
		
		
		//user enters the first number
				System.out.println("Enter your first number: ");
				first = input.nextInt();

		//user enters the second number
		System.out.println("Enter your second which is greater than the first: ");
		second = input.nextInt();
		
		//generate chance using a equation containing a random number generator
		chance = (int)((second - first + 1) * Math.random() + first);
		
		System.out.println("A random number between "+ first + " and " + second + " is " + chance);

		
		
		// TODO Auto-generated method stub

	}

}
