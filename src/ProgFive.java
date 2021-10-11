/*
Write a program for a calculator with addition, subtraction, multiplication and division methods all
with parameters and use string concatenation methods. (Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class ProgFive {
    //Static Method 1
    static void add(double a, double b) {
        System.out.println("Total:" + (a + b));
    }
    //Static method 2
    static void sub(double a, double b) {
        System.out.println("Subscribe:" + (a - b));
    }

    //Instance Method 1
    void multi(double a, double b) {
         System.out.println("Multipay :" + a * b);
    }
    //Instance Method 2
    void devi(double a, double b) {
         System.out.println("Devision :" + (a / b));
    }

    //Main method calling Instance and Static Methods
    public static void main(String[] args) {
        //user input via Scanner method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Value:");
        double a = scanner.nextDouble();
        System.out.println("Enter the Second Value:");
        double b = scanner.nextDouble();
        //calling Static Method
        ProgFive.add(a, b);
        ProgFive.sub(a, b);
        // calling Instance Method
        ProgFive var = new ProgFive();
        var.multi(a, b);
        var.devi(a, b);
    }


}
