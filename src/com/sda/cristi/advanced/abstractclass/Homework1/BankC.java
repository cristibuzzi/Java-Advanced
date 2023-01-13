package com.sda.cristi.advanced.abstractclass.Homework1;

public class BankC extends Bank{
 public double balance;

    public BankC(double balance) {
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
        return "BankC: " +
                "balance= " + balance;
    }
}
