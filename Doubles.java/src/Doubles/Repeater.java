
package Doubles;


public class Doubles {

    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 2;
        
        while ( numberOne != numberTwo ) {
        numberOne = (int)(Math.random() * 6 + 1);
        numberTwo = (int)(Math.random() * 6 + 1);
        System.out.println ( "The first die landed on a " + numberOne );
        System.out.println ( "The second die landed on a  " + numberTwo );
        }
        System.out.println( "Congratulations!");
    }
}
    

