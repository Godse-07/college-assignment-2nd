//Write a java program to implement Java Multi catch block

public class Forth {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4; 
            int result = numbers[index] / 0; 
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
