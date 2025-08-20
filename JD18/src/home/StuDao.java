/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuDao {
    
    
    public ArrayList<StPojo> selectAll() throws ClassNotFoundException, SQLException{
    ArrayList<StPojo> lst = new ArrayList<>();
    
    
    Class.forName("org.postgresql.Driver");
    String user = "postgres";
    String pass = "happy";
    String url = "jdbc:postgresql://localhost:5432/login";
    
    Connection con = DriverManager.getConnection(url,user,pass);
    
        PreparedStatement psm = con.prepareStatement("select name,area,phno from student");
      
       ResultSet rs = psm.executeQuery();
       
       while(rs.next()){
       StPojo data = new StPojo();
       data.setName(rs.getString(1));
       data.setArea(rs.getString(2));
       data.setPhNo(rs.getInt(3));
       
       lst.add(data);
       }
       
       return lst;
    }
}
