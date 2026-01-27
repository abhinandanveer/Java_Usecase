package Hw;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String Name = sc.nextLine();
		System.out.print("Enter the English Marks: ");
		int english = sc.nextInt();
		System.out.print("Enter the Maths Marks: ");
		int maths = sc.nextInt();
		if(english < 100 || maths < 100) {
		int total = english + maths;
		float per = total/2.0f;
		
		String grade;
		if(per>=90) {
			grade = "A";
		}
		else if(per>=75) {
			grade = "B";
			
		}
		else if(per>=50) {
			grade = "C";
			
		}
		else {
			grade = "Fail";
			
		}
		 System.out.println("Student: "+Name);
		 System.out.println("English: "+english);
		 System.out.println("Maths: "+maths);
		 System.out.println("Total: "+total);
		 System.out.println("Percentage: "+per +"%");
		 System.out.println("Grade: "+grade);
		 
		}
		else {
			 System.out.println("Invlaid input ::Enter the marks in between 0 to 100");

		}

		
		
		
		
		
		

	}

}
