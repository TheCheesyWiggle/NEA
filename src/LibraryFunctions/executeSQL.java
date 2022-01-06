
package LibraryFunctions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class executeSQL {
    public static ResultSet executeQuery(Connection con, String query) {
        //error handling
        try {
            //connects to the database
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //executes the query on the database
            ResultSet rs = stmt.executeQuery(query);
            //returns a result 
            return rs;
        }
        //outputs Error
        catch (Exception e) {
            System.out.println("Error in the ExecuteSQL class:" + e);
            return null;
        }
    }

    public static void executeUpdateQuery(Connection con, String query) {
        //error handling
        try {
            //connects to the database
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //executes the query on the database
            stmt.executeUpdate(query);

        }
        //outputs Error
        catch (Exception e) {
            System.out.println("Error in the ExecuteSQL class:" + e);
        }
    }
}
