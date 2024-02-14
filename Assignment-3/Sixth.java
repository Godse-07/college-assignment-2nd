//Write a Java program to convert a Binary Number to Decimal and Decimal to Binary

import java.io.*;

public class Sixth {
    
    
    public static int binaryToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }
    
   
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Convert binary to decimal
        System.out.print("Enter a binary number: ");
        String binaryInput = br.readLine();
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal equivalent: " + decimalResult);
        
        // Convert decimal to binary
        System.out.print("Enter a decimal number: ");
        int decimalInput = Integer.parseInt(br.readLine());
        String binaryResult = decimalToBinary(decimalInput);
        System.out.println("Binary equivalent: " + binaryResult);
    }
}
