package com.threads.quest1;

public class Booking implements Runnable {
    Booking booking;
    String name;
    int noOfTickets;
    TicketCounter ticketCounter;
    String classABC;
    Thread t;

    @Override
    public void run() {
        synchronized (ticketCounter) {
            try {
                t.sleep(5000);

                ticketCounter.bookTickets(name, noOfTickets, classABC);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public Booking(String name, int noOfTickets, TicketCounter ticketCounter, String classABC) {
        this.name = name;
        this.noOfTickets = noOfTickets;
        this.ticketCounter = ticketCounter;
        this.classABC = classABC;
        t = new Thread(this);
        t.start();

    }



}
