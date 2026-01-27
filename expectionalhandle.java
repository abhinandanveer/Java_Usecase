package abhi;

public class expectionalhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage Techadmy;
		
		 
		try {
				int a=10;
				int b=0;
				int result=a/b;
				System.out.println(result);
			}
			 catch(ArithmeticException e)
			{
				System.out.println("Cannot divide by zero");
			}
		System.out.println("Program continue...");
		}
		
		 

	}


