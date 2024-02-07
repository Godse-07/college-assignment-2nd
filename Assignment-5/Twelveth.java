// Write a program to define a class Fraction having data members numerator and
// denominator. Initialize three objects using different constructors and display its
// fractional value. 



public class Twelveth {
    int numerator;
    int denominator;

    Twelveth(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void displayFractionalValue() {
        System.out.println("Fractional value: " + numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        Twelveth fraction1 = new Twelveth(1, 2);
        Twelveth fraction2 = new Twelveth(3, 4);
        Twelveth fraction3 = new Twelveth(5, 6);

        fraction1.displayFractionalValue();
        fraction2.displayFractionalValue();
        fraction3.displayFractionalValue();
    }
}
