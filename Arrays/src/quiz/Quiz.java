
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
           System.out.println("Question 2: What US state is 13th in alphabetical order?");
        System.out.println("\tA) Africa");
        System.out.println("\tB) Illinois");
        System.out.println("\tC) Iowa");
        System.out.println("\tD) Canada");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, Illinois is the correct answer.");
        }
        System.out.println("Your score is " + rightAnswers + " out of 2 question.");
           
        System.out.println("Question 3: How many species of bird live in Germany?");
        System.out.println("\tA) 582");
        System.out.println("\tB) 519");
        System.out.println("\tC) 492");
        System.out.println("\tD) 499");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, You are uneducated, there are 519 species of bird in Germany.");
        }
         System.out.println("Your score is " + rightAnswers + " out of 3 question.");
         System.out.println("Question 4: How many species of bird live in England?");
        System.out.println("\tA) 602");
        System.out.println("\tB) 614");
        System.out.println("\tC) 519");
        System.out.println("\tD) 495");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Nope, the correct answer is 614");
        }
         System.out.println("Your score is " + rightAnswers + " out of 4 question.");
         System.out.println("Question 5: How many species of bird live in Africa?");
        System.out.println("\tA) 2341");
        System.out.println("\tB) 2259");
        System.out.println("\tC) 2170");
        System.out.println("\tD) 1952");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Nope, the correct answer is 2341");
        }
         System.out.println("Your score is " + rightAnswers + " out of 5 question.");
                  System.out.println("Question 6: How many species of bird live in Japan?");
        System.out.println("\tA) 616");
        System.out.println("\tB) 617");
        System.out.println("\tC) 619");
        System.out.println("\tD) 618");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Nope, the correct answer is 619");
        }
           System.out.println("Your score is " + rightAnswers + " out of 6 question.");
        
         
    }
    
}
