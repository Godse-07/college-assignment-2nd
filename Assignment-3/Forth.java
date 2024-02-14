//Write a Java program to check whether a number is palindrome or not


import java.io.*;
public class Forth {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());

        int b=a;
        int reverse=0;

        while (a>0) {
            reverse=reverse*10+(a%10);
            a/=10;
        }

        String result = (b == reverse) ? "Palindrome" : "Not palindrome";
        System.out.println(result);
    }
}
