/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd18;

/**
 *
 * @author thivagar
 */
public class Model {
    private String uname;
    private String password;

    public Model(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public Model() {
    }

    
    
    
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
