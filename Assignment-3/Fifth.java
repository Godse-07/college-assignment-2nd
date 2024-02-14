//Write a Java program to check whether a number is prime or not. 

import java.io.*;
public class Fifth {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=Integer.parseInt(br.readLine());

        boolean isPrime=true;

        for (int i = 2; i <=Math.sqrt(a) ; i++) {
            if(a%i==0){
                isPrime=false;
                break;
            }
        }
        String c= (isPrime==true) ? ("Prime") : ("Not prime");

        System.out.println(c);
    }
}
