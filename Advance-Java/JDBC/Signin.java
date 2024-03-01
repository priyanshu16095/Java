package src.java;

import java.sql.*;
import java.util.Scanner;

public class DB_Con {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---Fill the details---");
        System.out.print("EmailId: ");
        String emailId = in.nextLine();
        System.out.print("Password: ");
        String password = in.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "ram16095");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM userDetails where email=? and password=?;");
            ps.setString(1, emailId);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Login Sucessfull!");
            } else {
                System.out.println("Loign Failed!");
            }
        } catch (Exception e) {
            System.out.println("Some exception occured!");
        }
    }
}

