class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }

    void display() {
        System.out.println("Color: " + super.color);
        eat();
        System.out.println("Dog breed: " + breed);
    }
}

public class Sixth {
    public static void main(String[] args) {
        Dog dog = new Dog("Brown", "Dog");
        dog.display();
    }
}


/*
 Animal is eating.
Dog breed: Dog
 */