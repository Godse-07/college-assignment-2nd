//Implementation of method overriding in java. 

class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

public class Seventh extends Parent {
    @Override
    void display() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Seventh obj = new Seventh();
        obj.display();
    }
}
