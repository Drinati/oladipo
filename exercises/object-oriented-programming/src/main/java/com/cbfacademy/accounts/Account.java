package com.cbfacademy.accounts;

public class Account {
    private double balance;
    private int accountNumber;

    public Account(int accountNumber, double balance) {
        this.setAccountNumber(accountNumber);
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
    return this.accountNumber; 
    }
    
}
