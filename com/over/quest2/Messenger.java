package com.over.quest2;

public class Messenger {
    void sendMail(String message) {
        System.out.println("from sendMail(String message)");
        System.out.println(message);
    }

    void sendMail(String toUsername, String message) {
        System.out.println("from sendMail(String toUsername, String message) ");
        System.out.println(toUsername + "\t" + message);
    }

    void sendMail(String toUsername, String message, String subject) {
        System.out.println("from sendMail(String toUsername, String message, String subject) ");
        System.out.println(toUsername + " \t" + message + "\t" + subject);
    }
}


