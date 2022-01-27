/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objects.Customer;
import GUI.FindCustomer.*;
import LibraryFunctions.*;

/**
 *
 * @author fv200399
 */
public class EditCustomer extends javax.swing.JFrame {

    /**
     * Creates new form EditCustomer
     * @param currentCustomer
     */
    public EditCustomer() {
        initComponents();
        InvalidEmail.setVisible(false);
        InvalidPhonenumber.setVisible(false);
        TechnicianNameLabel.setText(respository.getCurrentUser().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PhoneNumberField = new javax.swing.JTextField();
        TechnicianNameLabel = new javax.swing.JLabel();
        AddressField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PostcodeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        MainMenuBtn = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        CustomerIDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        InvalidEmail = new javax.swing.JLabel();
        InvalidPhonenumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Edit Customer");

        jLabel7.setText("Address");

        RefreshBtn.setText("Refresh Form");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Postcode");

        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Technician:");

        TechnicianNameLabel.setText("Technician Name");

        jLabel3.setText("First name:");

        jLabel4.setText("Last name:");

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        MainMenuBtn.setText("Return to main menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Phone Number:");

        CustomerIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer ID:");

        InvalidEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InvalidEmail.setForeground(new java.awt.Color(255, 0, 0));
        InvalidEmail.setText("Invalid Email");

        InvalidPhonenumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        InvalidPhonenumber.setForeground(new java.awt.Color(255, 0, 0));
        InvalidPhonenumber.setText("Invalid PhoneNumber");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TechnicianNameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SaveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RefreshBtn)
                        .addGap(18, 18, 18)
                        .addComponent(MainMenuBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CustomerIDField)
                                .addComponent(FirstNameField)
                                .addComponent(LastNameField)
                                .addComponent(EmailField)
                                .addComponent(PhoneNumberField)
                                .addComponent(AddressField)
                                .addComponent(PostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(InvalidEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InvalidPhonenumber)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TechnicianNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvalidEmail)
                    .addComponent(InvalidPhonenumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(PostcodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(MainMenuBtn)
                    .addComponent(RefreshBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        EditCustomer editCust = new EditCustomer();
        editCust.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
    
    //Grabs all the values inputted by the User
    int CustomerID =  Integer.parseInt(CustomerIDField.getText());
    String FirstName = FirstNameField.getText();
    String LastName = LastNameField.getText();
    String Email = EmailField.getText();
    String PhoneNumber = PhoneNumberField.getText();
    String Address = AddressField.getText();
    String Postcode = PostcodeField.getText();
    if(PatternMatching.emailValdation(Email) ){
       //creates it into an object get the right change customer id 
        Customer newCustomer = new Customer(CustomerID,FirstName,LastName,Email,PhoneNumber,Address,Postcode);
        respository.editCustomer(newCustomer);

        //refreshes the page
        EditCustomer editCust = new EditCustomer();
        editCust.setVisible(true);
        this.dispose();
    }
    else{
        InvalidEmail.setVisible(true);
    }

        //Adds to local customer arraylist since it will probably been used again soon
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void CustomerIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIDFieldActionPerformed

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
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressField;
    private javax.swing.JTextField CustomerIDField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel InvalidEmail;
    private javax.swing.JLabel InvalidPhonenumber;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JToggleButton MainMenuBtn;
    private javax.swing.JTextField PhoneNumberField;
    private javax.swing.JTextField PostcodeField;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel TechnicianNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
