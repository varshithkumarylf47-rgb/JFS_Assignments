package com.productapp.util;

public class Queries {

    // Insert a new product into the product table
    public static final String INSERTQUERY =
            "INSERT INTO product(product_name, brand, category, price) VALUES (?,?,?,?)";

    // Retrieve all products from the product table
    public static final String FINDALL =
            "SELECT * FROM Product";

    // Find products by brand
    public static final String FINDBYBRAND =
            "SELECT * FROM Product WHERE brand = ?";

    // Find a product by its unique product ID
    public static final String FINDBYID =
            "SELECT * FROM Product WHERE product_id = ?";

    // Find products by brand and category
    public static final String FINDBYBRANDandCAT =
            "SELECT * FROM Product WHERE brand = ? AND category = ?";

    // Find products by category and price
    public static final String FINDBYCATEGORYANDPRICE =
            "SELECT * FROM Product WHERE category = ? AND price = ?";

    // Update product ID using existing product ID and price
    public static final String UPDATEPRODUCTID =
            "update product set price = ? where product_id=?";

    // Delete a product using its product ID
    public static final String DELETEPRODUCTBYID =
            "DELETE FROM Product WHERE product_id = ?";


}
