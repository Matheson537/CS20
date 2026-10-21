package SkillBuilders;
import java.util.Scanner;
public class Exponentiation
{

	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 numbers, the first being the base, the second being the exponent.");
		System.out.println("Enter your first number: ");
		   int base = input.nextInt();
		   
		   
		   System.out.println("Enter your second number: ");
		   int exponent = input.nextInt();
		   
		   
		   double result = Math.pow(base, exponent);
		   
		   System.out.println("when you have " + base + " to the power of " + exponent + " your result is: " + result);
		
		
		// TODO Auto-generated method stub

	}

}
