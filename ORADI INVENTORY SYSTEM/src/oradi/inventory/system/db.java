/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oradi.inventory.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author olive
 */
public class db {
    public static Connection mycon() throws SQLException{
      Connection con=null;
      
      try{
          
          Class.forName("com.msql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/store","root","");
          return con;
          
      }catch (ClassNotFoundException | SQLException e){
          System.out.println(e);
          return null;
          
      }
      
    }
}
