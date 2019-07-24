
package userdata;

import java.util.Scanner;
public class UserData {
    

    
    public static void main(String[] args) {
        String name;
        int age;
        String birthday;
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        name = keyboard.nextLine();
        System.out.println("Hi " + name + "! How old are you?");
        age = keyboard.nextInt();
        System.out.println("Cool! When was your birthday?");
        birthday = keyboard.nextLine();
        System.out.println(birthday);

  
    }
    
}
