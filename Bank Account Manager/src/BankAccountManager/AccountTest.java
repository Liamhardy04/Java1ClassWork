/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccountManager;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class AccountTest {
    
        public static void main(String[] args) {
            
            
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Which account would you like to open?");
            System.out.println("1) Business Account");
            System.out.println("2) Checking Account");
            System.out.println("3) SavingsAccount");
            int openedAccount = keyboard.nextInt();
    }
    
}

