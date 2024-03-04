//Write a java program to observe the utility of public access specifier.

package accessSpecifier;

class PublicAccessSpecifierExample {
    public void display() {
        System.out.println("This method is public and accessible from anywhere.");
    }
}

public class Eight {
    public static void main(String[] args) {
        PublicAccessSpecifierExample obj = new PublicAccessSpecifierExample();
        obj.display();
    }
}

//This method is public and accessible from anywhere.
