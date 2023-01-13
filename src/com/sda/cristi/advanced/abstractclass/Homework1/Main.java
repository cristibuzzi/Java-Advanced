package com.sda.cristi.advanced.abstractclass.Homework1;

/**
 * HOMEWORK
 * ##### Abstract class exercise 2
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 * Call this method by creating an object of each of the three classes.
 */


public class Main {
    public static void main(String[] args) {
      Bank bank1=new BankA(100);
      Bank bank2=new BankB(150);
      Bank bank3=new BankC(200);
        System.out.println(bank1);
        System.out.println(bank2);
        System.out.println(bank3);
    }
}
