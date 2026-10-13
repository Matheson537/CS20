package SkillBuilders;
import java.util.Scanner;
public class TimeConverter
{

	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner(System.in);
		int hours;
		int days;
		int minutes;
	int exhours;
	int exminutes;
		System.out.println("1 to convert days to hours.");
		System.out.println("2 to convert hours to days.");
		System.out.println("3 to convert minutes to hours.");
		System.out.println("4 to convert hours to minutes");
		System.out.println("Enter which choice you would like: ");
		   int choice = input.nextInt();
		   
		   
		   if (choice == 1) {
			   System.out.println("Enter the amount of days: ");
			   int days1 = input.nextInt();
			   hours = days1 * 24;
			   System.out.println("The total hours in " + days1 + " days is " + hours + ".");
		   }
		
		   if (choice == 2) {
			   System.out.println("Enter the amount of hours: ");
			   int hours1 = input.nextInt();
			  days = hours1 / 24;
			  exhours = hours1 % 24;
			   System.out.println("The total days in " + hours1 + " hours is " + days + " day(s) and " + exhours + " hours.");
		   }
		
		
		
		   if (choice == 3) {
			   System.out.println("Enter the amount of minutes: ");
			   int minutes1 = input.nextInt();
			   hours = minutes1 / 60;
			   exminutes = minutes1 % 60;
			   System.out.println("The total hours in " + minutes1 + " minutes is " + hours + " hour(s) and " + exminutes + " minutes.");
		   }
		
		   if (choice == 4) {
			   System.out.println("Enter the amount of hours: ");
			   int hours1 = input.nextInt();
			   minutes = hours1 * 60;
			   System.out.println("The total minutes in " + hours1 + " hours is " + minutes + ".");
		   }
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
