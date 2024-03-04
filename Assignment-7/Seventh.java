//Write a java program to access the methods from package & subpackage both.


package myPackage;

class MyPackageClass {
    public void display() {
        System.out.println("This is from the myPackage package.");
    }
}

package myPackage.subPackage;

class SubPackageClass {
    public void display() {
        System.out.println("This is from the myPackage.subPackage subpackage.");
    }
}


public class Seventh {
    public static void main(String[] args) {
        MyPackageClass obj1 = new MyPackageClass();
        obj1.display();

        SubPackageClass obj2 = new SubPackageClass();
        obj2.display();
    }
}



/*

This is from the myPackage package.
This is from the myPackage.subPackage subpackage.

 */