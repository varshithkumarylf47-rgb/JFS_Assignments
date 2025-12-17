package com.productapp.service;

import com.productapp.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {

    void  addProduct(Product product) throws SQLException;

    void updateProduct(int productID, double price);

    void deleteProduct(int productID);

    List<Product> getAll();

    List<Product> getByBrand(String brand);

    List<Product> getByBrandAndCategory(String brand, String category);

    Product getByID(int productID);

    List<Product> getByCategoryAndPrice(String category, double price);

}
