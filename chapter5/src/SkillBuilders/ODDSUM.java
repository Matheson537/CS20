package SkillBuilders;
import java.util.Scanner;
public class ODDSUM 
{

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		 
		int first;
		int second;
		int chance;
		
		first = 1;
		second = 20;
		
		int sum = 0;
		
		   System.out.print("Enter a number: ");
	        // Step 2: Read the user's input as an integer
	        int userLimit = scanner.nextInt();

	        for (int num = 1; num <= userLimit; num+=2) {
	            System.out.println(num);
	            sum += num;  
	        }
	        
	        System.out.println("The total sum of all numbers is: " + sum);
	

	            
		
		
		// TODO Auto-generated method stub

	}

}
