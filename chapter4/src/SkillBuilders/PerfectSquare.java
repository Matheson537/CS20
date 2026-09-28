package SkillBuilders;
import java.util.Scanner;
import java.lang.Math;
public class PerfectSquare 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int number;
		double root;
		
		//user enters the number
				System.out.println("Enter your number: ");
				number = input.nextInt();
		
				
				//square root number 
			root = Math.sqrt(number);
			
			if (root == (int)root) 
			System.out.println("Your number is a perfect square: ");
		
			else
			System.out.println("Your number is NOT a perfect square: ");
			
			
			
		// TODO Auto-generated method stub

	}

}
