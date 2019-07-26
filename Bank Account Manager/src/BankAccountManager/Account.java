
package BankAccountManager;

import java.util.Scanner;



public class Account {
    int balance1, balance2, balance3, withdrawAmount, depositAmount;
        String ownerName;
        
        
        public Account(int newBalance, int newWithdrawAmount, int newDepositAmount) {
            balance = newBalance;
            withdrawAmount = newWithdrawAmount;
        }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getBalance() {
        return balance;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public int getDepositAmount() {
        return depositAmount;
    }
    public int modifyAccount() {
    Scanner keyboard = new Scanner(System.in);
    boolean validInput = false;
            while (validInput == false) {
                System.out.println("Would to like to make a withdrawal or deposit");
            System.out.println("1) Withdraw");
            System.out.println("2) Deposit");
            userInput = keyboard.nextInt();
            if (openedAccount == 1) {
            if (userInput == 1) {
                
                System.out.println("Current Balance: " + balance1 );
                System.out.println("Enter your withdrawal amount:");
                int withdrawAmount = keyboard.nextInt();
                validInput = true;aaa
            }
            else if (userInput == 2) {
                
                System.out.println("Current Balance: " + balance1 );
                System.out.println("Enter your deposit amount:");
                depositAmount = keyboard.nextInt();
                validInput = true;
            }
            else {
                System.out.println("Not a valid input. Try again.");
            }
            }
            }
    
}
    



}
