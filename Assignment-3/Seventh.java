//Write a Java program to check whether a given number is Armstrong Number or not

import java.io.*;

public class Seventh {
    public static void main(String[] args) throws IOException{
        BufferedReader re=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(re.readLine());

        if (isArmstrong(a)) {
            System.out.println(a + " is an Armstrong number.");
        } else {
            System.out.println(a + " is not an Armstrong number.");
        }

    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return originalNumber == sum;
    }
}
