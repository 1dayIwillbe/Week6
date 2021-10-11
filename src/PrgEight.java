// Write a program to calculate the area of a triangle

import java.util.Scanner;

public class PrgEight {
   // Calculate Triangle Area in Instance Method:
     double area(){
        //User enter values using Scanner Method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Base of Triangle:");
        double a = scanner.nextDouble();
        System.out.println("Enter the height of Triangle:");
        double b = scanner.nextDouble();
        double ans = ((a*b)/2);
        //System.out.println("Area of give Triangle is "+ ans+ "Sq.Mtr.");
    return ans ;
    }
// Display result in Main Method using Object:
    public static void main(String[] args) {
        PrgEight area = new PrgEight();
        System.out.println("Area of give Triangle is "+ area.area()+ "Sq.Mtr.");


    }

}

