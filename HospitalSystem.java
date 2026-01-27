package abhi;
import java.util.HashSet;
import java.util.Scanner;

public class HospitalSystem {

    public static void main(String[] args) {

        HashSet<Integer> patientIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients to register: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();

            if (patientIds.contains(id)) {
                System.out.println("Already registered");
            } else {
                patientIds.add(id);
                System.out.println("Patient added to the system");
            }
        }

        System.out.println("List of Unique Registered Patients:");
        System.out.println(patientIds);

        sc.close();
        
    }
}
