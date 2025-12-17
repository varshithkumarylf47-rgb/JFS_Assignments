package com.productapp.model;

public class Product {
    private String productName;
    private int productID;
    private String category;
    private double price;
    private String brand;

    public Product() {
    }

    public Product(String productName, int productID, String category, double price, String brand) {
        this.productName = productName;
        this.productID = productID;
        this.category = category;
        this.price = price;
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID=" + productID +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
