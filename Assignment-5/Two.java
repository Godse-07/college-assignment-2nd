//Write a java program to implement the static method in java. 


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static void display() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) throws IOException {
        display();
        reader.close();
    }
}
