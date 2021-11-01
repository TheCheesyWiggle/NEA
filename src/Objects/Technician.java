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
public class Technician {
    
    private int Id;
    private String Name;
    private String Username;
    private String Password;
    private String Company_Email;
    private boolean Admin;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Technician(int Id, String Name, String Username, String Password, String Company_Email, boolean Admin) {
        this.Id = Id;
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
        this.Company_Email = Company_Email;
        this.Admin = Admin;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCompany_Email() {
        return Company_Email;
    }

    public void setCompany_Email(String Company_Email) {
        this.Company_Email = Company_Email;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Prints all data">
    @Override
    public String toString() {
        return "Technician{" + "Id=" + Id + ", Name=" + Name + ", Username=" + Username + ", Password=" + Password + ", Company_Email=" + Company_Email + ", Admin=" + Admin + '}';
    }
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Prints all non-sensitive data">
    public String printableString() {
        return "Technician Id: " + Id + ", Technician Name: " + Name + ", Technician Company Email: " + Company_Email + ", Admin: " + Admin;
    }
    //</editor-fold>
}
