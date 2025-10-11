package com.inher.quest5;

public class SmartPhone extends Mobile{
    @Override
    void call() {
        System.out.println("method in Smart Phone");
    }
    String[] apps(){
        return new String[] {"instagram","whatsapp","linkedin","safari"};
    }
}
