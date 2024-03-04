//Write a java program to access the methods from package

class MyPackageClass {
    public void display() {
        System.out.println("This is from the myPackage package.");
    }
}


public class Sixth {
    public static void main(String[] args) {
        MyPackageClass obj = new MyPackageClass();
        obj.display();
    }
}

// This is from the myPackage package
