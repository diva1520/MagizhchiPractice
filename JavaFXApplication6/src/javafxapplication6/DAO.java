/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thivagar
 */
public class DAO {

    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/login", "postgres", "happy");

    }

    public boolean user(Model data) throws ClassNotFoundException, SQLException {
        Connection con = connect();

        PreparedStatement psm = con.prepareStatement(""
                + "select name,password from userd where name = ? and password = ?");
        psm.setString(1, data.getName());
        psm.setString(2, data.getPass());

        ResultSet rs = psm.executeQuery();

        return rs.next();

    }
    
    public List<Model> getUsers() throws ClassNotFoundException, SQLException{
      Connection con = connect();

        PreparedStatement psm = con.prepareStatement(""
                + "select name,password from userd");
     
        ResultSet rs = psm.executeQuery();
        List<Model> lst = new ArrayList<>();
        while(rs.next()){
        Model mo = new Model();
        
        mo.setName(rs.getString(1));
        mo.setPass(rs.getString(2));
        lst.add(mo);
        }
        return  lst;
    }
}
