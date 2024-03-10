class Parent {
    Parent() {
        System.out.println("Parent class constructor without parameters");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor");
    }
}

public class Seventh {
    public static void main(String[] args) {
        Child child = new Child();
    }
}


/*
 Parent class constructor without parameters
Child class constructor 
 */