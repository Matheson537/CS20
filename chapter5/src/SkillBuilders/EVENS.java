package SkillBuilders;
import java.util.Scanner;
import java.lang.Math;
public class EVENS 
{

	public static void main(String[] args)
{
		Scanner input = new Scanner(System.in);
		

		int first;
		int second;
		int chance;
		
		first = 1;
		second = 20;
		

		while (true) {
		
		//generate chance using a equation containing a random number generator
		chance = (int)((second - first + 1) * Math.random() + first);
		
		
		if (chance % 2 == 0) {
		System.out.println("A random even number between "+ first + " and " + second + " is " + chance);
		break;
		}
		
		
		
		else {
			continue;
		}
}
		
		
		// TODO Auto-generated method stub

	}

}
