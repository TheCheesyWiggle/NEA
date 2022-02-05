/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

import Objects.Customer;
import java.util.ArrayList;


public class BinarySearch {
    public static Customer Customer(ArrayList<Customer> CustomerList,int CustID){
        //sets upper and lower bounds
        int start = 0;
        int end = CustomerList.size();
        //finds mid point of the list
        int mid = CustomerList.size()/2;
        //loops until the end pointer is less than the start
        while(start<=end){
            //checks if the middle customer has and id bigger or smaller than the target id
            if(CustomerList.get(mid).getID()<CustID){
                //readjusts the start pointer
                start = mid +1;
            }
            else if(CustomerList.get(mid).getID()==CustID){
                //returns the target object
                return CustomerList.get(mid);
            }
            else{
                //adjusts the end pointer
                end = mid -1;    
            }
            //adjusts the middle pointer
            mid = start+end/2;
        }
    return null;
    }
    
}
