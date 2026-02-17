package abhi2;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {

        try {
            File file = new File("Tech.txt");

            if (file.createNewFile()) {
                System.out.println("File created Successfully");
            } else {
                System.out.println("File already exists");
            }

            // ---- FILE WRITE PART ----
            FileWriter writer = new FileWriter(file);   // open file
            writer.write("Hello Abhi\n");
            writer.write("Java File Handling Example\n");
            writer.write("Writing successful!");
            writer.close();   // save file

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}