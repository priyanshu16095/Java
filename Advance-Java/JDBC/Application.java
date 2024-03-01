package src.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Application {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("---Welcome---");
        System.out.println("Press\n1.) Sign up\n2.) Login");
        System.out.print("Enter: ");
        int res = in.nextInt();
        switch (res) {
            case 1:
                signup();
                break;
            case 2:
                login();
                break;
            default:
                break;
        }
    }
    public static void signup() {
        System.out.println("---Enter the details---");
        System.out.print("Username: ");
        String username = in.next();
        System.out.print("EmailId: ");
        String emailId = in.next();
        System.out.print("Password: ");
        String password = in.next();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "ram16095");
            PreparedStatement ps = con.prepareStatement("INSERT INTO userDetails VALUES(?, ?, ?);");
            ps.setString(1, username);
            ps.setString(2, emailId);
            ps.setString(3, password);

            int count = ps.executeUpdate();
            if(count > 0) {
                System.out.println("User registered sucessfully!");
            } else {
                System.out.println("Registration failed!");
            }
        } catch(Exception e) {
            System.out.println("Some exception occured!");
        }
    }
    public static void login() {
        System.out.println("---Enter the details---");
        System.out.print("EmailId: ");
        String emailId = in.next();
        System.out.print("Password: ");
        String pasword = in.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "ram16095");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM userDetails where email=? and password=?;");
            ps.setString(1, emailId);
            ps.setString(2, pasword);

            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                System.out.println("Login sucessfull!");
            }
            else {
                System.out.println("Login failed!");
            }
        } catch(Exception e) {
            System.out.println("Exception occured!");
        }
    }
}

