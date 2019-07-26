
package Calculator;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter '1' now to get help and see your calculating options. Enter anything else to continue.");
        int enter = keyboard.nextInt();
        if (enter == 1 ) {
            System.out.println("Operator options: \n 1) '+' Adding two numbers together. \n 2) '-' Subtract one number from another number. \n "
                    + "3) '*' Multiply two numbers together. \n 4) '/' Divide one number by another. \n 5) '^' Raise a number to the power of another number. \n "
                    + "6) '%' Gives you the remainder of dividing a first number by a second number. \n      Example: 6 % 4 = the remainder of 6 / 4, or 2. \n "
                    + "7) Multiplies a number by each whole number below it down to one. \n      Example: 5! = 5 * 4 * 3 * 2 * 1.");
        }
        else { }
        double answer = 0;
        System.out.println("First Number:");
        double num1 = keyboard.nextDouble();
        System.out.println("Operator:");
        char operator = keyboard.next().charAt(0);
        if (operator == '!' || operator == 's') {
            double num11 = num1;
            switch (operator) {
            case '!':
                
                for(int i = 0; i < num11 - 1; i++) {
                    num1 = num1 * (num11 - (i + 1));
                    System.out.println(i);
                    System.out.println(num1);

                }
                answer = num1;
            case '√': answer = Math.sqrt(num1);
            }
            System.out.println("Answer:");
            if (operator == '!') {
            System.out.println(num11 + "" + operator + " = " + answer );
            }
            else {
                System.out.println("√" + num1 + " = " + answer);
            }
        }
        
        else {
        System.out.println("Second Number:");
        double num2 = keyboard.nextDouble();
        switch (operator) {
            case '+': answer = num1 + num2;
            break;
            case '-': answer = num1 - num2;
            break;
            case '*': answer = num1 * num2;
            break;
            case '/': answer = num1 / num2;
            break;
            case '^': answer = Math.pow(num1, num2);
            break;
            case '%': answer = num1 % num2;
            break;

          
            } 
         System.out.println("Answer:");
         System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
        }
    }
}


 

    

