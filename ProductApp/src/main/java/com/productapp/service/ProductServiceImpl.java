package com.productapp.service;

import com.productapp.dao.IProductDao;
import com.productapp.dao.ProductDaoImpl;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductDao productDao = new ProductDaoImpl();


    @Override
    public void addProduct(Product product) throws SQLException {
        productDao.createProduct(product);
    }

    @Override
    public void updateProduct(int productID, double price) {
        productDao.updateProductID(productID, price);
    }

    @Override
    public void deleteProduct(int productID) {
        productDao.deleteProductByID(productID);
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = productDao.findAll();
        if (products.isEmpty()) {
            throw new ProductNotFoundException("no data available");
        }
        return products.stream().sorted((o1, o2) -> o1.getProductName().compareTo(o2.getProductName())).toList();
    }

    @Override
    public List<Product> getByBrand(String brand) {
        List<Product> products = productDao.findByBrand(brand);
        if (products.isEmpty()) {
            throw new ProductNotFoundException("no data available");
        }
        return products.stream().sorted((o1, o2) -> o1.getProductName().compareTo(o2.getProductName())).toList();
    }

    @Override
    public List<Product> getByBrandAndCategory(String brand, String category) {
        List<Product> products = productDao.findByBrandAndCategory(brand, category);
        if (products.isEmpty()) {
            throw new ProductNotFoundException("no data available");
        }
        return products.stream().sorted((o1, o2) -> o1.getProductName().compareTo(o2.getProductName())).toList();
    }

    @Override
    public Product getByID(int productID) {
        Product product = productDao.getByID(productID);
        if (product == null) {
            throw new ProductNotFoundException("no data available");
        }
        return product;
    }

    @Override
    public List<Product> getByCategoryAndPrice(String category, double price) {
        List<Product> products = productDao.findByCategoryAndPrice(category, price);
        if (products.isEmpty()) {
            throw new ProductNotFoundException("no data available");
        }
        return products.stream().sorted((o1, o2) -> o1.getProductName().compareTo(o2.getProductName())).toList();
    }
}
