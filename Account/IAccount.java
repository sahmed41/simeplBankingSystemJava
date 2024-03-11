package Account;

import Users.*;

public interface IAccount {

    
        // Getters 
    public String getNumber();
    public User getHolder();
    public double getBalance();

    // Other methods
    public boolean balanceCheck(double amount); // This method checks whether the account has more money after substracting the amount (aparameter).
    public void deposit(double amount);
    public String withdraw(double amount);
    public String transfer(Account account, double amount); // This method transfer money to another account
    
    
}