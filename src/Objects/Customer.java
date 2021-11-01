/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Finn
 */
public class Customer {
    private int ID;
    private String First_Name;
    private String Last_Name;
    private String Phone_Number;
    private String Email;
    private String Address;
    private String Postcode;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Customer(int ID, String First_Name, String Last_Name, String Email, String Phone_Number, String Address, String Postcode) {
        this.ID = ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Email = Email;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
        this.Postcode = Postcode;
    }//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter & Setters">
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Prints all data">
    @Override
    public String toString() {
        return ID + "," + First_Name + "," + Last_Name + "," + Email + "," +Phone_Number + "," + Address + "," + Postcode;
    }
    //</editor-fold>
}
