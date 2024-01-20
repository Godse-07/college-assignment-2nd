
/*

//call by value

public class Tenth {

    public static void multiply(int a){
        a*=2;
        System.out.println("Inside the funcion = "+a);
    }

    public static void main(String[] args) {
    int x=2;
    multiply(x);
    System.out.println("Outside the function = "+x);        
    }
}

*/


//call by reference

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Tenth {
    public static void modifyPersonName(Person person) {
        person.name = "JAVA";
        System.out.println("Inside method: " + person.name);
    }

    public static void main(String[] args) {
        Person person = new Person("C");
        modifyPersonName(person);
        System.out.println("Outside method: " + person.name);
    }
}
