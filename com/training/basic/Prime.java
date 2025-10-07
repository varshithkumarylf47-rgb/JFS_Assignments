package com.training.basic;

public class Prime {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            if (number == 2 || number == 3 || number == 5 || number == 7)
                System.out.print(number + " ");
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
                System.out.print(number + " ");
        }
    }
}

