/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nea;

import GUI.Login;
import LibraryFunctions.*;
import Objects.*;
import java.util.ArrayList;
/**
 *
 * @author Finn
 */
public class Nea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //runs the login window
        Login login = new Login();
        login.setVisible(true);
        
        //creates arraylists for testing
        ArrayList<Customer> Customers = new ArrayList<Customer>();   
        ArrayList<Ticket> ticket = new ArrayList<Ticket>();
        ArrayList<Device> device = new ArrayList<Device>();
        ArrayList<Note> note = new ArrayList<>();
        
        //ticket = LibraryFunctions.respository.findTicketsOpenDate("10/07/2021");
        //Customers = LibraryFunctions.respository.findCustomersDevcieID(1) ;
        note = LibraryFunctions.respository.findNotesID(1);
        
        //for (int i = 0; i < ticket.size(); i++) {
        //    System.out.println(ticket.get(i).toString());
        //}
        
        for(int i =0; i<note.size();i++){
            System.out.println(note.get(i).toString());
        }
        
        //get all attributes in a arraylist
        //then search the arraylist and grab the relevant ID
        //search with these IDs in SQL

    }
    
}
