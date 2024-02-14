//Write a Java program to reverse a number. 

import java.io.*;
public class Third {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int reverse=0;
        while (a>0) {
            reverse=reverse*10+(a%10);
            a/=10;
        }
        System.out.println(reverse);
    }
}
