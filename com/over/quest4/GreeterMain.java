package com.over.quest4;

public class GreeterMain {
    public static void main(String[] args) {
        Greeter obj = new Greeter("Sara");
        // here the message varies but name is same
        obj.greetUser("welcome", "Great day");
        obj.greetUser("Good Day", "Have Tea","Enjoy Learning");
        System.out.println();
        // here the message is same but name varies
        obj.sayHello("Sri","Priya");
        obj.sayHello("Sara", "Anna", "Reena", "Rohan");
        obj.sayHello("Jo", "Roni");

    }
}
