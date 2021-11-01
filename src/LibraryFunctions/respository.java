
package LibraryFunctions;

import Objects.*;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//This class gets things in and out of the database


public class respository {
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\NEA.accdb";
    private static Connection con;
    private static Technician currentUser;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
        return null;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Technician operations">
    public static Technician getCurrentUser(){
        return currentUser;
    }
    
    public static boolean technicianLogIn(String username, String password){
        try{
            String sql = "SELECT* FROM Technician where Username = " + username + "'";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            
            if(rs.next()){
                currentUser = new Technician (rs.getInt("Technician_ID"),rs.getString("FullName"),rs.getString("Username"), rs.getString("Password"), rs.getString("Email"), rs.getBoolean("Admin"));
                if (!helper.CompareHashed(currentUser.getPassword(), password)) {
                    return false;
                }
            }
            rs.close();
            con.close();  
        }
        catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
        return currentUser != null;
    } // no work
    
    public static ArrayList<Ticket> getTechniciansTickets(String UserID) {
        ArrayList<Ticket> TicketList = new ArrayList<>();
        try {

            String sql = "SELECT Ticket*\n"
                    + "FROM Ticket INNER JOIN Technician ON Ticket.TechnicainID = Technician.TechnicainID\n"
                    + "WHERE (((Technician.TechnicainID)='" + UserID + "'))";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            while (rs.next()) {
                Ticket nextTicket= new Ticket(rs.getInt("TicketID"),rs.getString("Issue"),rs.getString("RepairStatus"),rs.getDate("OpenDate").toLocalDate(),rs.getDate("CloseDate").toLocalDate(),rs.getInt("DeviceID"),rs.getInt("CustomerID"));
                TicketList.add(nextTicket);
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);

        }
        return TicketList;
    } // not sure if it works
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="SQL date conversion functions">
    private static String getSQLDateString(Date date) {
        //Be careful with dates in Access queries, they are not in standard SQL format (they often have extra #s and are the wrong way round). 
        //This converts the date into standard SQL format which will work with access when accesses from your java code
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
        return "'" + DATE_FORMAT.format(date) + "'";
    }

