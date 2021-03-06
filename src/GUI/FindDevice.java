/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import LibraryFunctions.respository;
import Objects.Device;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author fv200399
 */
public class FindDevice extends javax.swing.JFrame {

    /**
     * Creates new form FindDevice
     */
    public FindDevice() {
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
        Results = new javax.swing.JScrollPane();
        ResultsList = new javax.swing.JList<>();
        MainMenuBtn = new javax.swing.JToggleButton();
        EditDeviceBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DeviceID", "Manufacturer", "CustomerID", "Model", "TicketID" }));
        SearchCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchConditionActionPerformed(evt);
            }
        });

        jLabel1.setText("Techincian:");

        TechnicianNameLabel.setText("Technician Name");

        Results.setViewportView(ResultsList);

        MainMenuBtn.setText("Return to Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        EditDeviceBtn.setText("Edit device");
        EditDeviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDeviceBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search For Device");

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TechnicianNameLabel)
                                .addGap(0, 417, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(EditDeviceBtn)
                                .addGap(119, 119, 119)
                                .addComponent(SearchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(MainMenuBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Results, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SearchBar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TechnicianNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MainMenuBtn)
                    .addComponent(EditDeviceBtn)
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

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        try{
            if(!(SearchBar.getText().equals(""))){
                //based on search properties search for the different devices
                ArrayList<Device> Devices = new ArrayList<Device>(); 
                //creates a list model to edit later
                DefaultListModel listModel = new DefaultListModel();
                //switch statement to check the search condition
                switch (SearchCondition.getSelectedIndex()) {
                    case 0:
                        //Retrieves customerID from the search bar
                        int DeviceID = Integer.parseInt(SearchBar.getText());
                        //Fills the arraylist wih relevant customer objects
                        Devices = LibraryFunctions.respository.findDevicesID(DeviceID);
                        //loops through the customers arraylist and adds the objects to the list models
                        for (Device Device : Devices) {
                            listModel.addElement(Device);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 1:
                        //Retrieves device manufacturer from the search bar
                        String manufacturer = SearchBar.getText();
                        //Fills the arraylist wih relevant customer objects
                        Devices = LibraryFunctions.respository.findDevicesManufacturer(manufacturer);
                        //loops through the customers arraylist and adds the objects to the list models
                        for (Device Device : Devices) {
                            listModel.addElement(Device);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 2:
                        //Retrieves DeviceID from the search bar
                        int CustomerID = Integer.parseInt(SearchBar.getText());
                        //Fills the arraylist wih relevant customer objects
                        Devices = LibraryFunctions.respository.findDevicesCustomerID(CustomerID);
                        //loops through the customers arraylist and adds the objects to the list models
                        for (Device Device : Devices) {
                            listModel.addElement(Device);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 3:
                        //Retrieves customers name from the search bar
                        String model = SearchBar.getText();
                        //Fills the arraylist wih relevant customer objects
                        Devices = LibraryFunctions.respository.findDevicesModel(model);
                        //loops through the customers arraylist and adds the objects to the list models
                        for (Device Device : Devices) {
                            listModel.addElement(Device);
                        }
                        //sets the list model
                        ResultsList.setModel(listModel);
                        break;
                    case 4:
                        //Retrieves TicketID from the search bar
                        int TicketID = Integer.parseInt(SearchBar.getText());
                        //Fills the arraylist wih relevant customer objects
                        Devices = LibraryFunctions.respository.findDevicesTicketID(TicketID);
                        //loops through the customers arraylist and adds the objects to the list models
                        for (Device Device : Devices) {
                            listModel.addElement(Device);
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

    private void EditDeviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDeviceBtnActionPerformed
        EditDevice EditDevice = new EditDevice();
        EditDevice.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EditDeviceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FindDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindDevice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditDeviceBtn;
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
