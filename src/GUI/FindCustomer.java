/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import LibraryFunctions.respository;
import Objects.Customer;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import LibraryFunctions.MergeSort;
import LibraryFunctions.BinarySearch;

/**
 *
 * @author fv200399
 */
public class FindCustomer extends javax.swing.JFrame {

    //public static Customer SelectedCustomer;
    //private ArrayList<Customer> Customers = new ArrayList<Customer>(); 
    
    public FindCustomer() {
        initComponents();
        TechnicianNameLabel.setText(respository.getCurrentUser().getName());
        ErrorMessage.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchCondition = new javax.swing.JComboBox<>();
        SearchBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TechnicianNameLabel = new javax.swing.JLabel();
        MainMenuBtn = new javax.swing.JToggleButton();
        EditCustomerBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();
        Results = new javax.swing.JScrollPane();
        ResultsList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "DeviceID", "TicketID" }));
        SearchCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchConditionActionPerformed(evt);
            }
        });

        jLabel1.setText("Techincian:");

        TechnicianNameLabel.setText("Technician Name");

        MainMenuBtn.setText("Return to Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        EditCustomerBtn.setText("Edit customer");
        EditCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCustomerBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search For Customer");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ErrorMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        ErrorMessage.setText("Error Parameter invalid");

        ResultsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultsListMouseClicked(evt);
            }
        });
        Results.setViewportView(ResultsList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TechnicianNameLabel)
                        .addGap(0, 424, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EditCustomerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBtn)
                        .addGap(118, 118, 118)
                        .addComponent(MainMenuBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Results, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TechnicianNameLabel))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Results, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenuBtn)
                    .addComponent(EditCustomerBtn)
                    .addComponent(SearchBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchConditionActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void EditCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCustomerBtnActionPerformed

        System.out.println(ResultsList.getSelectedValuesList());
        EditCustomer editcust = new EditCustomer();
        editcust.setVisible(true);
        this.dispose();
        //SelectedCustomer = Customers.get(ResultsList.getSelectedIndex());
    }//GEN-LAST:event_EditCustomerBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        try{
            if(!(SearchBar.getText().equals(""))){       
                ArrayList<Customer> Customers = new ArrayList<Customer>(); 
                //sorts arraylist alphabetically
                Customers = MergeSort.mergeSortCustomers(Customers);
                //creates a list model to edit later
                DefaultListModel listModel = new DefaultListModel();
                //switch statement to check the serch condition
                switch(SearchCondition.getSelectedIndex()){
                    case 0:
                        //Retrieves customerID from the search bar
                        int CustomerID = Integer.parseInt(SearchBar.getText());
                        //completes a mergesort on all the customers in the database
                        Customers = MergeSort.mergeSortCustomers(respository.findAllCustomers()); 
                        //performs binary search on the sorted list
                        Customer cust = BinarySearch.Customer(Customers, CustomerID);
                        System.out.println(cust.toString());
                        //adds customer to the list model
                        listModel.addElement(cust);
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 1:
                        //Retrieves customers name from the search bar
                        String CustomerName = SearchBar.getText();
                        //Fills the arraylist wih relevant customer objects
                        Customers = LibraryFunctions.respository.findCustomersFirstName(CustomerName); 
                        //loops through the customers arraylist and adds the objects to the list models
                        for(Customer customer : Customers){
                            listModel.addElement(customer);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 2:
                        //Retrieves DeviceID from the search bar
                        int DeviceID = Integer.parseInt(SearchBar.getText());
                        //Fills the arraylist wih relevant customer objects
                        Customers = LibraryFunctions.respository.findCustomersDevcieID(DeviceID); 
                        //loops through the customers arraylist and adds the objects to the list models
                        for(Customer customer : Customers){
                            listModel.addElement(customer);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 3:
                        //Retrieves TicketID from the search bar
                        int TicketID = Integer.parseInt(SearchBar.getText());
                        //Fills the arraylist wih relevant customer objects
                        for(Customer customer : Customers){
                            listModel.addElement(customer);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                }
            }
            else{
                ErrorMessage.setVisible(true);  
            }
           
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
            ErrorMessage.setVisible(true);  
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ResultsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultsListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultsListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditCustomerBtn;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JToggleButton MainMenuBtn;
    private javax.swing.JScrollPane Results;
    private javax.swing.JList<String> ResultsList;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JComboBox<String> SearchCondition;
    private javax.swing.JLabel TechnicianNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
