interface Animal {
    void eat();
    void sleep();
}

interface Mammal extends Animal {
    void giveBirth();
}

interface Dog extends Mammal {
    void bark();
}

class A implements Dog {
    @Override
    public void eat() {
        System.out.println("eating.");
    }
    
    @Override
    public void sleep() {
        System.out.println("sleeping.");
    }
    
    @Override
    public void giveBirth() {
        System.out.println("birth.");
    }
    
    @Override
    public void bark() {
        System.out.println("barking.");
    }
}

public class Forth {
    public static void main(String[] args) {
        A labrador = new A();
        labrador.eat();
        labrador.sleep();
        labrador.giveBirth();
        labrador.bark();
    }
}

/*
eating.
sleeping.
birth.
barking.
 */