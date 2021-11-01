/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

import java.security.MessageDigest;

/**
 *
 * @author fv200399
 */
public class helper {
    public static String hashPassword(String password) {
        //This should hash the password (Use a message digest = https://www.tutorialspoint.com/java_cryptography/java_cryptography_message_digest.htm)
        try{
            //Creating the MessageDigest object  
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            //Passing data to the created MessageDigest Object
            md.update(password.getBytes());

            //Compute the message digest
            byte[] digest = md.digest();      
            System.out.println(digest);  

            //Converting the byte array in to HexString format
            StringBuffer hexString = new StringBuffer();

            for (int i = 0;i<digest.length;i++) {
                hexString.append(Integer.toHexString(0xFF & digest[i]));
            }
            password =  hexString.toString();  

            return password;
        }
        catch(Exception e){
            System.out.println("ERROR: "+e);
        }
        return "";
    }

    public static boolean CompareHashed(String databasePassword, String userEnteredPassword) {
        return hashPassword(userEnteredPassword).equals(databasePassword);
    }
}
