package com.training.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: " );
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        String[][] names = new String[rows][columns];
        //populating two dim array
        System.out.println("Enter the names :");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = scanner.next();
            }
        }
        //iterating and printing value
        for (int i = 0; i < names.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + "\t");
            }
        }
        System.out.println();

        ArrayList<String> oneDim = new ArrayList<>();
        int counter=0;
        //checking for names starting with s and storing them in array
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
            if(names[i][j].startsWith("s")){
               oneDim.add(counter , names[i][j]);
                counter++;
            }
            }
        }
        System.out.println();
        System.out.print("Names starting with s : ");
        //iternating and print array
        for(String name: oneDim)
            System.out.print(name+ " ");
    }
}