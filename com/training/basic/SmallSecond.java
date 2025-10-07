package com.training.basic;

public class SmallSecond {
    public static void main(String[] args) {
        int[] numbers = {6,7,4,2,5,8,9};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if(numbers[j]<numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("Second smallest in an array : "+ numbers[numbers.length-2]);
    }
}

