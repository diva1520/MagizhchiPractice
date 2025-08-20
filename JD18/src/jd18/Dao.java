/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thivagar
 */
public class Dao {
    
    
    public boolean checkUser(Model data) throws ClassNotFoundException, SQLException{
    Class.forName("org.postgresql.Driver");
    String user = "postgres";
    String pass = "happy";
    String url = "jdbc:postgresql://localhost:5432/login";
    
    Connection con = DriverManager.getConnection(url,user,pass);
    
        PreparedStatement psm = con.prepareStatement("select * from userdetail where name = ? and password =?");
        psm.setString(1, data.getUname());
        psm.setString(2, data.getPassword());
        ResultSet rs = psm.executeQuery();
        return rs.next();
    }
    
}
