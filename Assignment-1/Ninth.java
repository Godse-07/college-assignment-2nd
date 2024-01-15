import java.util.*;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Now the updated value of a is "+a);
        System.out.println("Now the updated value of b is "+b);
    }
}
