import java.util.Scanner;

// General class ThreeDObject
class ThreeDObject {
    // Method to calculate whole surface area
    public double wholeSurfaceArea() {
        return 0;
    }

    // Method to calculate volume
    public double volume() {
        return 0;
    }
}

// Derived class Box
class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

// Derived class Cube
class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

// Derived class Cylinder
class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class Cone
class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double volume() {
        return (1.0/3) * Math.PI * radius * radius * height;
    }
}

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking dimensions of Box from the user
        System.out.println("Enter dimensions for Box (length, width, height):");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);

        // Taking dimensions of Cube from the user
        System.out.println("Enter side length for Cube:");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);

        // Taking dimensions of Cylinder from the user
        System.out.println("Enter dimensions for Cylinder (radius, height):");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);

        // Taking dimensions of Cone from the user
        System.out.println("Enter dimensions for Cone (radius, height):");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);

        // Displaying results
        System.out.println("\nResults:");
        System.out.println("Box Whole Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        System.out.println("Cube Whole Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Cylinder Whole Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("Cone Whole Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}
