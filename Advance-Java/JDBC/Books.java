package src.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---Fill the details---");
        System.out.print("Book Name: ");
        String bookName = in.nextLine();
        System.out.print("Edition: ");
        String edition = in.next();
        System.out.print("Author: ");
        String author = in.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "ram16095");
            PreparedStatement ps = con.prepareStatement("INSERT INTO bookDetails VALUES(?, ?, ?);");
            ps.setString(1, bookName);
            ps.setString(2, edition);
            ps.setString(3, author);
            int count = ps.executeUpdate();
            System.out.println("Book added sucessfully!");
        } catch(Exception e) {
            System.out.println("Some exception occured!");
        }

    }
}
