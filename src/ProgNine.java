//Write a program to convert the upper case to lower case
import java.util.Scanner;

public class ProgNine {
    //Static Variables
    static String a;
    static String b;

    // User input data in Static method using Scanner
    static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Text to convert in lower case:");
        a = scanner.nextLine();
        //Converting String to Lower Case
        b = a.toLowerCase();
        System.out.println("String : " + b);

    }

    //Static method calling in main method
    public static void main(String[] args)  {
       ProgNine.task();
    }


}
