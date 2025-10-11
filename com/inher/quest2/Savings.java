package com.inher.quest2;

public class Savings extends Account {

    public Savings(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("withdraw in savings");
    }

    @Override
    void deposit(double amount) {
        System.out.println("deposit in savings");
    }
}
