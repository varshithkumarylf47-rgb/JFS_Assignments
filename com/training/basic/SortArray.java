package com.training.basic;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5,3,4,7,6};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i-1; j++) {
                if(numbers[j]<numbers[j+1]){
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for(int value : numbers)
            System.out.print(value+" ");
    }

}

