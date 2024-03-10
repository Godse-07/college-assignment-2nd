interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }
}

public class Fifth {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}

/*
 Bird is flying.
Bird is swimming.
 */