public class Two {

    private int value;

    public Two() {
        this.value = 0;
    }

    public Two(int value) {
        this.value = value;
    }

    public Two(int value1, int value2) {
        this.value = value1 + value2;
    }

 
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Two obj1 = new Two();
        Two obj2 = new Two(10);
        Two obj3 = new Two(20, 30);

        System.out.println("Value of obj1: " + obj1.getValue());
        System.out.println("Value of obj2: " + obj2.getValue());
        System.out.println("Value of obj3: " + obj3.getValue());
    }
}




/*
 Value of obj1: 0
Value of obj2: 10
Value of obj3: 50
 */