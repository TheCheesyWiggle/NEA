/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import LibraryFunctions.respository;
import Objects.Customer;
import Objects.Ticket;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author fv200399
 */
public class FindTicket extends javax.swing.JFrame {

    /**
     * Creates new form FindTicket
     */
    public FindTicket() {
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

        jLabel1 = new javax.swing.JLabel();
        TechnicianNameLabel = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        Results = new javax.swing.JScrollPane();
        ResultsList = new javax.swing.JList<>();
        SearchCondition = new javax.swing.JComboBox<>();
        EditTicketBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FindBtn = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Technicain:");

        TechnicianNameLabel.setText("Technician Name");

        Results.setViewportView(ResultsList);

        SearchCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Ticket ID", "Device ID", "Open date" }));
        SearchCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchConditionActionPerformed(evt);
            }
        });

        EditTicketBtn.setText("Edit Ticket");

        jButton2.setText("Return to Main Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search For Ticket");

        FindBtn.setText("Find ticket");
        FindBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBtnActionPerformed(evt);
            }
        });

        ErrorMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        ErrorMessage.setText("Error Parameter invalid");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EditTicketBtn)
                                .addGap(34, 34, 34)
                                .addComponent(FindBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TechnicianNameLabel)
                                .addGap(0, 240, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SearchBar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditTicketBtn)
                    .addComponent(jButton2)
                    .addComponent(FindBtn))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SearchConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchConditionActionPerformed
        
    }//GEN-LAST:event_SearchConditionActionPerformed

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBtnActionPerformed
        ArrayList<Ticket> Tickets = new ArrayList<Ticket>(); 
        //creates a list model to edit later
        DefaultListModel listModel = new DefaultListModel();
        //switch statement to check the serch condition
        switch(SearchCondition.getSelectedIndex()){
            case 0:
                //Retrieves customers name from the search bar
                String CustomerName = SearchBar.getText();
                System.out.println(CustomerName);
                //Fills the arraylist wih relevant ticket objects
                Tickets = LibraryFunctions.respository.findTicketsCustomerFirstName(CustomerName); 
                
                //loops through the ticket arraylist and adds the objects to the list models
                for(Ticket ticket : Tickets){
                    System.out.println(ticket.toString());
                    listModel.addElement(ticket);
                }
                //sets the list model
                ResultsList.setModel(listModel);
                break;

            case 1:
                //Retrieves TicketID from the search bar
                int TicketID = Integer.parseInt(SearchBar.getText());
                //Fills the arraylist wih relevant ticket objects
                Tickets = respository.findTicketID(TicketID); 
                //loops through the Ticket arraylist and adds the objects to the list models
                for(Ticket ticket : Tickets){
                    listModel.addElement(ticket);
                }
                //sets the list model
                ResultsList.setModel(listModel);
                break;
            case 2:
                //Retrieves DeviceID from the search bar
                int DeviceID = Integer.parseInt(SearchBar.getText());
                //Fills the arraylist wih relevant ticket objects
                Tickets = respository.findTicketID(DeviceID); 
                //loops through the Ticket arraylist and adds the objects to the list models
                for(Ticket ticket : Tickets){
                    listModel.addElement(ticket);
                }
                //sets the list model
                ResultsList.setModel(listModel);
                break;
            case 3:
                //Retrieves the date opened from the search bar
                String OpenDate = SearchBar.getText();
                //Fills the arraylist wih relevant ticket objects
                Tickets = respository.findTicketsOpenDate(OpenDate); 
                //loops through the Ticket arraylist and adds the objects to the list models
                for(Ticket ticket : Tickets){
                    listModel.addElement(ticket);
                }
                //sets the list model
                ResultsList.setModel(listModel);
                break;
        }     
    }//GEN-LAST:event_FindBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditTicketBtn;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JButton FindBtn;
    private javax.swing.JScrollPane Results;
    private javax.swing.JList<String> ResultsList;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JComboBox<String> SearchCondition;
    private javax.swing.JLabel TechnicianNameLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
