/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author fv200399
 */
public class OpenTicket extends javax.swing.JFrame {

    /**
     * Creates new form OpenTicket
     */
    public OpenTicket() {
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

        jLabel1 = new javax.swing.JLabel();
        TechnicianNameLabel = new javax.swing.JLabel();
        DeviceIDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RepairStatus = new javax.swing.JComboBox<>();
        OpenDateField = new javax.swing.JFormattedTextField();
        AddDeviceBtn = new javax.swing.JButton();
        MainMenuBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        FindDeviceBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        IssueField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Technician:");

        TechnicianNameLabel.setText("Technicain Name");

        jLabel2.setText("DeviceID:");

        jLabel3.setText("Repair Status:");

        jLabel4.setText("Open date:");

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

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        FindDeviceBtn.setText("Find device");
        FindDeviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindDeviceBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Issue:");

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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SaveBtn)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeviceIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddDeviceBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FindDeviceBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MainMenuBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RepairStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OpenDateField, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(IssueField))
                        .addGap(113, 113, 113)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TechnicianNameLabel))
                .addGap(60, 60, 60)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddDeviceBtn)
                    .addComponent(SaveBtn)
                    .addComponent(MainMenuBtn)
                    .addComponent(FindDeviceBtn))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void FindDeviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindDeviceBtnActionPerformed
        FindDevice FD = new FindDevice();
        FD.setVisible(true);
    }//GEN-LAST:event_FindDeviceBtnActionPerformed

    private void AddDeviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDeviceBtnActionPerformed
        AddDevice AD = new AddDevice();
        AD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddDeviceBtnActionPerformed

    private void RepairStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepairStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RepairStatusActionPerformed

    private void OpenDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpenDateFieldActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        //Grabs all the values inputted by the User
        int DeviceID = Integer.parseInt(DeviceIDField.getText());
        String Issue = IssueField.getText();
        String RepairStat = RepairStatus.getItemAt(RepairStatus.getSelectedIndex());
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startdate = LocalDate.parse(OpenDateField.getText(), formatter);
        
    }//GEN-LAST:event_SaveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OpenTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDeviceBtn;
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
    // End of variables declaration//GEN-END:variables
}