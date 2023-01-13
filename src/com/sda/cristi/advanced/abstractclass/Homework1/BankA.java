package com.sda.cristi.advanced.abstractclass.Homework1;

public class BankA extends Bank {
   public double balance;

       @Override
       public double getBalance() {
           return 100;
       }

    public BankA(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankA: " +
                "balance= " + balance;
    }
}
