package com.inher.quest2;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(5000);
        System.out.println("Balance: " + account.balance);
        System.out.println();
        System.out.print("Select Current(C)/Savings(S): ");
        String optionCS = scanner.next();
        switch (optionCS.toLowerCase()) {
            case "s":
                account = new Savings(3000);
                System.out.print("Select WithDraw(W)/Deposit(D): ");
                String optionS = scanner.next();
                if (optionS.equalsIgnoreCase("W")) {
                    account.withdraw(300);
                    break;
                }
                if (optionS.equalsIgnoreCase("D")) {
                    account.deposit(200);
                    break;
                }
            case "c":
                account = new Current(3000);
                System.out.print("Select WithDraw(W)/Deposit(D): ");
                optionS = scanner.next();
                if (optionS.equalsIgnoreCase("W")) {
                    account.withdraw(300);
                    break;
                }
                if (optionS.equalsIgnoreCase("D")) {
                    account.deposit(200);
                    break;
                }
        }
        scanner.close();
    }
}
