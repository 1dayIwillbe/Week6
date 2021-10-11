/*  2.1 Declare two static variables
    2.2 Declare one static method
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and Run the programme.
 */
public class PrgTwo {

    //static variables
    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        // calling Static Method
        PrgTwo.add();
    }

    //static method
    static void add() {
        int ans = a + b;
        System.out.println("You input value " + a + " and " + b);
        System.out.println("Your total is " + ans);
    }
}
