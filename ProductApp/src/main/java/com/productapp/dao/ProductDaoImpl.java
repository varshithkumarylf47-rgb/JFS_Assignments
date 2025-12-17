package com.productapp.dao;

import com.productapp.model.Product;
import com.productapp.util.DBConnection;
import com.productapp.util.Queries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements IProductDao {
    static Connection connection;

    static {
        connection = DBConnection.openConnection();
        System.out.println("In static block of ProductDaoImpl");
    }

    @Override
    public void createProduct(Product product) throws SQLException {
        try {
            PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);
            statement.setString(1, product.getProductName());
            statement.setString(2, product.getBrand());
            statement.setString(3, product.getCategory());
            statement.setDouble(4, product.getPrice());
            System.out.println("Inserted " + !statement.execute());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Done");
    }

    @Override
    public List<Product> findAll() {
        System.out.println("In dao to get all products");
        List<Product> products = new ArrayList<Product>();
        try (
                PreparedStatement statement = connection.prepareStatement(Queries.FINDALL);
                ResultSet rs = statement.executeQuery();) {
            while (rs.next()) {
                String productName = rs.getString("product_name");
                int productid = rs.getInt("product_id");
                String brand = rs.getString("brand");
                String category = rs.getString(5);
                double price = rs.getDouble(3);
            Product product = new Product(productName,productid,category,price,brand);
            products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    @Override
    public List<Product> findByBrand(String brand) {
        System.out.println("In dao to find by brand");
        List<Product> products1 = new ArrayList<Product>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.FINDBYBRAND);) {
            statement.setString(1,brand);
            try (ResultSet rs = statement.executeQuery();){
                while (rs.next()) {
                    String productName = rs.getString("product_name");
                    int productid = rs.getInt("product_id");
                    String brand1 = rs.getString(4);
                    String category = rs.getString(5);
                    double price = rs.getDouble(3);
                    Product product = new Product(productName,productid,category,price, brand1);
                    products1.add(product);
                }}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products1;
    }

    @Override
    public List<Product> findByBrandAndCategory(String brand, String category) {
        System.out.println("In dao to find by brand and category");
        List<Product> products1 = new ArrayList<Product>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.FINDBYBRANDandCAT);) {
            statement.setString(1,brand);
            statement.setString(2,category);
            try (ResultSet rs = statement.executeQuery();){
                while (rs.next()) {
                    String productName = rs.getString("product_name");
                    int productid = rs.getInt("product_id");
                    String brand1 = rs.getString(4);
                    String category1 = rs.getString(5);
                    double price = rs.getDouble(3);
                    Product product = new Product(productName,productid, category1,price, brand1);
                    products1.add(product);
                }}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products1;
    }

    @Override
    public Product getByID(int productID) {
        System.out.println("In dao to find by brand");
        Product products1 = new Product();
        try (PreparedStatement statement = connection.prepareStatement(Queries.FINDBYID);) {
            statement.setInt(1,productID);
            try (ResultSet rs = statement.executeQuery();){
                while (rs.next()) {
                    String productName = rs.getString("product_name");
                    int productid = rs.getInt("product_id");
                    String brand1 = rs.getString(4);
                    String category = rs.getString(5);
                    double price = rs.getDouble(3);
                    products1 = new Product(productName,productid,category,price, brand1);
                }}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products1;
    }

    @Override
    public List<Product> findByCategoryAndPrice(String category, double price) {
        System.out.println("In dao to find by category and price");
        List<Product> products1 = new ArrayList<Product>();
        try (PreparedStatement statement = connection.prepareStatement(Queries.FINDBYCATEGORYANDPRICE);) {
            statement.setString(1,category);
            statement.setDouble(2,price);
            try (ResultSet rs = statement.executeQuery();){
                while (rs.next()) {
                    String productName = rs.getString("product_name");
                    int productid = rs.getInt("product_id");
                    String brand1 = rs.getString(4);
                    String category1 = rs.getString(5);
                    double price1 = rs.getDouble(3);
                    Product product = new Product(productName,productid, category1, price1, brand1);
                    products1.add(product);
                }}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products1;
    }

    @Override
    public void updateProductID(int productID, double price) {
        System.out.println("In dao updating price based on product ID ");
        try (PreparedStatement statement = connection.prepareStatement(Queries.UPDATEPRODUCTID);) {
            statement.setDouble(1,price);
            statement.setInt(2,productID);
            System.out.println("updated status: "+!statement.execute());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteProductByID(int productID) {
        System.out.println("In dao deleting product based on product ID ");
        try (PreparedStatement statement = connection.prepareStatement(Queries.DELETEPRODUCTBYID);) {
            statement.setInt(1,productID);
            System.out.println("updated status: "+!statement.execute());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
