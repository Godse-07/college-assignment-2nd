/**
 * One
 */
import java.io.*;

public class One {
    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        
        int arr[]=new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    
}