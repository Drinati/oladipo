package com.cbfacademy.accounts;

public class SavingsAccount {
  int accountNumber;
  private double balance;
  private double interestRate;
  
    public SavingsAccount(int accountNumber, double balance, double interestRate) {

    this.accountNumber = accountNumber;
    this.balance = balance;
    this.interestRate = interestRate;
  }

    public void applyInterest() {
    this.interestRate = balance* (interestRate / 100);
    balance += interestRate;

   }


    public double getInterestRate() {
    return interestRate;

   }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;

   }

   public void setAccountNumber(int accountNumber){
    this.accountNumber = accountNumber;
   }

   public void setBalance(double balance) {
    this.balance = balance;
   }

}


