/*
Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r)
 */
import java.util.Scanner;

public class ProgSix {
    // static variable
    static double r;
    static double ans;
    //Static method with user input using Scanner
    static void  area(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Circle's radius (in Mtr):");
        r = scanner.nextDouble();
        ans = (3.14*r*r);
        System.out.println("Area of give Circle is "+ ans+ "Sq.Mtr.");
    }
    //Main method calling Static method
    public static void main(String[] args) {
         ProgSix.area();
    }

}
