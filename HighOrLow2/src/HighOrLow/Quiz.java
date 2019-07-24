
package HighOrLow;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        
    int cpuNumber = (int)(Math.random() * 100 + 1);
    System.out.println("I am thinking of a number between 0 and 100. Guess a number and I will tell you if mine is higher or lower.");
    boolean answerCorrect = false;
    Scanner keyboard = new Scanner(System.in);

    while (answerCorrect != true) {
    System.out.println("Make your guess:");
    int userGuess = keyboard.nextInt();
    if (userGuess > cpuNumber) {
        System.out.println("Your guess was higher than my number!");
    }
    else if (userGuess < cpuNumber) {
        System.out.println("Your guess was lower than my number!");
    }
    else {
        System.out.println("You guessed my number!");
        break;
    }
    
    }
    
}
}
