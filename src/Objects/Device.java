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
public class Device {
    
    private int ID;
    private String Model;
    private String Manufacturer;
    private String Priority;
    private int Customer_Id;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Device(int ID, String Model, String Manufacturer, String Priority, int Customer_Id) {
        this.ID = ID;
        this.Model = Model;
        this.Manufacturer = Manufacturer;
        this.Priority = Priority;
        this.Customer_Id = Customer_Id;

    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter & Setters">
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(int Customer_Id) {
        this.Customer_Id = Customer_Id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String Priority) {
        this.Priority = Priority;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Prints all data">
    @Override
    public String toString() {
        return ID+ "," + Model + "," + Manufacturer + "," + Priority + "," + Customer_Id ;
    }

    //</editor-fold>
}
