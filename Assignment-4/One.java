public class One {

    public void myMethod() {
        System.out.println("Method with no parameters");
    }

    public void myMethod(int num) {
        System.out.println("Method with one parameter: " + num);
    }

    public void myMethod(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + ", " + num2);
    }

    public void myMethod(int num1, int num2, int num3) {
        System.out.println("Method with three parameters: " + num1 + ", " + num2 + ", " + num3);
    }



    

    public void myMethod(double num) {
        System.out.println("Method with double parameter: " + num);
    }

    public void myMethod(String str) {
        System.out.println("Method with String parameter: " + str);
    }

    public static void main(String[] args) {
        One example = new One();
        example.myMethod();
        example.myMethod(10);
        example.myMethod(10, 20);
        example.myMethod(10, 20, 30);
        example.myMethod(2.5);
        example.myMethod("Pushan");
    }
}





/*
Method with no parameters
Method with one parameter: 10
Method with two parameters: 10, 20
Method with three parameters: 10, 20, 30
Method with double parameter: 2.5
Method with String parameter: Pushan
 */


