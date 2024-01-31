public class Sixth {
    private int value;

    public Sixth() {
        this(0); 
    }

    public Sixth(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Sixth obj = new Sixth(10); 
        System.out.println("Value: " + obj.getValue());
    }
}



/*
Value: 10
 */