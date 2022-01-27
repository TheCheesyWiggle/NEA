/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;


import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Finn
 */
public class Hashing {
        public static String Hash(String password){
        //initailizes 
        String result = "";
        //try catch handles any errors which occur
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");//grabs the SHA256 hashing algorithm
            byte[] hash = digest.digest(password.getBytes("UTF-8"));//converts string to bytes using UTF-8 encoding
            return DatatypeConverter.printHexBinary(hash); //returns as string 
        }catch(Exception ex) {
            ex.printStackTrace();//prints error
        }
        return password;
    }
        
    public static boolean CompareHashed(String databasePassword, String userEnteredPassword) {
        return Hash(userEnteredPassword).equals(databasePassword);
    }
}
