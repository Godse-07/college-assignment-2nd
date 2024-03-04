// Implementation of final keyword before a variable

public class One {

    final static int a=10;

    public static void main(String[] args) {
        System.out.println(a);
      //  a=20;
        System.out.println(a);
    }
}


/*
  cannot assign a value to final variable a
        a=20; 
 */