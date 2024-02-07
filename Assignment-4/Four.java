public class Four {

    private int value;

    
    public Four(int value) {
        this.value = value;
    }

    
    public Four() {
        this(0); 
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Four obj1 = new Four(10);
        System.out.println("Value of obj1: " + obj1.getValue());

        Four obj2 = new Four();
        System.out.println("Value of obj2: " + obj2.getValue());
    }
}



/*
Value of obj1: 10
Value of obj2: 0
PS D:\files_of_main\
 */