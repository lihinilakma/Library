/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author R.M.A
 */
public class DBConn {
  
    
    static Connection con;
    
    public static Connection getConnection()
    {
        try
        {
            String host = "jdbc:mysql://localhost:3306/studentreg";
            String usn ="root";
            String pwd ="";
            
            con = DriverManager.getConnection(host,usn,pwd);
             
        }
        catch(SQLException ex)
        {
            System.out.println(""+ex);
        }
        return con;
        }
        
    
}
