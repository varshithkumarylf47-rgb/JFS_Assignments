package com.bankapp.client;

import com.bankapp.service.Account;
import com.bankapp.service.Current;
import com.bankapp.service.Savings;

import java.util.Scanner;

public class ATMMain {
    public static void doContinue(String value) {
        if (value.equalsIgnoreCase("yes")) {
            System.out.println("NEW TRANSACTION");
        } else {
            System.out.println("\n****************************\nTHANK YOU\nPLEASE VISIT VIRTUAL ATM AGAIN :)");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        double balanceC = 100000;
        double balanceS = 100000;

        System.out.println("\nWelcome to Virtual ATM\n****************************");
        Scanner scanner = new Scanner(System.in);
        Account account;
        while (true) {
            System.out.println();
            System.out.print("Select Current(C)/Savings(S): ");
            String optionCS = scanner.next();
            switch (optionCS.toLowerCase()) {
                case "s":
                    account = new Savings(balanceS);
                    System.out.print("Select WithDraw(W)/Deposit(D)/Balance(B): ");
                    String optionS = scanner.next();
                    if (optionS.equalsIgnoreCase("W")) {
                        Savings savings = (Savings) account;
                        System.out.print("Enter amount to WITHDRAW from SAVINGS account : ");
                        double amount = scanner.nextDouble();
                        savings.withdraw(amount);
                        balanceS = savings.getBalance();
                        savings.setBalance(balanceS);
                        if (balanceS != 0) {
                            System.out.println("Withdraw from Savings account successful\n" +
                                    "Deducted additional 100$ due to money withdraw from Saving account\nBalance after withdrawal : " + balanceS);
                            System.out.print("Do you want to proceed (yes)/(no) : ");
                        }
                        else {
                            System.out.println("please deposit money");
                            break;
                        }
                        String value = scanner.next();
                        ATMMain.doContinue(value);
                        break;
                    }
                    if (optionS.equalsIgnoreCase("D")) {
                        Savings savings = (Savings) account;
                        System.out.print("Enter amount to DEPOSIT in SAVINGS account: ");
                        double amount = scanner.nextDouble();
                        savings.deposit(amount);
                        balanceS = savings.getBalance();
                        System.out.println("Deposit to Savings account successful\n" +
                                "Deposited additional 100$ due to money deposited into Saving account\nBalance after deposit : " + balanceS);
                        savings.showDepositSchemes();
                        System.out.print("Do you want to proceed (yes)/(no) : ");
                        String value = scanner.next();
                        ATMMain.doContinue(value);
                        break;
                    }
                    if (optionS.equalsIgnoreCase("B")) {
                        Savings savings = (Savings) account;
                        System.out.println("Balance in Savings account : " + savings.getBalance());
                        System.out.print("Do you want to proceed (yes)/(no) : ");
                        String value = scanner.next();
                        ATMMain.doContinue(value);
                        break;
                    }
                    else {
                        System.out.println("Invalid Option. Please Try Again");
                        break;
                    }

                case "c":
                    account = new Current(balanceC);
                    ((Current) account).transactionsAllowed();
                    System.out.print("Select WithDraw(W)/Deposit(D)/Balance(B): ");
                    optionS = scanner.next();
                    if (optionS.equalsIgnoreCase("W")) {
                        Current current = (Current) account;
                        System.out.print("Enter amount to WITHDRAW from CURRENT account : ");
                        double amount = scanner.nextDouble();
                        current.withdraw(amount);
                        balanceC = current.getBalance();
                        if (balanceC != 0) {
                            System.out.println("Withdraw from Current account successful\nBalance after withdrawal : " + balanceC);
                            System.out.print("Do you want to proceed (yes)/(no) : ");
                        } else {
                            System.out.println("please deposit money");
                            break;
                        }
                        String value = scanner.next();
                        ATMMain.doContinue(value);
                        break;
                    }
                    if (optionS.equalsIgnoreCase("D")) {
                        Current current = (Current) account;
                        System.out.print("Enter amount to DEPOSIT in CURRENT account : ");
                        double amount = scanner.nextDouble();
                        current.deposit(amount);
                        balanceC = current.getBalance();
                        System.out.println("Deposit to Current account successful\nBalance after withdrawal : " + balanceC);
                        System.out.print("Do you want to proceed (yes)/(no) : ");
                        String value = scanner.next();
                        ATMMain.doContinue(value);
                        break;
                    }
                    if (optionS.equalsIgnoreCase("B")) {
                        Current current = (Current) account;
                        System.out.println("Balance in Current account : " + current.getBalance());
                        System.out.print("Do you want to proceed (yes)/(no) : ");
                        String value = scanner.next();
                        ATMMain.doContinue(value);
                        break;
                    }
                    else {
                        System.out.println("Invalid Option. Please Try Again");
                        break;
                    }

                default:
                    System.out.println("Invalid Option. Please Try Again");
                    break;
            }
        }
    }
}
