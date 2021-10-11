
/*   1 Input Data: a Decimal Number : 5
     2 Expected Output  Binary number is: 101
 */

public class ProgSeventeen {

        //Converting Int to Binary using Static Method
         public static void toBinary(int decimal) {
            System.out.println(Integer.toBinaryString(decimal));

         }

        //Main method with System input and calling static method
        public static void main(String[]args) {
            System.out.println("Decimal Number : 5");
            toBinary(5);
             }
}
