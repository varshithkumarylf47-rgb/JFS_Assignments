package com.threads.quest1;

public class Customer {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter(100);
        System.out.println("in main");
        Booking booking1 = new Booking("Sam",9,ticketCounter,"B");
        Booking booking = new Booking("Ram",5,ticketCounter,"A");
        Booking booking2 = new Booking("Jam",11,ticketCounter,"C");
        Booking booking3 = new Booking("fam",5,ticketCounter,"A");

    }
}
