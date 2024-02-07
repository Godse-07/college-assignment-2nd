//Write a java program to implement the hierarchical inheritance in java.


class Parent {
    void display1() {
        System.out.println("Parent class method");
    }
}

class Child1 extends Parent {
    void display2() {
        System.out.println("Child1 class method");
    }
}

class Child2 extends Parent {
    void display3() {
        System.out.println("Child2 class method");
    }
}

public class Forth {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        obj1.display1();
        obj1.display2();

        Child2 obj2 = new Child2();
        obj2.display1();
        obj2.display3();
    }
}
