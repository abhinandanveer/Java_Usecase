package abhi2;

import java.io.*;
import java.util.Scanner;

class Learners implements Serializable
{
    int id;
    String name;
    double marks;

    // Constructor
    public Learners(int id, String name, double marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Serialization
{
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Learners l1 = new Learners(id, name, marks);

            // SERIALIZATION
            FileOutputStream fos = new FileOutputStream("Learner.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(l1);
            oos.close();
            fos.close();

            System.out.println("\nObject Serialized Successfully\n");

            // DESERIALIZATION
            FileInputStream fis = new FileInputStream("Learner.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Learners l2 = (Learners) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Deserialized Object Data:");
            l2.display();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
