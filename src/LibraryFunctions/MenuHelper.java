/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

import Objects.Ticket;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author fv200399
 */
public class MenuHelper {
    
    
    public static DefaultListModel openTickets() {
        //grabs all tickets
        ArrayList<Ticket> Tickets = LibraryFunctions.respository.findAllTickets();  
        //sorts the array list by priority
        Tickets = MergeSortTickets(Tickets);
        //creates a list model to edit later
        DefaultListModel listModel = new DefaultListModel();
        //loops through the ticket arraylist and adds the objects to the list models
        for(Ticket ticket : Tickets){
            if(ticket.getClose_Date() == null){
                System.out.println(ticket.toString());
                listModel.addElement(ticket);
            }
        }
        //returns list
        return listModel;
        
    }
    public static ArrayList<Ticket> MergeSortTickets(ArrayList<Ticket> Tickets){
        return Tickets;
    }
    
    public static DefaultListModel recentlyClosedTickets() {
        ArrayList<Ticket> Tickets = LibraryFunctions.respository.findAllTickets();  
        //creates a list model to edit later
        DefaultListModel listModel = new DefaultListModel();
        //loops through the ticket arraylist and adds the objects to the list models
        for(Ticket ticket : Tickets){
            if(ticket.getClose_Date()!= null){
                System.out.println(ticket.toString());
                listModel.addElement(ticket);
            }
        }
        //returns list
        return listModel;
        
    }

    

}
