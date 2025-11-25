package com.threads.quest1;

public class TicketCounter {
    int totalTickets;

    public TicketCounter(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    double bookTickets(String name, int noOfTickets, String classabc) {
        double amount = 0;
        System.out.println("Total Tickets: "+totalTickets );
        if (classabc.equalsIgnoreCase("A")) {
            amount = 320 * noOfTickets;
            calculator(name, noOfTickets, classabc, amount);
        }
        if (classabc.equalsIgnoreCase("b")) {
            amount = 200 * noOfTickets;
            calculator(name, noOfTickets, classabc, amount);
        }
        if (classabc.equalsIgnoreCase("c")) {
            amount = 120 * noOfTickets;
            calculator(name, noOfTickets, classabc, amount);
        }
        return amount;
    }

    public void calculator(String name, int noOfTickets, String classabc, double amount) {
        System.out.println("Total Amount for " + noOfTickets + " tickets in class " + classabc + " for " + name.toUpperCase() + "  =  " + amount);
        totalTickets -= noOfTickets;
        System.out.println("Total Tickets left: "+totalTickets);
    }
}
