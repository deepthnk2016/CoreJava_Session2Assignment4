package com.acadgild;

import java.util.Scanner;

/**
 * 
 * @author Deepak
 * @date   27/05/2017
 * @descr  Accept a number and display if its 0 or +ve or -ve
 * -----------------------------------------------------------
 * @descr  Accept marks in three subjects, calculate average
 *         and display grade
 * ------------------------------------------------------------
 */
public class TestDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		//Accept the number
		System.out.print("Enter Number:");
		int input=s.nextInt();
		
		//Convert the accepted the number to character
		char inputValue1=Integer.toString(input).charAt(0);
		
		//Check if the input number is 0 or +ve or -ve
		if (input==0){
			System.out.println("You Have Entered Zero");
		}else if(input>0){
			System.out.println("You Have Entered Positive Value");
		}else{
			System.out.println("You Have Entered Negative Value");
		}
		
		//Display the ASCII value of the input number
		System.out.println("ASCII Value of "+input+ " is "+(int)inputValue1);
		
		
		System.out.println("--------------------------");
		Scanner marks=new Scanner(System.in);
		
		float averageMarks;
		
		//Accept marks in Physics, Chemistry and Maths
		System.out.println("Enter Marks in Physics: ");
		int marksPhysics=marks.nextInt();
		
		System.out.println("Enter Marks in Chemistry::");
		int marksChemistry=marks.nextInt();
		
		System.out.println("Enter Marks in Mathematics::");
		int marksMaths=marks.nextInt();
		
		//Calculate Average
		averageMarks=(marksPhysics+marksChemistry+marksMaths)/3;
		System.out.println("Average Marks = "+averageMarks);
		
		//Display Grade
		if (averageMarks>70){
			System.out.println("Grade A");
		}else if (averageMarks>=61 &&averageMarks<=70){
			System.out.println("Grade B");
		}else{
			System.out.println("Grade C");
		}
		
		
		s.close();
		marks.close();
	}

	
}
