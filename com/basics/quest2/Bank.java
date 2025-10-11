package com.basics.quest2;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    double getBalance() {
        return balance;
    }
    void withDraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdraw successful");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
    }


}
