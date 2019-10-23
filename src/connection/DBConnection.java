/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
  
    String url ="jdbc:mysql://localhost:3306/studentinformation";
    String Password="";
    String username="root";
    Connection connect=null;
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection(url, username, Password);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Driver.class not loaded");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Failed");
        }
        return connect;
    }
    
}
