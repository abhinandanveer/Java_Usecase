package usecase;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orgpin = 1234;
		try {
			System.out.println("Enetr the pin");
			int pin = sc.nextInt();
			if(pin != orgpin) {
				throw new Exception("wrong pin");
				
			}
			System.out.println("Verified correct pin");
		}
		catch(Exception e)
		{
			System.out.println("Error:" + e.getMessage());
			
		}
		finally {
			System.out.println("looged out");
		}
		
		
	}
}

		
	

	