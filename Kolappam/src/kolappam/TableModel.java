/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolappam;

/**
 *
 * @author thivagar
 */
public class TableModel {
    private int id;
    private String name;
    private String doorNo;
    private String street;
    private String area;
    private String city;
    private String address;
    private long contactNumber;

    public TableModel() {
    }

    public TableModel(int id, String name, String doorNo, String street, String area, String city, String address, long contactNumber) {
        this.id = id;
        this.name = name;
        this.doorNo = doorNo;
        this.street = street;
        this.area = area;
        this.city = city;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        StringBuilder sb = new StringBuilder();
        sb.append(doorNo);
        sb.append(",");
        sb.append(street);
        sb.append(",\n");
        sb.append(area);
        sb.append(",\n");
        sb.append(city);
        this.address = sb.toString();
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
