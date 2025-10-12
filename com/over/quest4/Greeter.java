package com.over.quest4;

public class Greeter {
    String name;

    public Greeter(String name) {
        this.name = name;
    }

    void greetUser(String... messages) {

        for (String message : messages) {
            System.out.println(message+" "+ this.name);
        }
        // iterate through messages and print message + name;
        // here the message varies but name is same
    }

    void sayHello(String... names) {
        for(String name: names){
            System.out.println("Welcome"+" "+ name);
        }
        // iterate through names and print "Welcome"+name;
        // here the message is same but name varies
    }
}
