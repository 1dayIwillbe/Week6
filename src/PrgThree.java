/*
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme
 */

public class PrgThree {
    //Instance Variable
    int a = 35;

    //Static Variable
    static String name = "Jignesh";

    public static void main(String[] args) {
        //Static method calling
        PrgThree.hello();
        //Instance method calling using an object
        PrgThree temp = new PrgThree();
        temp.total();
    }

    // Static method using both Static and Instance Variables
    static void hello() {
        //Create an object to access Instance Variable in Static method
        PrgThree age = new PrgThree();
        System.out.println("// Result by using Static Method ");
        System.out.println("My name is " + name + " and age is " + age.a);
    }

    // Instance method using both Static and Instance Variables
    void total() {
        System.out.println("// Result by using Instance Method ");
        System.out.println("My name is " + name + " and age is " + a);
    }
}

