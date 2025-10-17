package com.bankapp.service;

public class Current extends Account {
    public Current(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
//        System.out.println("Withdraw from Current account");
        balance = balance - amount;
    }

    @Override
    public void deposit(double amount) {
//        System.out.println("Deposited money to Current account");
        balance = balance + amount;

    }

    public void transactionsAllowed() {
        System.out.println("20 transactions per day are allowed for you current account");
    }
}
