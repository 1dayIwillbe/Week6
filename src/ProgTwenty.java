// Write a Java Program to print as below.

public class ProgTwenty {
   // instance method to write a code.
    void design(){
        System.out.println("+----------------------------------+");
        System.out.println("+                                  +");
        System.out.println("+          Corner Store            +");
        System.out.println("+                                  +");
        System.out.println("+    25-03-29           4:38 PM    +");
        System.out.println("+                                  +");
        System.out.println("+    Gallons:            10.870    +");
        System.out.println("+    Price/gallon:      $ 2.089    +");
        System.out.println("+                                  +");
        System.out.println("+    Fuel total:        $ 22.71    +");
        System.out.println("+                                  +");
        System.out.println("+----------------------------------+");
    }
    // main method is calling instance method using object.

    public static void main(String []args){
       ProgTwenty des = new ProgTwenty();
        des.design();


    }
}