    private static String getSQLDateString(String date) {
        try {
            SimpleDateFormat UK_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
            return "'" + DATE_FORMAT.format(UK_DATE_FORMAT.parse(date)) + "'";
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
        return "";
    }
    // </editor-fold> //works
    
    // <editor-fold defaultstate="collapsed" desc="Find functions">  

    // <editor-fold defaultstate="collapsed" desc="Ticket functions">  
    
        // <editor-fold defaultstate="collapsed" desc="Find All Tickets">
        public static ArrayList<Ticket> findAllTickets() {
            ArrayList<Ticket> TicketList = new ArrayList<>();
            try {

                String sql = "SELECT * FROM Ticket";
                //connects to the databse 
                ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                //while there are more records in the database = true
                while (rs.next()) {
                    //tures data from database into a object
                    Ticket nextTicket = new Ticket(rs.getInt("TicketID"),rs.getString("Issue"),rs.getString("RepairStatus"),rs.getDate("OpenDate").toLocalDate(),rs.getDate("CloseDate").toLocalDate(),rs.getInt("DeviceID"),rs.getInt("CustomerID"));
                    //adds new object to the array list
                    TicketList.add(nextTicket);
                }

                con.close();
            } catch (Exception e) {
                System.out.println("Error in the repository class: " + e);

            }
            return TicketList;
        }
        // </editor-fold> //Works
        
        // <editor-fold defaultstate="collapsed" desc="Find Tickets with Customers First name">
        public static ArrayList<Ticket> findTicketsCustomerFirstName(String CustomerName) {
            ArrayList<Ticket> TicketList = new ArrayList<>();
            try {
                // select ticket where customer id of the ticket = customerid the customer from the custoemr wiht the same name
                String sql = "SELECT Ticket.*\n"
                    + "FROM Customer INNER JOIN Ticket ON Customer.CustomerID = Ticket.CustomerID\n"
                    + "WHERE (((Customer.FirstName)='" + CustomerName + "'))";
                //connects to the databse 
                ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                //while there are more records in the database = true
                while (rs.next()) {
                    //tures data from database into a object
                    Ticket nextTicket = new Ticket(rs.getInt("TicketID"),rs.getString("Issue"),rs.getString("RepairStatus"),rs.getDate("OpenDate").toLocalDate(),rs.getDate("CloseDate").toLocalDate(),rs.getInt("DeviceID"),rs.getInt("CustomerID"));
                    //adds new object to the array list
                    TicketList.add(nextTicket);
                }

                con.close();
            } catch (Exception e) {
                System.out.println("Error in the repository class: " + e);

            }
            return TicketList;
        }
        // </editor-fold> //Works
        
        // <editor-fold defaultstate="collapsed" desc="Find Tickets with Customer ID">
        public static ArrayList<Ticket> findTicketsCustomerID(int CustomerID) {
            ArrayList<Ticket> TicketList = new ArrayList<>();
            try {
                // select ticket where customer id of the ticket = customerid the customer from the custoemr wiht the same name
                String sql = "SELECT Ticket.*\n"
                    + "FROM Customer INNER JOIN Ticket ON Customer.CustomerID = Ticket.CustomerID\n"
                    + "WHERE (((Customer.CustomerID)='" + CustomerID + "'))";
                //connects to the databse 
                ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                //while there are more records in the database = true
                while (rs.next()) {
                    //tures data from database into a object
                    Ticket nextTicket = new Ticket(rs.getInt("TicketID"),rs.getString("Issue"),rs.getString("RepairStatus"),rs.getDate("OpenDate").toLocalDate(),rs.getDate("CloseDate").toLocalDate(),rs.getInt("DeviceID"),rs.getInt("CustomerID"));
                    //adds new object to the array list
                    TicketList.add(nextTicket);
                }

                con.close();
            } catch (Exception e) {
                System.out.println("Error in the repository class: " + e);

            }
            return TicketList;
        }
        // </editor-fold> //Works
        
        // <editor-fold defaultstate="collapsed" desc="Find Tickets with the Device model">
        public static ArrayList<Ticket> findTicketsModel(String deviceModel) {
            ArrayList<Ticket> TicketList = new ArrayList<>();
            try {
                // select ticket where customer id of the ticket = customerid the customer from the custoemr wiht the same name
                String sql = "SELECT Ticket.*\n"
                    + "FROM Device INNER JOIN Ticket ON Device.DeviceID = Ticket.DeviceID\n"
                    + "WHERE (((Device.Model)='" + deviceModel + "'))";
                //connects to the databse 
                ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                //while there are more records in the database = true
                while (rs.next()) {
                    //tures data from database into a object
                    Ticket nextTicket = new Ticket(rs.getInt("TicketID"),rs.getString("Issue"),rs.getString("RepairStatus"),rs.getDate("OpenDate").toLocalDate(),rs.getDate("CloseDate").toLocalDate(),rs.getInt("DeviceID"),rs.getInt("CustomerID"));
                    //adds new object to the array list
                    TicketList.add(nextTicket);
                }

                con.close();
            } catch (Exception e) {
                System.out.println("Error in the repository class: " + e);

            }
            return TicketList;
        }
        // </editor-fold> //Works
        
        // <editor-fold defaultstate="collapsed" desc="Find Tickets with the Date the ticket was created">
        public static ArrayList<Ticket> findTicketsOpenDate(String Date) {
             
            ArrayList<Ticket> TicketList = new ArrayList<>();
            try {
                // select ticket where customer id of the ticket = customerid the customer from the custoemr wiht the same name
                String sql = "SELECT Ticket.* FROM Ticket WHERE OpenDate = " + getSQLDateString(Date);
                //connects to the databse 
                ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                //while there are more records in the database = true
                while (rs.next()) {
                    //tures data from database into a object
                    Ticket nextTicket = new Ticket(rs.getInt("TicketID"),rs.getString("Issue"),rs.getString("RepairStatus"),rs.getDate("OpenDate").toLocalDate(),rs.getDate("CloseDate").toLocalDate(),rs.getInt("DeviceID"),rs.getInt("CustomerID"));
                    //adds new object to the array list
                    TicketList.add(nextTicket);
                }

                con.close();
            } catch (Exception e) {
                System.out.println("Error in the repository class: " + e);

            }
            return TicketList;
        }
        // </editor-fold> //Works
        
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Customer functions">    
        
        // <editor-fold defaultstate="collapsed" desc="Find All Customers">
        public static ArrayList<Customer> findAllCustomers(){
            ArrayList<Customer> CustomerList = new ArrayList<>();
                try {

                    String sql = "SELECT * FROM Customer";
                    //connects to the databse 
                    ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                    //while there are more records in the database = true
                    while (rs.next()) {
                        //tures data from database into a object
                        Customer nextCustomer = new Customer(rs.getInt("CustomerID"),rs.getString("FirstName"),rs.getString("LastName"),rs.getString("Email"),rs.getString("PhoneNumber"),rs.getString("Address"),rs.getString("Postcode"));
                        //adds new object to the array list
                        CustomerList.add(nextCustomer);
                    }

                    con.close();
                } catch (Exception e) {
                    System.out.println("Error in the repository class: " + e);

                }
                return CustomerList;
        } 
        // </editor-fold> //Works

        // <editor-fold defaultstate="collapsed" desc="Find Customer with Ticket ID">
        public static ArrayList<Customer> findCustomerTickets(int TicketID) {
            ArrayList<Customer> CustomerList = new ArrayList<>();
            try {
                // select ticket where customer id of the ticket = customer id the customer from the customer with the same name thats passed through the
                String sql = "SELECT Customer.* \n"
                    + "FROM Ticket INNER JOIN Customer ON Customer.CustomerID = Ticket.CustomerID \n"
                    + "WHERE ((Ticket.TicketID)='" + TicketID + "')";
                //connects to the databse 
                ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                //while there are more records in the database = true
                while (rs.next()) {
                    //turns data from database into a object
                    Customer nextCustomer = new Customer(rs.getInt("CustomerID"),rs.getString("FirstName"),rs.getString("LastName"),rs.getString("Email"),rs.getString("PhoneNumber"),rs.getString("Address"),rs.getString("Postcode"));
                    //adds new object to the array list
                    CustomerList.add(nextCustomer);
                }

                con.close();
            } catch (Exception e) {
                System.out.println("Error in the repository class: " + e);

            }
            return CustomerList;
        }
        //</editor-fold> // Works
        
        // <editor-fold defaultstate="collapsed" desc="Find Customer with First Name">
        public static ArrayList<Customer> findCustomersFirstName(String CustomerName){
            ArrayList<Customer> CustomerList = new ArrayList<>();
                try {

                    String sql = "SELECT * FROM Customer "
                            + "WHERE (((Customer.FirstName)='" + CustomerName + "'))";
                    //connects to the databse 
                    ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
                    //while there are more records in the database = true
                    while (rs.next()) {
                        //tures data from database into a object
                        Customer nextCustomer = new Customer(rs.getInt("CustomerID"),rs.getString("FirstName"),rs.getString("LastName"),rs.getString("Email"),rs.getString("PhoneNumber"),rs.getString("Address"),rs.getString("Postcode"));
                        //adds new object to the array list
                        CustomerList.add(nextCustomer);
                    }

                    con.close();
                } catch (Exception e) {
                    System.out.println("Error in the repository class: " + e);

                }
                return CustomerList;
        } 
        //</editor-fold> // Works
        
        // <editor-fold defaultstate="collapsed" desc="Find Customer with Device model">
        //</editor-fold> // Doesn't Work
        
        // <editor-fold defaultstate="collapsed" desc="Find Customer with ??">
        //</editor-fold> // Doesn't Work
    // </editor-fold>
        
        
        public static void findTechnicain(){
        
        }

        public static void findDevice(){

        }

        public static void findTicket(){

        }

        public static void findNotes(){

        }
        // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Update functions">  
    public static void editCustomer(){
        
    }
    public static void editTechnicain(){
        
    }
    public static void editTicket(){
        
    }
    public static void editDevice(){
        
    }
    public static void editNotes(){
        
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Add functions">  
    public static void AddCustomer(Customer newCustomer){
        try {
            String sql = "SELECT Customer.* FROM Customer";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                //Primary key not needed as it is an autonumber, it adds that field automatically
                rs.updateString("FirstName", newCustomer.getFirst_Name());
                rs.updateString("LastName", newCustomer.getLast_Name());
                rs.updateString("Email", newCustomer.getEmail());
                rs.updateString("PhoneNumber", newCustomer.getPhone_Number());
                rs.updateString("Address", newCustomer.getAddress());
                rs.updateString("Postcode", newCustomer.getPostcode());

                rs.insertRow();
            }
            System.out.println("Successful save!");
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }
    public static void AddDevice(Device newDevice){
        try {
            String sql = "SELECT Device.* FROM Device";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                //Primary key not needed as it is an autonumber, it adds that field automatically
                rs.updateInt("Customer_ID", newDevice.getCustomer_Id());
                rs.updateString("Model", newDevice.getModel());
                rs.updateString("Manfacturer", newDevice.getManufacturer());
                rs.updateString("Priority", newDevice.getPriority());

                rs.insertRow();
            }
            System.out.println("Successful save!");
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }

    public static void AddTicket(Ticket newTicket){
                try {
            String sql = "SELECT Ticket.* FROM Ticket";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                //Primary key not needed as it is an autonumber, it adds that field automatically
                rs.updateString("Issue", newTicket.getIssue() );
                //rs.updateDate("Date", newTicket.getOpen_Date());
                //rs.updateInt("Device_ID", newTicket);
                //rs.updateInt("Customer_ID", newTicket);

                rs.insertRow();
            }
            System.out.println("Successful save!");
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }
    
    public static void AddNotes(Note newNote){
        try {
            String sql = "SELECT Note.* FROM Note";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                //Primary key not needed as it is an autonumber, it adds that field automatically
                rs.updateString("Content", newNote.getContent() );
                rs.updateInt("Ticket_ID", newNote.getTicket_Id());
                rs.updateInt("Technican_ID", newNote.getTechnicain_Id());

                rs.insertRow();
            }
            System.out.println("Successful save!");
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }
    //Admin function
    public static void AddTechnician(Technician newTechnician){
        try {
            String sql = "SELECT Technician.* FROM Technician";
            ResultSet rs = executeSQL.executeQuery(getConnection(), sql);
            if (rs.next()) {
                rs.moveToInsertRow();
                //Primary key not needed as it is an autonumber, it adds that field automatically
                rs.updateString("Fullname", newTechnician.getName());
                rs.updateString("Username", newTechnician.getUsername());
                rs.updateString("Password", newTechnician.getPassword());
                rs.updateString("Email", newTechnician.getCompany_Email());
                rs.updateBoolean("Admin", newTechnician.isAdmin());

                rs.insertRow();
            }
            System.out.println("Successful save!");
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }
    // </editor-fold>
    
    public static boolean emailValdation(String email){
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        boolean valid = matcher.matches();
        return valid;
    }
    
    /*
    Tick List
    ----------------------------------------------------------------------------
    find customer
        - all       x
        - name       
        - device ID   
        - ticket    x

    find device
        - all
        - manufacturer
        - customer
        - model
        - ticket

    find ticket   (Should be done maybe have a check over)
        - all                     x
        - customer                x
        - customer first name     x
        - model                   x
        - date                    x 
        - device ID 

    add technican
    add device     X
    add customer   X
    write notes
    open tickets

    overwrite technican
    overwrite device
    overwrite customer
    overwrite tickets

    check through all the comments so they make sense
    
    */
}