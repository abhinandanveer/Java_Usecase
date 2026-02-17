package abhi2;
import java.util.*;
import java.util.Map;
public class HashMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage Techadmy;
		 
		//Map<Integer, String>Employee = new HashMap<>();
		//HashMap<Integer, String>Employee1= new HashMap<>();
		HashMap<Integer, String>Employee = new HashMap();
		 
				Employee.put(101, " Vinay \n");
				Employee.put(102, " Sonali \n");
				Employee.put(103, " Renu ");
				
				System.out.println(Employee);
				System.out.println("Employee with ID 102: " + Employee.get(102));

		        
		        System.out.println("Contains key 101? " + Employee.containsKey(101));

		        
		        System.out.println("Contains value 'Renu'? " + Employee.containsValue("Renu"));

		      
		        System.out.println("Size of map: " + Employee.size());

		     
		        System.out.println("Is map empty? " + Employee.isEmpty());

		        Employee.remove(103);
		        System.out.println("After removing ID 103: " + Employee);

		       
		        System.out.println("Keys: " + Employee.keySet());

		        
		       
		 
			}
		 
		}
		 





