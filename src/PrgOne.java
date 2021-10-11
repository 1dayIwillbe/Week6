/*  1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and Run the programme
*/

import java.util.Scanner;

public class PrgOne {
    // Instance Variables taking data using Scanner (user input)
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    // Instance Method
    void recall() {

        int ans = a + b;
        System.out.println("Total  of value " + a + " and " + b + " is " + ans);
    }

    // Main method using object to access instance method
    public static void main(String[] args) {
        System.out.println("Enter 2 values to Add:");
        PrgOne res = new PrgOne();
        res.recall();
    }


}
