package com.example;

import java.sql.*;

public class App {
    public static void main( String[] args ) {
        // ADD THE MYSQL CONNECTOR DEPENDENCY 
        // 
        String username = "Ramesh Gupta";
        String emailId = "ramesh@gmail.com";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "ram16095");
            PreparedStatement ps = con.prepareStatement("INSERT INTO userDetails VALUES(?, ?, ?);");
            ps.setString(1, username);
            ps.setString(2, emailId);
            ps.setString(3, password);
            ps.executeUpdate();
            System.out.println("Registration Succesfull!");
        } catch(Exception e) {
            System.out.println("Exception occured!");
        }
    }
}
