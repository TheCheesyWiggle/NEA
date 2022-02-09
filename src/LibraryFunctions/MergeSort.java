 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

import Objects.Customer;
import Objects.Ticket;
import java.util.ArrayList;

/**
 *
 * @author Finn
 */
public class MergeSort {
    
    // <editor-fold defaultstate="collapsed" desc="Customer Merge Sort">
    public static ArrayList<Customer> mergeSortCustomers(ArrayList<Customer> CustomerList){
        //initializes left and right arraylists
        ArrayList<Customer> left = new ArrayList<>();
        ArrayList<Customer> right = new ArrayList<>();
        //creates a middle integer so you dont get a double
        int middle = CustomerList.size()/2;
        //check wether list has more than 2 objects
        if (CustomerList.size() >= 2) {
            //adds objest to the left list
            for(int i=0;i<middle;i++){
                //adds object to the left list
                left.add(CustomerList.get(i));
            }
            //adds objest to the right list
            for(int i = middle;i<CustomerList.size();i++){
                //adds object to the left list
                right.add(CustomerList.get(i));
            }
        }
        else{
            //returns arraylist when there is only on object
            return CustomerList;
        }
        //recurses through the list
        mergeSortCustomers(left);
        mergeSortCustomers(right);
        //merges the all the lists and returns a sorted list
        return mergeCustomers(left,right);
    }
    public static ArrayList<Customer> mergeCustomers(ArrayList<Customer> left, ArrayList<Customer> right){
        //initialize empty list
        ArrayList<Customer> mergedList = new ArrayList<>();
        //sets up pointers for the lists
        int IndexL = 0;
        int IndexR = 0;
        int IndexM = 0;
        
        //checks whether the pointers are at the end of the list
        while((IndexL < left.size())||(IndexR < right.size())){
            //checks wether both arraylists are at the end of the list
            if((IndexL < left.size())&&(IndexR < right.size())){
                //checks which name is alphabetically first
                if(left.get(IndexL).getID()>(right.get(IndexR).getID())){
                    //adds the right lists value
                    mergedList.add(right.get(IndexR));
                    //adds 1 to both the right and merged index pointers
                    IndexR++;
                    IndexM++;
                }
                else{
                    //adds the left lists value
                    mergedList.add(left.get(IndexL));
                    //adds 1 to both the left and merged index pointers
                    IndexL++;
                    IndexM++;
                }
            }
            //checks whether the pointers are at the end of the left list
            else if(IndexL < left.size()){
                //adds the left lists value
                mergedList.add(left.get(IndexL));
                //adds 1 to both the left and merged index pointers
                IndexL++;
                IndexM++;
            }
            //checks whether the pointers are at the end of the rightlist
            else if(IndexR < right.size()){
                //adds the right lists value
                mergedList.add(right.get(IndexR));
                //adds 1 to both the right and merged index pointers
                IndexR++;
                IndexM++;  
            }
        }
        //returns sorted list
        return mergedList;
    }   
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Ticket Merge Sort">
    public static ArrayList<Ticket> mergeSortTickets(ArrayList<Ticket> TicketList){
        //initializes left and right arraylists
        ArrayList<Ticket> left = new ArrayList<>();
        ArrayList<Ticket> right = new ArrayList<>();
        //creates a middle integer so you dont get a double
        int middle = TicketList.size()/2;
        //check wether list has more than 2 objects
        if (TicketList.size() >= 2) {
            //adds objest to the left list
            for(int i=0;i<middle;i++){
                //adds object to the left list
                left.add(TicketList.get(i));
            }
            //adds objest to the right list
            for(int j = middle;j<TicketList.size();j++){
                //adds object to the left list
                right.add(TicketList.get(j));
            }
        }
        else{
            //returns arraylist when there is only on object
            return TicketList;
        }
        //recurses through the left and right lists
        mergeSortTickets(left);
        mergeSortTickets(right);
        //merges the all the lists and returns a sorted list
        return mergeTickets(left,right);
    }
    
    public static ArrayList<Ticket> mergeTickets(ArrayList<Ticket> left, ArrayList<Ticket> right){
        //initialize empty list
        ArrayList<Ticket> mergedList = new ArrayList<>();
        //sets up pointers for the lists
        int IndexL = 0;
        int IndexR = 0;
        int IndexM = 0;
        
        //checks whether the pointers are at the end of the list
        while((IndexL < left.size())||(IndexR < right.size())){
            //checks whether both arraylists are at the end of the list
            if((IndexL < left.size())&&(IndexR < right.size())){
                //checks which ticket has higher priority
                if(left.get(IndexL).getPriority()<= right.get(IndexR).getPriority()){
                    //adds the right lists value
                    mergedList.add(right.get(IndexR));
                    //adds 1 to both the right and merged index pointers
                    IndexR++;
                    IndexM++;
                }
                else{
                    //adds the left lists value
                    mergedList.add(left.get(IndexL));
                    //adds 1 to both the left and merged index pointers
                    IndexL++;
                    IndexM++;
                }
            }
            //checks whether the pointers are at the end of the left list
            else if(IndexL < left.size()){
                //adds the left lists value
                mergedList.add(left.get(IndexL));
                //adds 1 to both the left and merged index pointers
                IndexL++;
                IndexM++;
            }
            //checks whether the pointers are at the end of the rightlist
            else if(IndexR < right.size()){
                //adds the right lists value
                mergedList.add(right.get(IndexR));
                //adds 1 to both the right and merged index pointers
                IndexR++;
                IndexM++;  
            }
        }
        //returns sorted list
        return mergedList;
    }   
    //</editor-fold>
}
