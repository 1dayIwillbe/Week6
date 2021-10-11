/*
 Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */
import java.util.Locale;

public class ProgNineteen {
    //Static Variables
    static String txt;
    static String txt2;

    //System input in Static Method using
    static void textOne() {
        System.out.println("System Input:");
        System.out.println("THE QUICK BROWN FOX JUMP OVER THE LAZY DOG.");
        txt = "THE QUICK BROWN FOX JUMP OVER THE LAZY DOG.";
        //Converting text in lower case
        txt2 = txt.toLowerCase(Locale.ROOT);
        System.out.println("Your Result:");
        System.out.println(txt2);
    }

    //main method callin static method.
    public static void main(String[] args) {
       ProgNineteen.textOne();
    }

}
