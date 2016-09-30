/*
  Program: Zodiac Signs
  Purpose: practice exiting while loops
  Created by: Mark Porter
  Date: October 16, 2015
*/


import java.util.Scanner ;
import java.util.Date ; 


public class Zodiac

{//opening of class

   public static void main (String[]args)

	{//opening of main method


	//VARIABLE LIST
	//=============

	String name ; 
	String sign ; 
	String month ;
	String special ;
	int date ; 
	 
	 


	


	//CREATE SCANNER OBJECT

	Scanner input = new Scanner(System.in) ;

	//GET INPUT MANG
	
	System.out.print ("\n\n") ;

	System.out.print ("        FIND YOUR ZODIAC SIGN!-- MARK PORTER\n") ; 

	System.out.print ("        -------------------------------------\n\n") ;

	

	System.out.print ("   Please enter your name or 'Exit' to quit:   ") ;
	
	name = input.nextLine() ; 


	


	
	//DO WHILE

	while (!name.equalsIgnoreCase ("exit"))

	{//start of while loop



		//GET THEIR INFO


	//FIRST DO THE MONTH

	System.out.print ("\n\n   Please enter the month you were born in (January-December):   ") ; 

	month = input.nextLine() ; 


	//THEN DO THE DATE

	System.out.print ("   Please enter the date of your birth:   ") ; 

	date = input.nextInt() ;


	//NOW FIND THE ZODIAC KILLA!!
	


	

	if (((month.equalsIgnoreCase ("March")) & ((21 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("April")) & (1 <= date) & (date <= 19))))

	{
	sign = "Aries" ;
	} 
	
	else if (((month.equalsIgnoreCase ("April")) & ((20 <= date) & (date <=  30)) || ((month.equalsIgnoreCase ("May")) & (1 <= date) & (date <= 20))))
	
	{
	sign = "Taurus" ;
	}
	
	else if (((month.equalsIgnoreCase ("May")) & ((21 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("June")) & (1 <= date) & (date <= 21))))

	{
	sign = "Gemini" ;
	}
	
	else if (((month.equalsIgnoreCase ("June")) & ((22 <= date) & (date <=  30)) || ((month.equalsIgnoreCase ("July")) & (1 <= date) & (date <= 22))))
	
	{
	sign = "Cancer" ;
	}
	
	else if (((month.equalsIgnoreCase ("July")) & ((23 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("August")) & (1 <= date) & (date <= 22 ))))
	
	{
	sign = "Leo" ;
	}
	
	else if (((month.equalsIgnoreCase ("August")) & ((23 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("September")) & (1 <= date) & (date <= 22))))
	
	{
	sign = "Virgo" ;
	}
	
	else if (((month.equalsIgnoreCase ("September")) & ((23 <= date) & (date <=  30)) || ((month.equalsIgnoreCase ("October")) & (1 <= date) & (date <= 23))))
	
	{
	sign = "Libra" ; 
	}

	else if (((month.equalsIgnoreCase ("October")) & ((24 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("November")) & (1 <= date) & (date <= 21))))

	{
	sign = "Scorpio" ;
	}

	else if (((month.equalsIgnoreCase ("November")) & ((22 <= date) & (date <=  30)) || ((month.equalsIgnoreCase ("DecemberDecember")) & (1 <= date) & (date <= 21))))

	{
	sign = "Sagittarius" ;
	}

	else if (((month.equalsIgnoreCase ("December")) & ((22 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("January")) & (1 <= date) & (date <= 19))))

	{
	sign = "Capricorn" ;
	}

	else if (((month.equalsIgnoreCase ("January")) & ((20 <= date) & (date <=  31)) || ((month.equalsIgnoreCase ("February")) & (1 <= date) & (date <= 18))))

	{
	sign = "Aquarius" ; 
	}

	else if (((month.equalsIgnoreCase ("February")) & ((18 <= date) & (date <=  29)) || ((month.equalsIgnoreCase ("March")) & (1 <= date) & (date <= 20))))

	{
	sign = "Pisces" ;
	}

	else
	{
	sign = "" ;
	System.out.printf ("\n\n   Sorry, %s, that is invalid input.\n\n", name) ; 

	}

	//end of if statement

	//new if for special days

	if ((month.equalsIgnoreCase("February")) & (date == 10))
	
	{
	special = "Woah you have the same birthday as Mark Porter!" ; 
	}

	else if ((month.equalsIgnoreCase("April")) & (date == 1))

	{
	special = "Your birth was a joke!" ;
	}

	else if ((month.equalsIgnoreCase("July")) & (date == 1))

	{
	special = "You are a true patriot, born on Canada Day!" ; 
	}

	else if ((month.equalsIgnoreCase("April")) & (date == 20))

	{
	special = "Really enjoy your birthday today!" ; 
	}

	else if ((month.equalsIgnoreCase("January")) & (date == 1))
	
	{
	special = "Ouu you were so close to being an entire year older!" ; 
	}
	
	else 
	{
	special = "" ; 
	}
	
	if (!sign.equalsIgnoreCase (""))

	{
	
	System.out.print  ("\n==============================================================================") ; 

	System.out.printf ("\n\n\n\n   %s, your birthday, %s %d, makes your Zodiac Sign %s.  \n   %s\n\n", name, month, date, sign, special) ; 
	
	System.out.print  ("\n==============================================================================\n\n") ; 
	
	}
	
	

		//GET NAME ONCE AGAIN
	
	//GET NAME OR OUT

	System.out.print  ("\n==============================================================================\n\n") ;

	System.out.print ("   Please enter your name or 'Exit' to quit:   ") ;
	
	name = input.nextLine() ; 
	name = input.nextLine() ; 


	
	}//end of while loop
	
	System.out.print ("\n\n   Thanks, please come again!\n\n") ; 

	System.out.print  ("\n==============================================================================\n\n") ;


}//closing of main method


}//closing of class