//Write a Java program to calculate the sum of natural numbers up to a certain range

import java.io.*;

public class Eight {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());

        int sum=0;

        for (int i = 0; i <= a; i++) {
            sum+=i;
        }

        System.out.println(sum);

    }
}
