// Create a user-defined exception named CheckArgument to check the number of
// arguments passed through the command line. If the number of argument is less than 5,
// throw the CheckArgumentexception,else print the addition of all the five numbers. 

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class Nine {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Insufficient number of arguments");
            } else {
                int sum = 0;
                for (String arg : args) {
                    sum += Integer.parseInt(arg);
                }
                System.out.println("Sum of all arguments: " + sum);
            }
        } catch (CheckArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument(s): " + e.getMessage());
        }
    }
}
