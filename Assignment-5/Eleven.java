// Write a program to define a class Employee to accept emp_id, emp _name,
// basic_salary from the user and display the gross_salary. 


import java.util.Scanner;

public class Eleven {
    int emp_id;
    String emp_name;
    double basic_salary;

    Eleven(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    double calculateGrossSalary() {
        double hra = 0.1 * basic_salary;
        double da = 0.05 * basic_salary;
        return basic_salary + hra + da;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String name = scanner.next();
        System.out.print("Enter Basic Salary: ");
        double salary = scanner.nextDouble();

        Eleven emp = new Eleven(id, name, salary);
        double grossSalary = emp.calculateGrossSalary();
        System.out.println("Gross Salary: " + grossSalary);
        scanner.close();
    }
}
