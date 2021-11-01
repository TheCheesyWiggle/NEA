/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

import java.util.ArrayList;

/**
 *
 * @author fv200399
 */
public class printer {
    
    static ArrayList<iPrintable> objectsToPrint = new ArrayList<>();
    
    public static void addObjectsToList(iPrintable item){
        objectsToPrint.add(item);
    }

    //get iPrintable objects and print them all out
    public static void printObjects() {
        for (int i = 0; i < objectsToPrint.size(); i++) {
            System.out.println(objectsToPrint.get(i).getPrintableString());
        }
    }
}
