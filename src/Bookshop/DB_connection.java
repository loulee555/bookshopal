/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DB_connection {
   static Connection con = null;
     public static Connection Connect()
    {
        try {
            String url = "jdbc:mysql://localhost/bookshop?useSSL=true";
            String user = "root";
            String password = "#vanlakhan0105#ISXM";
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the mysql driver
            con = (Connection) DriverManager.getConnection(url,user,password);  
            System.out.println("connection have been succesful");
            //<span class="crayon-h"> </span><span class="crayon-c">//Connection Path where your database is located.</span>   
            
        }catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
        return con;
    }
}
