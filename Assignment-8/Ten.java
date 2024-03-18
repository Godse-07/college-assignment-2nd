// Consider a Student examination database system that prints the mark sheet of students.
// Input the following from the command line.
// (a) Student’s Name
// (b) Marks in six subjects
// These marks should be between 0 to 50. If the marks are not in the specified range, raise
// a RangeException, else find the total marks and prints the percentage of the students. 


class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class Ten {
    public static void main(String[] args) {
        if (args.length != 7) {
            System.out.println("Invalid number of arguments. Please provide student's name and marks in six subjects.");
            return;
        }

        String studentName = args[0];
        int totalMarks = 0;

        try {
            for (int i = 1; i < args.length; i++) {
                int mark = Integer.parseInt(args[i]);
                if (mark < 0 || mark > 50) {
                    throw new RangeException("Marks should be between 0 and 50.");
                }
                totalMarks += mark;
            }

            double percentage = (totalMarks * 100.0) / (6 * 50);
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks. Please provide integer marks between 0 and 50.");
        } catch (RangeException e) {
            System.out.println("Range Exception: " + e.getMessage());
        }
    }
}
                                                        