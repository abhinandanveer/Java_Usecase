package usecase;
import java.util.HashSet;
import java.util.Scanner;

public class Collection {

public class HospitalSystem {

    public static void main(String[] args) {

        HashSet<Integer> patientIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patient to register: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();

            // Try to add patient ID
            if (patientIds.add(id)) {
                System.out.println(" Patient added to system.");
            } else {
                System.out.println(" ID already registered. Patient already exists.");
            }
        }

        
        System.out.println("\n List of Unique Registered Patients:");
        for (int pid : patientIds) {
            System.out.println("Patient ID: " + pid);
        }

        
    }
}
}

