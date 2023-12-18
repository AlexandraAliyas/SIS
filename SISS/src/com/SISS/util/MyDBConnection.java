package com.SISS.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDBConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/SISSDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Alexandra@123";

    
    static Connection con=null;
    public static Connection getConnection(){
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            
            throw new RuntimeException("Error loading JDBC driver");
        }
        return con;
    }
    public static void main(String[] args) {
    	System.out.println(getConnection());
    }
    
    
    
}