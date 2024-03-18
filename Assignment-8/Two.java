//Exception CASE-2: Exception creates but properly handled



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Two {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("First line of the file: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
