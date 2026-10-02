package SkillBuilders;
import java.util.Scanner;
public class Delivery
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		//define variables
		int length;
		int width;
		int height;
		
		//asking user for dimensions
		System.out.println("Enter the length of your package: ");
		length = input.nextInt();

		System.out.println("Enter the width of your package: ");
		width = input.nextInt();
		
		System.out.println("Enter the height of your package: ");
		height = input.nextInt();
		
		//runs tests to see if the dimensions of the package are good or too big
		if (length > 10)
		System.out.println("Reject package too big.");
		
		else if (width > 10)
		System.out.println("Reject package too big.");
		
		else if (height > 10)
		System.out.println("Reject package too big.");
		
		else if (length <= 10) 
		System.out.println("Accept.");
		
	//Close input
		input.close();
		// TODO Auto-generated method stub

	}

}
