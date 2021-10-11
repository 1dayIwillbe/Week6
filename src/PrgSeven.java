/*
Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
 Formula = ((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;

public class PrgSeven {
    // Instance method for Converting Temperature Fer to Ces
    double cle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Degree Fahrenheit:");
        double a = scanner.nextDouble();
        double ans = ((a-32)* 5/9);
        return ans;
    }
    // Main method calling Instance Method using Object
    public static void main(String[] args) {
        PrgSeven cent = new PrgSeven();
        System.out.println("Temperature in Degree Celsius is :"+ cent.cle());

    }
}
