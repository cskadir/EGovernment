/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kadir
 */
public class DatabaseConnection {
    
    private static Connection con = null;
  
    static
    {
        String url = "jdbc:postgresql://localhost:5432/bitirme";
        String user = "postgres";
        String pass = "{";
        try {
            Class.forName("com.postgresql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}
