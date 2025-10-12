package com.over.quest3;

public class Processor {
    void calculate(double x){
        System.out.println("Sqrt= "+(Math.sqrt(x)));// print the squareroot
    }
    void calculate(int x, int y){
        System.out.println("Product= "+ (x*y));// print the product
    }
    void calculate(double x, double y){
        System.out.println("Difference= "+ (x-y));// print the difference
    }
    void calculate(double x,int y){
        System.out.println("X to the power Y = "+(Math.pow(x,y))); // print x power y
    }
    void calculate(int x){
        System.out.println("Sqaure= "+((int)Math.pow(x,2)));
    }
}
