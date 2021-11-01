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
public class Note {
    private int Id;
    private String Content;
    private int Ticket_Id;
    private int Technicain_Id;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Note(int Id, String Content, int Ticket_Id, int Technicain_Id) {
        this.Id = Id;
        this.Content = Content;
        this.Ticket_Id = Ticket_Id;
        this.Technicain_Id = Technicain_Id;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public int getTicket_Id() {
        return Ticket_Id;
    }

    public void setTicket_Id(int Ticket_Id) {
        this.Ticket_Id = Ticket_Id;
    }

    public int getTechnicain_Id() {
        return Technicain_Id;
    }

    public void setTechnicain_Id(int Technicain_Id) {
        this.Technicain_Id = Technicain_Id;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Prints all data">
    @Override
    public String toString() {
        return Id + "," + Content + "," + Ticket_Id + "," + Technicain_Id;
    }
    //</editor-fold>
    
}
