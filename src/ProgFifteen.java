// Write a Java program to swap two variables.

import java.util.Scanner;

public class ProgFifteen {
    //Static Variables
    static int a ,b,c;
    //Static Method for Changing Values
    static void change (){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first value :");
        a = scanner.nextInt();
        System.out.println("Enter second value:");
        b = scanner.nextInt();
        System.out.println("You enter first value :"+a);
        System.out.println("You enter Second value :"+b);
        c=b;
        b=a;
        a=c;
        System.out.println("Fist value after change:"+a);
        System.out.println("Second value after change:"+b);
    }
// main method callin static method
    public static void main(String[] args) {
               ProgFifteen.change();
    }
}
