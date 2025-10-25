/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0005bankaccount;

/**
 *
 * @author 62852
 */
public class Main {
    public static void main(String args[]) {
        
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance $500");
        BankAccount BA1234 = new BankAccount("BA1234", 500);
        
        System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000 : $" + BA1234.getBalance());
        
        System.out.println("Withdraw $600 from account BA1234: ");
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600 : $" + BA1234.getBalance());
        
        System.out.println("=====================================================================");
        
        //New account
        
        System.out.println("Create a Bank Account object (A/c No. SA1234) with initial balance $450");
        SavingsAccount SA1234 = new SavingsAccount("SA1234", 450);
        
        System.out.println("Withdraw $300 from account FA1234: ");
        SA1234.withdraw(300);
        System.out.println("New balance after trying to withdraw $250 : $" + SA1234.getBalance());
        
        System.out.println("=====================================================================");
        
        //New account
        
        System.out.println("Create a Bank Account object (A/c No. SA1000) with initial balance $300");
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);
        
        System.out.println("Withdraw $300 from account FA1000: ");
        SA1000.withdraw(250);
        System.out.println("New balance after trying to withdraw $250 : $" + SA1000.getBalance());
        
    }
}
