package abhi;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {

	    List<String> names = new ArrayList<>();

	    
	    names.add("abhi");
	    names.add("veer");
	    names.add("veer");
	    System.out.println("After add(): " + names);

	    
	    System.out.println("Size: " + names.size());

	    
	    System.out.println("Element at index 1: " + names.get(1));

	   
	    System.out.println("Contains abhi? " + names.contains("abhi"));

	   
	    System.out.println("Index of veer: " + names.indexOf("veer"));

	    
	    System.out.println("Last index of veer: " + names.lastIndexOf("veer"));

	    
	     names.add(1, "Kiran");
	    System.out.println("After add(index): " + names);

	   
	    names.remove("veer");
	    System.out.println("After remove(object): " + names);

	    
	    names.remove(1);
	    System.out.println("After remove(index): " + names);

	     names.clear();
	    System.out.println("After clear(): " + names);

	    
	    System.out.println("Is list empty after clear? " + names.isEmpty());
	}
}