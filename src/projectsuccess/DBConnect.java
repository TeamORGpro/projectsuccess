/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author pc
 */
public class DBConnect {
   
    
    public static Connection connect(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/successdb","root","");
            return conn;
            
        }
        catch(ClassNotFoundException | SQLException e)
                {
            System.out.println(e);
        }
        return null;
    
    }   
    
}
    
    
