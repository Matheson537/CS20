package SkillBuilders;
import java.util.Scanner;
public class NumberSum
{

	public static void main(String[] args) 
	
	{
		
		
		 Scanner scanner = new Scanner(System.in);
		   int sum = 0;
		
				   System.out.print("Enter a number: ");
			        // Step 2: Read the user's input as an integer
			        int userLimit = scanner.nextInt();
		
			        for (int num = 0; num <= userLimit; num++) {
			            System.out.println(num);
			            sum += num;  
			        }
			        
			        
			        System.out.println("The total sum of all numbers is: " + sum);
			        
			       
			        scanner.close();

			        
			        
		// TODO Auto-generated method stub

	}

}
