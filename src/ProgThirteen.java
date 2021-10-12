/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */
import java.util.Scanner;

public class ProgThirteen {

    //Main method calling Instance method
    public static void main(String[] args) {
        ProgThirteen ave = new ProgThirteen();
        ave.data();

    }
    //Instance method with user input
       void data(){
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Value:");
        a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Second Value:");
        b = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Third Value:");
        c = scanner2.nextInt();

        //calculating average for 3 values
        d = ((a+b+c)/3);
        System.out.println("Average of Three Value is :"+ d);

    }
}
