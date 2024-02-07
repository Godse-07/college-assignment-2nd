//Write a java program to implement the multilevel inheritance in java. 


class GrandParent {
    void display1() {
        System.out.println("GrandParent class method");
    }
}

class Parent extends GrandParent {
    void display2() {
        System.out.println("Parent class method");
    }
}

public class Fifth extends Parent {
    void display3() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Fifth obj = new Fifth();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
