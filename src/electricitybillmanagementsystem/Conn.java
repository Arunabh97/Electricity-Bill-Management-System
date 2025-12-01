package electricitybillmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            String url = "jdbc:mysql://localhost:3306/ebs";
            String username = "root";
            String password = "Attitude123@";

            c = DriverManager.getConnection(url, username, password);
            s = c.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

 
