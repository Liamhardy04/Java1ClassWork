
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it however many times you want me to." );
       String input = keyboard.nextLine();
       
       System.out.println("How many times would you like me to repeat it?");
       int count = 0;
     
       int timeInput = keyboard.nextInt();
       System.out.println("Here we go!");
       while (count < timeInput) {
           System.out.println((count + 1) + input);
           count ++;
       }
    }
    
}
