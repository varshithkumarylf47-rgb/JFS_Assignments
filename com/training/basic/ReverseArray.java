package com.training.basic;

public class ReverseArray {
    public static void main(String[] args) {
        int tempNumber = 0;
        int reverseNumber = 0;
        int[] arrayNumbers = {234, 567, 123, 895};
        for (int i = 0; i < arrayNumbers.length; i++) {
            int number = arrayNumbers[i];
            while (number != 0) {
                tempNumber = number % 10;
                number = number / 10;
                reverseNumber = reverseNumber * 10 + tempNumber;
            }
            System.out.print(reverseNumber+ " ");
            tempNumber=reverseNumber=0;
        }
    }

}

