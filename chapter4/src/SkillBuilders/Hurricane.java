package SkillBuilders;
import java.util.Scanner;
public class Hurricane 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int speed;
		
		//user enters the wind speed
				System.out.println("Enter the wind speed of your hurricane in Miles Per Hour: ");
				speed = input.nextInt();
		
				if (speed <= 95)
				System.out.println("You have a category 1 Hurricane: 14-95mph or 64-82kt or 119-153km/hr");
				
				else if (speed <= 110)
				System.out.println("You have a category 2 Hurricane: 95-110mph or 83-95kt or 154-177km/hr");
				
				else if (speed <= 130)
				System.out.println("You have a category 3 Hurricane: 111-130mph or 96-113kt or 178-209km/hr");
				
				else if (speed <= 155)
				System.out.println("You have a category 4 Hurricane: 131-155mph or 114-135kt or 210-249km/hr");
				
				else if (speed > 155)
				System.out.println("You have a category 5 Hurricane: Greater than 155mph or 135kt or 249km/hr");
				
		// TODO Auto-generated method stub

	}

}
