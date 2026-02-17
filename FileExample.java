package abhi2;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        try {
            //  CREATE 
            File file = new File("Teceh.txt");
            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            //  WRITE 
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Abhi\n");
            writer.write("Welcome to Java File Handling\n");
            writer.close();
            System.out.println("Data Written Successfully");

            //  READ 
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\nReading File:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // DELETE 
           /* if (file.delete()) {
                System.out.println("\nFile Deleted Successfully");
            } else {
                System.out.println("\nUnable to Delete File");
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
