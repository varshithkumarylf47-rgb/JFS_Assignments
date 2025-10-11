package com.basics.quest5;

public class Mobile {
    String model;
    String brand;
    double price;

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Mobile(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    void getDetails() {
        System.out.println("Model :" + this.model);
        System.out.println("Brand : " + this.brand);
        System.out.println("Price " + this.price);
    }
}
