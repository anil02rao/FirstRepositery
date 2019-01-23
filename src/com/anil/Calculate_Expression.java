/**
 * @author  Priya
  Question :
  Evaluate the following Expression :
  1. Math.floor(Math.min(13.7,-15.7))
  2. K %= ++a + a-- * 5 - a where initially k=60, a=5
 */
package com.anil; // Declaration of package

public class Calculate_Expression {

	public static void main(String[] args) {

		// Part 1:
		/* 
		 ------------------------------------------------------------------------------------------
		 Math.min (13.5, -15.7) ==> Here Math is a class in java.lang package
		 min(13.5, -15.7) == Here min is a method of Math class will return minimum value -15.7 
		 ------------------------------------------------------------------------------------------
		 Math.floor(-15.7) ==> Here Math is class and floor is a method will convert value from (-15.7) to (16.0) 
		 */
		System.out.println(Math.floor(Math.min(13.7, -15.7)));
		
		// Part 2:
		int a = 0, k = 0; // Declaration of variable a and k
		
		/* 
		  Precedence of Operators:
		   ++a and a-- have higher precedence
		   * -- have higher precedence
		   +,- -- have higher precedence
		   %= -- (short hand operator) have higher precedence\
		   
		   K %= ++0 + 0-- * 5 - a;
		   K %= 1 + -1 * 5 - 0;
		   k %= 1 + -5 -0;
		   k %= -4 -0;
		   k %= -4;  //we can write k%= -4; like k=k%-4;
		   k=k%-4;
		   k=0%4; // % means reminder 
		   
		 */
		//System.out.println(++a + a--);
		System.out.println(k %= ++a + a-- * 5 - a); // Calculation of expression
		
	}

}
