/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _0005bankaccount;

/**
 *
 * @author 62852
 */
public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    @Override
    public void withdraw(double amount) {
        super.getBalance();
        
        if(getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
    
}
