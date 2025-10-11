package com.inher.quest2;

public class Current extends Account {

    public Current(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("withdraw in current");
    }

    @Override
    void deposit(double amount) {
        System.out.println("deposit in current");
    }
}
