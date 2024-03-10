class Parent {
    Parent(int a) {
        System.out.println("Parent class constructor with parameters");
    }
}

class Child extends Parent {
    Child() {
        super(10);
        System.out.println("Child class constructor");
    }
}

public class Eight {
    public static void main(String[] args) {
        Child child = new Child();
    }
}


/*
 Parent class constructor with parameters
Child class constructor 
 */