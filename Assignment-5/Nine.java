//Write a java program to stop method overriding. 


class Parent {
    final void display() {
        System.out.println("Parent class method");
    }
}

public class Nine extends Parent {
   

    public static void main(String[] args) {
        Nine obj = new Nine();
        obj.display();
    }
}
