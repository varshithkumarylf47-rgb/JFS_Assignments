package com.training.basic;

public class Reverse {
    public static void main(String[] args) {
        int number = 2563;
        int tempNumber = 0;
        int reverseNumber = 0;
        while(number != 0){
            tempNumber = number % 10;
            number = number/10;
            reverseNumber =reverseNumber*10 + tempNumber;
        }
        System.out.print(reverseNumber);
    }
}
