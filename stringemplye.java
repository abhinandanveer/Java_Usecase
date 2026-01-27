package Hw;

public class stringemplye {

	public static void main(String[] args) {
		 String[] employee = {"Renu Sai", "Akhil Kumar", "John Doe","Meera"};
		 
		 for(int i=0;i <employee.length;i++)
		 {
			 String name =  employee[i];
		 
		 if(name.length()>10)
		 {
			 System.out.println("Long Name");
		 }
		 else if (!name.contains(" "))
		 {
			 System.out.println("Single Word Name");
		 }
		 else {
			 System.out.println("Normal Name");

		 }
		 
		 System.out.println("Upper:"+name.toUpperCase());
		 StringBuffer s1 = new StringBuffer(name);
		 System.out.println("REVERSE: "+s1.reverse());
		 StringBuilder s2 =new StringBuilder(name);
		 s2.append("- verified");
		 System.out.println("APPENDED"+s2);
		 }




	}

}
