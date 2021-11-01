/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryFunctions;

public interface iPrintable {
    //Gets the fields which are printable from the objects
    //Format of printable fields should be "Forename: Value, Surname: Value, ... "
    String getPrintableString();
}
