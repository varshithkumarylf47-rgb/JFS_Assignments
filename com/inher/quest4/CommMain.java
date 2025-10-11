package com.inher.quest4;

import java.util.Scanner;

public class CommMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose mode communication:");
        System.out.println("1. MailCommunication\n2. SMSCommunication\n3. PhoneCommunication\n4. WhatsppCommunication");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();

        Communication communication;

        switch (choice) {
            case 1:
                communication = new MailCommunication();
                communication.sendMessage();
                MailCommunication mailCommunication = (MailCommunication) communication;
                for( String mail : mailCommunication.showTypes()){
                    System.out.print(mail+ "\t");
                }
                break;

            case 2:
                communication = new SMSCommunication();
                communication.sendMessage();
                SMSCommunication smsCommunication = (SMSCommunication) communication;
                smsCommunication.messageLength();
                break;

            case 3:
                communication = new PhoneCommunication();
                communication.sendMessage();
                PhoneCommunication phoneCommunication = (PhoneCommunication) communication;
                phoneCommunication.messageLength();
                break;

            case 4:
                communication = new WhatsappCommunication();
                communication.sendMessage();
                WhatsappCommunication whatsappCommunication = (WhatsappCommunication) communication;
                whatsappCommunication.otherFeatures();
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

