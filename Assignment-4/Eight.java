public class Eight {
    private int value;

    public Eight(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Eight obj1 = new Eight(10);
        Eight obj2 = new Eight(20);

        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}




/*
Value of obj1: 10
Value of obj2: 20
 */