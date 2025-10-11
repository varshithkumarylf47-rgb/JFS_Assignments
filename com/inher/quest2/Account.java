package com.inher.quest2;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        System.out.println("in superclass");
    }

    void deposit(double amount) {
        System.out.println("in superclass");
    }

    double getBalance() {
        return balance;
    }
}
