//Exception CASE-3: Exception creates but not handled

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        String line = reader.readLine();
        System.out.println("First line of the file: " + line);
        reader.close();
    }
}
