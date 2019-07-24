
package Doubles;

import java.util.Scanner;

public class Doubles {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOne = 3;
        int numberTwo = 2;
        
        while ( numberOne != numberTwo ) {
        numberOne = (int)(Math.random() * 6 + 1);
        numberTwo = (int)(Math.random() * 6 + 1);
        System.out.println ( "The first die landed on a " + numberOne );
        System.out.println ( "The second die landed on a  " + numberTwo );
        if (numberOne == numberTwo) {
            System.out.println( "Congratulations! You rolled doubles!");
        }
        System.out.println ("If you would like to roll again, type 'yes', if you want to stop playing, type 'no'.");
        String userInput = keyboard.nextLine();
        int yesOrNo = userInput.compareTo("no");
        if (yesOrNo == 0) {
            break;
        }
        }
        
        
    }
}
    

