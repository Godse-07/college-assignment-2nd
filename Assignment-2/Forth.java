import java.io.*;

public class Forth {
    public static void main(String[] args) throws IOException{
        

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        int first[][]=new int[2][2];
        int second[][]=new int[2][2];
        int third[][]=new int[2][2];

        System.out.println("First array ");
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                first[i][j]=Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Second array ");
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                second[i][j]=Integer.parseInt(br.readLine());
            }
        }

        sum(first, second, third);

    }

    public static void sum(int arr[][], int arr1[][], int sum[][]){

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j]=arr[i][j]+arr1[i][j];
            }
        }

        for (int[] is : sum) {
            for (int is2 : is) {
                System.out.print(is2+"  ");
            }
            System.out.println();
        }

    }
}
