package com.bankapp.service;

public class Savings extends Account {

    public Savings(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        balance = (balance - amount) - 100;
    }

    @Override
    public void deposit(double amount) {
        balance = (balance + amount) + 100;

    }

    public void showDepositSchemes() {
        System.out.println("New Deposits Schemes Available\n1.Fixed Deposit (FD)\n2.Recurring Deposit (RD)\n3.Certificate of Deposit (CD)\nGo to the nearest bank to get more details\n");
    }
}
