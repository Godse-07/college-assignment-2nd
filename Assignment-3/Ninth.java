public class Ninth {
    private int value;

    public Ninth(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void displayValue(int value) {
        System.out.println("Instance variable value: " + this.value);
        System.out.println("Parameter value: " + value);
    }

    public static void main(String[] args) {
        Ninth obj = new Ninth(10);
        obj.setValue(20);
        System.out.println("Value: " + obj.getValue());
        obj.displayValue(30);
    }
}
