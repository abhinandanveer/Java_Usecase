package Usecase;
import java.util.Scanner;

class Square {
	int length;
	int breadth;
	
	public int area() {
		int a=length*breadth;
		return a;
	}
	public int peri() {
		int p = 2*(length +breadth);
		return p;
	}
	
}


public class sqare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Square cal =new Square();
		System.out.println("Enter the length");
		cal.length = s.nextInt();
		System.out.println("Enter the Breadth");
		cal.breadth = s.nextInt();
		System.out.println(cal.area());
		System.out.println(cal.peri());
	}

}
