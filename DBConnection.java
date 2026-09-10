package jframe;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {

    static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:orcl",
                "msc",
                "msc"
            );

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(
                null,
                "Database Error: " + e.getMessage()
            );
        }
        return con;
    }
}