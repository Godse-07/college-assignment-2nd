//Write a java program to create a subpackage.


package Assignment-7;

package myPackage.subPackage;


public class Fifth {
    public void display() {
        System.out.println("This is from the myPackage.subPackage subpackage.");
    }
    public static void main(String[] args) {
        Fifth f5=new Fifth();

        f5.display();;

    }
}


//This is from the myPackage.subPackage subpackage.