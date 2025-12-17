package com.productapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
    static Connection connection;

    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/jfsjava";
        String username = "root";
        String password = "rootroot";
        String sql =
                """
                        create table IF NOT EXISTS product(product_name varchar(20) ,product_id int primary key auto_increment,price float, brand varchar(20),category varchar(20))
                        """;

        try {
            connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(sql);
            boolean status = statement.execute();
            System.out.println(!status);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}


