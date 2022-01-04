/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.time.LocalDate;

/**
 *
 * @author Finn
 */
public class Ticket {

    private int ID;
    private String Issue;
    private String Repair_Status;
    private LocalDate Open_Date;
    private LocalDate Close_Date;
    private int Device_Id;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Ticket(int Ticket_Id, String Ticket_Issue, String Repair_Status, LocalDate Open_Date, LocalDate Close_Date, int Device_Id) {
        this.ID = Ticket_Id;
        this.Issue = Ticket_Issue;
        this.Repair_Status = Repair_Status;
        this.Open_Date = Open_Date;
        this.Close_Date = Close_Date;
        this.Device_Id = Device_Id;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public int getID() {
        return ID;
    }

    public void setID(int Ticket_Id) {
        this.ID = ID;
    }

    public String getIssue() {
        return Issue;
    }

    public void setIssue(String Issue) {
        this.Issue = Issue;
    }

    public String getRepair_Status() {
        return Repair_Status;
    }

    public void setRepair_Status(String Repair_Status) {
        this.Repair_Status = Repair_Status;
    }

    public LocalDate getOpen_Date() {
        return Open_Date;
    }

    public void setOpen_Date(LocalDate Open_Date) {
        this.Open_Date = Open_Date;
    }

    public LocalDate getClose_Date() {
        return Close_Date;
    }

    public void setClose_Date(LocalDate Close_Date) {
        this.Close_Date = Close_Date;
    }

    public int getDevice_Id() {
        return Device_Id;
    }

    public void setDevice_Id(int Device_Id) {
        this.Device_Id = Device_Id;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Prints all data">
    @Override
    public String toString() {
        return ID + "," + Issue + "," + Repair_Status + "," + Open_Date + "," + Close_Date + "," + Device_Id;
    }
    //</editor-fold>
}
