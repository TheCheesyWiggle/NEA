/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import LibraryFunctions.respository;
import Objects.Ticket;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fv200399
 */
public class EditTickets extends javax.swing.JFrame {

    /**
     * Creates new form EditTickets
     */
    public EditTickets() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IssueField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CustomerIDField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RepairStatus = new javax.swing.JComboBox<>();
        OpenDateField = new javax.swing.JFormattedTextField();
        AddDeviceBtn = new javax.swing.JButton();
        MainMenuBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FindDeviceBtn = new javax.swing.JButton();
        TechnicianNameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DeviceIDField = new javax.swing.JTextField();
        CustomerIDField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("DeviceID:");

        jLabel3.setText("Repair Status:");

        jLabel6.setText("CustomerID:");

        jLabel4.setText("Open date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Edit Ticket");

        RepairStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delivered", "Repairing", "Ready For Collection", "Finished" }));
        RepairStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepairStatusActionPerformed(evt);
            }
        });

        OpenDateField.setText("Current date");
        OpenDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenDateFieldActionPerformed(evt);
            }
        });

        AddDeviceBtn.setText("Add device");
        AddDeviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDeviceBtnActionPerformed(evt);
            }
        });

        MainMenuBtn.setText("Return to Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("Update");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Technician:");

        FindDeviceBtn.setText("Find device");
        FindDeviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindDeviceBtnActionPerformed(evt);
            }
        });

        TechnicianNameLabel.setText("Technicain Name");

        jLabel5.setText("Issue:");

        jLabel8.setText("Ticket ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TechnicianNameLabel)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(SaveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(AddDeviceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FindDeviceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MainMenuBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CustomerIDField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeviceIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addComponent(CustomerIDField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RepairStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OpenDateField)
                                    .addComponent(IssueField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TechnicianNameLabel))
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerIDField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DeviceIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(IssueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RepairStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(OpenDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDeviceBtn)
                    .addComponent(SaveBtn)
                    .addComponent(MainMenuBtn)
                    .addComponent(FindDeviceBtn))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RepairStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairStatusActionPerformed

    private void OpenDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenDateFieldActionPerformed

    private void AddDeviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDeviceBtnActionPerformed
        AddDevice AD = new AddDevice();
        AD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddDeviceBtnActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        //Grabs all the values inputted by the User
        int CustomerID = Integer.parseInt(CustomerIDField.getText());
        int DeviceID = Integer.parseInt(DeviceIDField.getText());
        String Issue = IssueField.getText();
        String RepairStat = RepairStatus.getItemAt(RepairStatus.getSelectedIndex());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startdate = LocalDate.parse(OpenDateField.getText(), formatter);
        LocalDate closedate = LocalDate.parse("01/01/0001", formatter);

        Ticket newTicket = new Ticket(0,Issue,RepairStat,startdate,closedate,DeviceID);
        respository.AddTicket(newTicket);
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void FindDeviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindDeviceBtnActionPerformed
        FindDevice FD = new FindDevice();
        FD.setVisible(true);
    }//GEN-LAST:event_FindDeviceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDeviceBtn;
    private javax.swing.JTextField CustomerIDField;
    private javax.swing.JTextField CustomerIDField1;
    private javax.swing.JTextField DeviceIDField;
    private javax.swing.JButton FindDeviceBtn;
    private javax.swing.JTextField IssueField;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JFormattedTextField OpenDateField;
    private javax.swing.JComboBox<String> RepairStatus;
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
    // End of variables declaration//GEN-END:variables
}
