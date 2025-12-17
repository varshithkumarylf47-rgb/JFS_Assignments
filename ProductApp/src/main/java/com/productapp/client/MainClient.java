package com.productapp.client;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import com.productapp.service.ProductServiceImpl;

import java.sql.SQLException;

public class MainClient {
    static void main() throws SQLException {
        IProductService productService = new ProductServiceImpl();
//        Product product = new Product("Speaker", 0, "Electronics", 534.0, "Samsung");
//        productService.addProduct(product);
//        product = new Product("Headphones", 0, "Electronics", 134.0, "Samsung");
//        productService.addProduct(product);
//        product = new Product("Notebook", 0, "Stationary", 13.0, "Classmate");
//        productService.addProduct(product);
        productService.getAll().forEach(System.out::println);
        System.out.println();
        productService.getByBrand("Samsung").forEach(System.out::println);
        System.out.println();
        System.out.println(productService.getByID(3));
        System.out.println();
        productService.getByBrandAndCategory("Samsung","Electronics").forEach(System.out::println);
        System.out.println();
        productService.getByCategoryAndPrice("Electronics",534).forEach(System.out::println);
        productService.updateProduct(3,10);
        productService.deleteProduct(1);

    }
}
