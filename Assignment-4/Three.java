public class Three {

    private int value;

    public Three() {
       
        this(0); 
    }

    public Three(int value) {
        this.value = value;
    }

    public void setValue(int value) {
    
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.setValue(10);
        System.out.println("Value: " + obj.getValue());
    }
}



/*
Value: 10
*/