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
        
        
        
        //ticket = LibraryFunctions.respository.findTicketsOpenDate("10/07/2021");
        
        
        
        Customers = LibraryFunctions.respository.findCustomersFirstName("Finn") ;
        
        
        //for (int i = 0; i < ticket.size(); i++) {
        //    System.out.print(ticket.get(i).getID() + "|");
        //    System.out.println(ticket.get(i).toString());
        //}
        
        for(int i =0; i<Customers.size();i++){
            System.out.print(Customers.get(i).getID()+"|");
            System.out.println(Customers.get(i).toString());
        }
        
        //get all attributes in a arraylist
        //then search the arraylist and grab the relevant ID
        //search with these IDs in SQL

    }
    
}
