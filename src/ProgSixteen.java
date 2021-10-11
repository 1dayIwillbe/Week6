
 /*     program to add two binary numbers.
        Input Data:     Input first binary number: 10
                        Input second binary number: 11
        Expected Output:  Sum of two binary numbers: 101
  */

 import java.util.Scanner;

public class ProgSixteen {

    public static void main(String[] args) {
       // User input Binary Numbers
        System.out.println("Welcome to Java program to add two binary numbers");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scnr.nextLine();
        System.out.println("Please enter second binary number");
        String second = scnr.nextLine();
       // sum of two Binary numbers using Static Method
        String sum = sum (first, second);

        //Result Displayed
        System.out.println("Sum of two binary number is : " + sum);
        scnr.close();

    }
 //Static method for adding String and Converting to Binary
    private static String sum(String first, String second) {
        //Convert String to Integer
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        // adding Integer
        int sum = b1 + b2;
        // converting to Binary and return to main
        return Integer.toBinaryString(sum);

    }
}
