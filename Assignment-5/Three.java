//Write a java program to implement the single inheritance in java.

class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

public class Three extends Parent {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.display();
    }
}
