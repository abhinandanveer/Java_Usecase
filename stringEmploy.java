package abhi;

public class stringEmploy {

	public static void main(String[] args) {
		

		        
		        String[] names = {"Renu Sai", "Akhil Kumar", "John Doe", "Meera"};

		      
		        for (int i = 0; i < names.length; i++) {

		            String name = names[i];
		            System.out.println("Employee: " + name);

		           
		            if (name.length() > 10) {
		                System.out.println("Long Name");
		            } else if (!name.contains(" ")) {
		                System.out.println("Single Word Name");
		            } else {
		                System.out.println("Normal Name");
		            }

		            
		            System.out.println("UPPER: " + name.toUpperCase());

		            // Reverse the name
		            StringBuffer sb = new StringBuffer(name);
		            System.out.println("REVERSE: " + sb.reverse());

		       
		            StringBuilder sbb = new StringBuilder(name);
		            sbb.append(" - Verified");
		            System.out.println("APPENDED: " + sbb);

		            System.out.println();
		        }
		    }
		}


	


