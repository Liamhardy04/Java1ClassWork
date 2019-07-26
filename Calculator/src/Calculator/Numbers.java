package Calculator;
import java.util.Scanner;  
public class Numbers {
    public static void main(String[] args) {
        boolean getAnswer = false;
        boolean keepGoing = true;
        boolean valid = true;
        double prevAnswer;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter '1' now to get help and see your calculating options. Enter a different number to continue.");
        int enter = keyboard.nextInt();
        if (enter == 1 ) {
            System.out.println("Operator options: \n 1) '+' Adding two numbers together. \n 2) '-' Subtract one number from another number. \n "
                    + "3) '*' Multiply two numbers together. \n 4) '/' Divide one number by another. \n 5) '^' Raise a number to the power of another number. \n "
                    + "6) '%' Gives you the remainder of dividing a first number by a second number. \n      Example: 6 % 4 = the remainder of 6 / 4, or 2. \n "
                    + "7) '!' Multiplies a number by each whole number below it down to one. \n      Example: 5! = 5 * 4 * 3 * 2 * 1. \n 8) 's' Acts as sqrt. Finds the number that if squared would equal your inputed number. \n "
                    + "     Example: 36 s = 6. \n 9) 'c' Restarts calculator. \n 10)'e' Ends the progran.");
        }
                    System.out.println("Enter a number:");
        double answer = keyboard.nextDouble();
        OUTER:
        while (getAnswer == false) {
            if (keepGoing == false) {
                System.out.println("Restarted Calculator.");
                System.out.println("Enter '1' now to get help and see your calculating options. Enter a different number to continue.");
                enter = keyboard.nextInt();
                if (enter == 1 ) {
                    System.out.println("Operator options: \n 1) '+' Adding two numbers together. \n 2) '-' Subtract one number from another number. \n "
                            + " 3) '*' Multiply two numbers together. \n 4) '/' Divide one number by another. \n 5) '^' Raise a number to the power of another number. \n "
                            + "6) '%' Gives you the remainder of dividing a first number by a second number. \n      Example: 6 % 4 = the remainder of 6 / 4, or 2. \n "
                            + "7) Multiplies a number by each whole number below it down to one. \n      Example: 5! = 5 * 4 * 3 * 2 * 1. \n 8) 's' Acts as sqrt. Finds the number that if squared would equal your inputed number. \n "
                            + "     Example: 36 s = 6. \n 9) 'c' Restarts calculator. \n 10)'e' Ends the program." );
                    
                }
                System.out.println("Enter a number:");
                answer = keyboard.nextDouble();
                keepGoing = true;
            }
            System.out.println("Operator:");
            char operator = keyboard.next().charAt(0);
            switch (operator) {
                case '!':
                case 's':
                case 'c':
                case 'e':
                    double num11;
                    if (operator == 'c') {
                        keepGoing = false;
                    }
                    if (operator == 'e') {
                        getAnswer = true;
                        break OUTER;
                    }
                    if (operator == '!') {
                        System.out.println(answer);
                        num11 = answer;
                        for(int i = 0; i < num11 - 1; i++) {
                            answer = answer * (num11 - (i + 1));
                        }
                        System.out.println(num11 + "" + operator + " = " + answer );
                    }
                    else if ( operator == 's') {
                        prevAnswer = answer;
                        answer = Math.sqrt(answer);                     
                        System.out.println("Answer:");
                        System.out.println("√" + prevAnswer + " = " + answer);
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                case '%':
                    System.out.println("Next number:");
                    double num2 = keyboard.nextDouble();
                    switch (operator) {
                        case '+': answer = answer + num2;
                        break;
                        case '-': answer = answer - num2;
                        break;
                        case '*': answer = answer * num2;
                        break;
                        case '/': answer = answer / num2;
                        break;
                        case '^': answer = Math.pow(answer, num2);
                        break;
                        case '%': answer = answer % num2;
                        break;
                    }   break;
                default:
                    System.out.println("Invalid operator.");
                    valid = false;
                    break;
            }
            if (valid ==
                    true);
            {
                System.out.println("Answer: " + answer);
            }
            valid = true;     
        }
    }
}