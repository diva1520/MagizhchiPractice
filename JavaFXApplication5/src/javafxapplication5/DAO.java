/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

public class DAO {

    Model mo = new Model();

    String name = "ram";
    String pass = "ram@1234";

    public Model user() {

        mo.setName(name);
        mo.setPasswoord(pass);

        return mo;
    }

}
