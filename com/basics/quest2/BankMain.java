package com.basics.quest2;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank(5000);
        System.out.print("Welcome to Bank\nAvailable balance: " + bank.balance + "$\n" + "Please select any one of the option below\n" + "Withdraw(w)/Deposit(d): ");
        Scanner sc = new Scanner(System.in);
        String request = sc.next();
        switch (request.toLowerCase()) {
            case "w":
                System.out.print("Enter amount to withdraw: $");
                double amount = sc.nextDouble();
                bank.withDraw(amount);
                System.out.println("Balance after withdrawal : " + bank.getBalance()+"$");
                break;
            case "d":
                System.out.print("Enter amount to deposit: $");
                double amount1 = sc.nextDouble();
                bank.deposit(amount1);
                System.out.println("Balance after deposit: " + bank.getBalance()+"$");
                break;
            default:
                System.out.println("Not a valid option");
        }
    }
}
