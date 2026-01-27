package usecase;

import java.util.LinkedList;

public class PatientManagement {

    public static void main(String[] args) {

        
        LinkedList<String> patients = new LinkedList<>();

        
        patients.add("Shri");
        patients.add("Krishna");
        patients.add("Dev");

        
        patients.addFirst("Emergency-Suresh");

       
        patients.addLast("Yogesh");

        
        System.out.println("Patient List: " + patients);

        
        System.out.println("First Patient: " + patients.getFirst());

        
        System.out.println("Last Patient: " + patients.getLast());

        
        System.out.println("Is Yogesh present? " + patients.contains("Yogesh"));

        
        System.out.println("Position of Dev: " + patients.indexOf("Dev"));

       
        System.out.println("Treated Patient: " + patients.removeFirst());

        
        patients.remove("Yogesh");

       
        System.out.println("Total Remaining Patients: " + patients.size());

        
        System.out.println("Updated Patient List:");
        for (String patient : patients) {
            System.out.println(patient);
        }
    }
}
