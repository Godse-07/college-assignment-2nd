public class Five {
    public void display() {
        System.out.println("Inside display method");
        print(this);
    }

    public void print(Five obj) {
        System.out.println("Inside print method");
    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.display();
    }
}


/*
 Inside display method
Inside print method
 */