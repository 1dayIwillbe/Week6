/*
 Write a Java program to display the following pattern.
Sample Pattern :
                   J A V A
 */
public class ProgEleven {
    //main method using object to call instance variable
    public static void main(String[] args) {
        ProgEleven patt = new ProgEleven();
        patt.pattern();
    }
// instance method
    void pattern(){
        // Print Java Pattern
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   aaa   v   v  aaa");
        System.out.println("J  J  aaaaa   v v  aaaaa");
        System.out.println("J  J a     a   v  a     a");

    }

}
