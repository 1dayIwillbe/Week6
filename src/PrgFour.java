/*
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.

 */

public class PrgFour {
    // Instance Variables
    int a = 20;
    String name = "Ramesh";

    //Static Variables
    static int b = 40;
    static String name2 = "Suresh";
    static PrgFour can1 = new PrgFour();


    //Instance Method
    void age() {
        System.out.println("Candidate one is " + name + " and his age is " + a);
        System.out.println("Candidate Two is " +name2 + " and his age is " +b);
    }

    //Static Method
    static void age2() {
            System.out.println("Candidate one is " + can1.name + " and his age is " + can1.a);
            System.out.println("Candidate Two is " + name2 + " and his age is " + b);

    }

    public static void main(String[] args) {
        //Instance method using object
        System.out.println("Result from Instance Method :");
        can1.age();
        //static method calling
        System.out.println("Result from Static Method :");
        PrgFour.age2();
    }
}
