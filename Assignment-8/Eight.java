//Finally CASE – 1 : Case 1: finally example where exception doesn't occur.
//  Case 2: finally example where exception occurs and not handled.
//  Case 3: finally example where exception occurs and handled.


//case->1


public class Eight {
    public static void main(String[] args) {
        try {
            System.out.println("Executing try block");
        } finally {
            System.out.println("Executing finally block");
        }
    }
}



//case->2


public class Eight {
    public static void main(String[] args) {
        try {
            System.out.println("Executing try block");
            int result = 10 / 0; 
        } finally {
            System.out.println("Executing finally block");
        }
    }
}
