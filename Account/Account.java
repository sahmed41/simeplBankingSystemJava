package Account;

import Users.Customer;

public class Account {
    private String number;
    private Customer holder; 
    private double balance;
    public double miminumBalance;

    public Account(String number, Customer holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        balance = initialDeposit;
    }

    // Getters 
    public String getNumber() {
        return number;
    }

    public Customer getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Other methods
    public boolean balanceCheck(double amount) { // This method checks whether the account has more money after substracting the amount (aparameter).
        if ((getBalance() + miminumBalance) >= amount) {
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String withdraw(double amount) {
        if (balanceCheck(amount)) {
            balance -= amount;
            return "Withdrawal Successful!";
        }
        return "Withdrawal Failed Due to Inadequate Balance!";
    }

    public String transfer(Account account, double amount) { // This method transfer money to another account
        if (balanceCheck(amount)) {
            withdraw(amount);
            account.deposit(amount);
            return "Transfer Successful!";
        }
        return "Transfer Failed Due to Inadequate Balance!";
    }
}
