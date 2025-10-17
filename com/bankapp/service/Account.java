package com.bankapp.service;

public abstract class Account {
    double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

    public double getBalance() {
        if (balance > 0)
            return balance;
        else {
            System.out.println("No available balance");
            return 0;
        }
    }
}

