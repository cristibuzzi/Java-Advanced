package com.sda.cristi.advanced.abstractclass.Homework1;

public class BankB extends Bank {
   public double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankB: " +
                "balance= " + balance;
    }
}
