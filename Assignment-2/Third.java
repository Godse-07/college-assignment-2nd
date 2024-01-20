import java.io.*;

public class Third {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int sum=0;
        int arr[]=new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }

        for (int i : arr) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
