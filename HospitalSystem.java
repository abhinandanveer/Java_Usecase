package abhi2;

import java.util.TreeMap;
import java.util.Scanner;

public class HospitalSystem {

    public static void main(String[] args) {

        TreeMap<String, String> patients = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n hospital record system");
            System.out.println("1. add patient");
            System.out.println("2. update patient");
            System.out.println("3. get patient details");
            System.out.println("4. remove patient");
            System.out.println("5. list all patients");
            System.out.println("6. check patient exists");
            System.out.println("7. count total patients");
            System.out.println("8. clear system");
            System.out.println("9. exit");
            System.out.print("enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Patient ID: ");
                    String addId = sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String addName = sc.nextLine();
                    patients.put(addId, addName);
                    System.out.println("Patient added successfully");
                    break;

                case 2:
                    System.out.print("Enter Patient ID to update: ");
                    String updateId = sc.nextLine();
                    if (patients.containsKey(updateId)) {
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        patients.put(updateId, newName);
                        System.out.println("Patient updated");
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    String getId = sc.nextLine();
                    if (patients.containsKey(getId)) {
                        System.out.println("Patient Name: " + patients.get(getId));
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID to remove: ");
                    String removeId = sc.nextLine();
                    if (patients.remove(removeId) != null) {
                        System.out.println("Patient removed");
                    } else {
                        System.out.println("Patient not found");
                    }
                    break;

                case 5:
                    System.out.println("All Patients (Sorted by ID):");
                    System.out.println(patients);
                    break;

                case 6:
                    System.out.print("Enter Patient ID: ");
                    String checkId = sc.nextLine();
                    System.out.println(patients.containsKey(checkId));
                    break;

                case 7:
                    System.out.println("Total Patients: " + patients.size());
                    break;

                case 8:
                    patients.clear();
                    System.out.println("System cleared");
                    break;

                case 9:
                    System.out.println("Exiting system");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 9);

       
    }
}
