package com.training.basic;


import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int duplicate = num;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        int armStrong = 0;
        for (int i = 0; i < count; i++){
            int checkNum = temp%10;
            temp = temp/10;
            armStrong = (int) (armStrong + Math.pow(checkNum,count));
        }
        if(duplicate == armStrong){
            System.out.println("Given number is a armStrong number");
        }
        else{
            System.out.println("Given number is not a armstrong number");
        }
    }
}
