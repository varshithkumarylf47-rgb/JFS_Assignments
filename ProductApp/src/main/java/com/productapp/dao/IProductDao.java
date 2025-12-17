package com.productapp.dao;

import com.productapp.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDao {

    void createProduct(Product product) throws SQLException;

    void updateProductID(int productID, double price);

    void deleteProductByID(int productID);

    List<Product> findAll();

    List<Product> findByBrand(String brand);

    List<Product> findByBrandAndCategory(String brand, String category);

    Product getByID(int productID);

    List<Product> findByCategoryAndPrice(String category, double price);

}
