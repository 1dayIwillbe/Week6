/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data       : Width = 5.5 Height = 8.5
Expected Output : Area is 5.6 * 8.5 = 47.60
Perimeter is    : 2 * (5.6 + 8.5) = 28.20
 */
import java.util.Scanner;

public class ProgFourteen {
//height and Width are taken and calculate in result using instance method :
    void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rectangle Width:");
        double a = scanner.nextDouble();
        System.out.println("Enter Rectangle Height:");
        double b = scanner.nextDouble();

        System.out.println("Area of Rectangle is :" + (a * b));
        System.out.println("Perimeter of Rectangle is: " + (2 * (a + b)));

    }
 // result displayed in main method by creating object.
    public static void main(String[] args) {
        ProgFourteen area = new ProgFourteen();
        area.area();

    }

}
