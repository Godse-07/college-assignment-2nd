// Write a program to define a class Item containing code and price. Accept this data
// for five objects using array of objects. Display code, price in tabular form and also,
// display total price of all items


import java.util.Scanner;

public class thirteen {
    int code;
    double price;

    thirteen(int code, double price) {
        this.code = code;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        thirteen[] items = new thirteen[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter code for item " + (i + 1) + ": ");
            int code = scanner.nextInt();
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            items[i] = new thirteen(code, price);
        }

        System.out.println("Code\tPrice");
        double totalPrice = 0.0;
        for (thirteen item : items) {
            System.out.println(item.code + "\t" + item.price);
            totalPrice += item.price;
        }
        System.out.println("Total Price: " + totalPrice);
        scanner.close();
    }
}
