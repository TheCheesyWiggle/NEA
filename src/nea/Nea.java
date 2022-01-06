/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nea;

import GUI.Login;
import static LibraryFunctions.respository.findAllCustomers;
import static LibraryFunctions.respository.mergeSort;
import Objects.Customer;
import java.util.ArrayList;

/**
 *
 * @author Finn
 */
public class Nea {


    public static void main(String[] args) {
        ArrayList<Customer> CustomerList = new ArrayList<>();
        CustomerList = findAllCustomers();
        for(int i =0; i<CustomerList.size();i++){
            System.out.println(CustomerList.get(i).getFirst_Name());
        }
        System.out.println();    
        CustomerList = mergeSort(CustomerList);
        
        for(int j =0; j<CustomerList.size();j++){
            System.out.println(CustomerList.get(j).getFirst_Name());
        }
        
        //runs the login window
        Login login = new Login();
        login.setVisible(true);
        

    }
    
}
