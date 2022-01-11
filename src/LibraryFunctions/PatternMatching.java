/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Finn
 */
public class PatternMatching {
     // <editor-fold defaultstate="collapsed" desc="Pattern Matching">
    public static boolean emailValdation(String email){
        //email string pass through 
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");//creates the pattern to compare against
        Matcher matcher = pattern.matcher(email);//checks if the string follows the pattern
        boolean valid = matcher.matches();//creates a boolean value to check if the sring matches the pattern
        return valid;//returns true or false
    }
    
    public static boolean phoneNumberValdation(String phoneNumber){
        if( phoneNumber.length() == 11){
            //email string pass through 
            Pattern pattern = Pattern.compile("^[0-9]$");//creates the pattern to compare against
            Matcher matcher = pattern.matcher(phoneNumber);//checks if the string follows the pattern
            boolean valid = matcher.matches();//creates a boolean value to check if the sring matches the pattern
            return valid;//returns true or false
        }
        else{
            return false;
        }
    }
    //</editor-fold>
}
