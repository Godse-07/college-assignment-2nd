import java.io.*;

public class Sixth {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            
            int rows1 = Integer.parseInt(br.readLine());


            int columns1 = Integer.parseInt(br.readLine());

            int[][] matrix1 = new int[rows1][columns1];
            fillMatrix(matrix1, "first", br);


            int rows2 = Integer.parseInt(br.readLine());


            int columns2 = Integer.parseInt(br.readLine());

            int[][] matrix2 = new int[rows2][columns2];
            fillMatrix(matrix2, "second", br);

            if (columns1 != rows2) {
                System.out.println("Not possible");
            } else {
                int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
                printMatrix(resultMatrix);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void fillMatrix(int[][] matrix, String name, BufferedReader br) throws IOException {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(br.readLine());
            }
        }
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < rows2; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
