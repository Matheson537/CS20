

/*

Program: java          Last Date of this Revision: October 26, 2026

Purpose: To create a house using methods.


Author: Matheson, 
School: CHHS
Course: Computer Programming 20
 

*/


package Mastery;
public class Home
{
	public static void main(String[] args) 
	{

	
	
	//define variables
	int shingles = 0;
	int shingle = 0;
	//define Roof and set it equal to addroof and display the roof
	String Roof = addroof(shingles, shingle);
	System.out.println(Roof);
	
	//define variables
	int Wall = 0;
	int Walls = 0;
	
	//define Base and set it equal to addbase and display the base
	String Base = addbase(Wall, Walls);
	System.out.println(Base);
	
	//define variables
	int Walkway = 0;
	int Walkway1 = 0;
	
	//define Walk and set it equal to addwalk and display the walk
	String Walk = addwalk(Walkway, Walkway1);
	System.out.println(Walk);
	}
	
	
	//create the roof and return it to the method
	public static String addroof(int shingles, int shingle)
	
	{
	return "   /\\\n" +
            "  /  \\\n" +
            " /    \\\n" +
            "/______\\";
	
	//
	
	}
	
	
		//create the base and return it to the method
		public static String addbase(int shingles, int shingle)
		
		{
		return "|       |\n" +
				"|       |\n" +
				"|______ |\n" ;
		
		
		}
	
			//create the walk and return it to the method
			public static String addwalk(int shingles, int shingle)
			
			{
			return "  **  \n" +
					"     *************\n" ;
				
			
			}


}


/*
   /\
  /  \
 /    \
/______\
|       |
|       |
|______ |

  **  
     *************
 */ 
