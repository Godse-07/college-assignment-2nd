import java.io.*;

public class Fifth {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        int[][] array = new int[rows][columns];

        
        fillArrayFromUser(array);

       

        int mainDiagonalSum = calculateMainDiagonalSum(array);
        System.out.println("Sum of the main diagonal: " + mainDiagonalSum);

       
        int secondaryDiagonalSum = calculateSecondaryDiagonalSum(array);
        System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
    }

   
    private static void fillArrayFromUser(int[][] array) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                   
                    array[i][j] = Integer.parseInt(br.readLine());
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    
    private static int calculateMainDiagonalSum(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }

        return sum;
    }

    private static int calculateSecondaryDiagonalSum(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][array.length - 1 - i];
        }

        return sum;
    }
}
