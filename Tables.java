package Usecase;
import java.util.Scanner;


public class Tables {
	
	
	static int multiplyy (int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n + " X " + i + " = " + n*i);
			

		}
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter which table u want:");
		int a= s.nextInt();
		a = multiplyy(a);
		
	
	   
	    		
	   
	    
	}
}
	
	    
		
		
		
		

