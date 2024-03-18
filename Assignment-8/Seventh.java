//Write a java program to implement the throws keyword.

import java.io.FileNotFoundException;

public class Seventh {
    
    public static void readFile() throws FileNotFoundException {

        throw new FileNotFoundException("File not found");
    }

    public static void main(String[] args) {
        try {

            readFile();
        } catch (FileNotFoundException e) {
          
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
