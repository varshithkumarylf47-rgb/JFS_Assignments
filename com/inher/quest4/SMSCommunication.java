package com.inher.quest4;

public class SMSCommunication extends Communication {
    void messageLength(){
        System.out.println("short messages of up to 160 characters");
    }

    void sendMessage() {
        System.out.println("communication through short messaging service");
    }
}