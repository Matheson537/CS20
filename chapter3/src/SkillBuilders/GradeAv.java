package SkillBuilders;


import java.util.Scanner;

public class GradeAv 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		
		//Define Variables
		int first;
		int second;
		int third;
		int fourth;
		int fifth;
		double Average;
		
		//set combined to 0 so that we can add to it gradually
		int combined = 0;
		
		//user enters the first grade
				System.out.println("Enter your first grade: ");
				first = input.nextInt();
				//adds the first value onto combined which = 0
				combined += first;

				
		//user enters the second grade
				System.out.println("Enter your second grade: ");
				second = input.nextInt();
				//adds the second value onto combined which = 0 + first
				combined += second;
				
				
		//user enters the third grade
				System.out.println("Enter your third grade: ");
				third = input.nextInt();
				//adds the third value onto combined which = 0 + first + second
				combined += third;
				
				
		//user enters the fourth grade
				System.out.println("Enter your fourth grade: ");
				fourth = input.nextInt();
				//adds the fourth value onto combined which = 0 + first + second + third
				combined += fourth;
				
		//user enters the fifth grade
				System.out.println("Enter your fifth grade: ");
				fifth = input.nextInt();
				//adds the fifth value onto combined which = 0 + first + second + third + fourth
				combined += fifth;
				
				//divide the combined grades by 5 to get the average
		Average = combined/5.0;
				
		//displays the average
				System.out.println("Your Grade Average is:  "+ Math.round (Average));
				
				
				
	}

}
