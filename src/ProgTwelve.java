/*  Write a Java program to compute the specified expressions and print the output.
    Test Data:  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output : 2.138888888888889
*/
public class ProgTwelve {

    //main method calling static method
    public static void main(String[] args) {
      ProgTwelve.test();
    }

    //System input using static method
    static void test() {
        double ans = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("TestDATA:(25.5*3.5-3.5*3.5)/(40.5-4.5) ");
        System.out.println("Output:" + ans);
    }
}
