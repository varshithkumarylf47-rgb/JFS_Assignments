package com.over.quest2;

public class MessengerMain {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.sendMail("hi");
        messenger.sendMail("user","hello");
        messenger.sendMail("user","welcome","subject");


    }
}
