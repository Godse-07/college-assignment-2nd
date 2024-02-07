public class Seventh {
    private int value;

    public Seventh() {
        this(0);
    }

    public Seventh(int value) {
        this.value = value;
    }

    public Seventh setValue(int value) {
        this.value = value;
        return this;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Seventh obj = new Seventh();
        obj.setValue(10).setValue(20);
        System.out.println("Value: " + obj.getValue());
    }
}


/*
 Value: 20
 */