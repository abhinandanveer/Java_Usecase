package abhi2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("Tech.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();   // close reader
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

