//Write a java program to implement Java Nested try statement

public class Fifth {
    public static void main(String[] args) {
        try {
           
            System.out.println("Outer try block starts.");
            
            try {
                
                System.out.println("Inner try block starts.");
                
              
                int result = 10 / 0;
                System.out.println("Result: " + result);
                
                System.out.println("Inner try block ends.");
            } catch (ArithmeticException e) {
               
                System.out.println("Inner catch block: " + e.getMessage());
            }
            
            System.out.println("Outer try block ends.");
        } catch (Exception ex) {
           
            System.out.println("Outer catch block: " + ex.getMessage());
        }
    }
}
