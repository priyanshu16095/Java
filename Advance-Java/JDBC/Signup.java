package src.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Signup {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("---Fill the details---");
        System.out.print("Username: ");
        String username = in.nextLine();
        System.out.print("Email Id: ");
        String emailId = in.nextLine();
        System.out.print("Password: ");
        String password = in.nextLine();

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
                System.out.println("Registrationn failed!");
            }
        } catch(Exception e) {
            System.out.println("Some exception occured!");
        }

    }
}
