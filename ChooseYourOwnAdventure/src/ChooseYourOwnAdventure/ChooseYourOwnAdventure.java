
package ChooseYourOwnAdventure;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

    public static void main(String[] args) {
        System.out.println("You're in a room. Pick another one to enter and try to escape." );
        System.out.println("Enter 1 or 2 to enter your choice.");
        System.out.println("1) A room with a snake.");
        System.out.println("2) A room without a snake.");
        Scanner keyboard = new Scanner(System.in);
        int pDecision = keyboard.nextInt();
        if (pDecision == 1){
            System.out.println("You went into the door with a snake and it bit you.");
            System.out.println("You feel yourself start to morph into something.");
            System.out.println("You look in a conveniently placed mirror and see you look like Mr.Potato Head.");
        }
        else if (pDecision == 2) {
            System.out.println("You went into the door with no snake and found two more doors.");
            System.out.println("Enter 1 or 2 to enter your choice.");
            System.out.println("1) A room with an albino panda.");
            System.out.println("2) A room with a miniature giraffe.");
            pDecision = keyboard.nextInt();
            if (pDecision == 1) {
                System.out.println("You entered the room and made friends with the panda, it gave you a cookie and told you to give it to Jerry.");
                System.out.println("The panda says the first door is the way to go, do you trust him?");
                System.out.println("Enter 1 or 2 to enter your choice.");
                System.out.println("1) A room with a mysterious pile of jorts.");
                System.out.println("2) A room with some stylish 'My Little Pony' crocs.");
                pDecision = keyboard.nextInt();
                if (pDecision == 1) {
                    System.out.println("You go into the room and see your way to freedom. You leave with some jorts and a new panda friend.");
                }
                else if (pDecision == 2) {
                    System.out.println("You go into the room with the crocs and see a path up to the clouds.");
                    System.out.println("You walk off wearing only your My Little Pony crocs.");
                }
                else {
                    System.out.println("Not a valid input.");
                    System.out.println("You lose.");
                }
                
            }
            else if (pDecision == 2) {
                System.out.println("You saw the miniature girrafe and it slapped you with it's face. You have a black eye.");
                System.out.println("You see two more doors.");
                System.out.println("Enter 1 or 2 to enter your choice,");
                System.out.println("1) A room with a diamond pickaxe.");
                System.out.println("2) A room with a diamond helmet.");
                pDecision = keyboard.nextInt();
                if (pDecision == 1) {
                    System.out.println("You grabbed the diamond pickaxe and mine your way to freedom.");
                }
                else if (pDecision == 2) {
                    System.out.println("You try to put on the helmet but it doesn't fit on your head.");
                    System.out.println("You look inside the helmet and realise it's actually a bowl, and has a salad inside.");
                    System.out.println("You eat the salad and appear in the front yard of your house.");
                }
                else {
                    System.out.println("Not a valid input.");
                    System.out.println("You lose.");
                }
            }
            else {
                System.out.println("Not a valid input.");
                System.out.println("You lose.");
            }
        }
        else {
            System.out.println("Not a valid input.");
            System.out.println("You lose.");
        }

    }
}
    

