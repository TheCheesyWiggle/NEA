/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import LibraryFunctions.respository;
import Objects.Note;
import Objects.Ticket;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author fv200399
 */
public class FindNotes extends javax.swing.JFrame {

    /**
     * Creates new form FindNotes
     */
    public FindNotes() {
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

        jLabel2 = new javax.swing.JLabel();
        FindBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TechnicianNameLabel = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        Results = new javax.swing.JScrollPane();
        ResultsList = new javax.swing.JList<>();
        SearchCondition = new javax.swing.JComboBox<>();
        EditNoteBtn = new javax.swing.JButton();
        MainMenuBtn = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search For Notes");

        FindBtn.setText("Find note");
        FindBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Technicain:");

        TechnicianNameLabel.setText("Technician Name");

        Results.setViewportView(ResultsList);

        SearchCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Note ID", "Ticket ID", "Device ID" }));
        SearchCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchConditionActionPerformed(evt);
            }
        });

        EditNoteBtn.setText("Edit note");
        EditNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditNoteBtnActionPerformed(evt);
            }
        });

        MainMenuBtn.setText("Return to Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
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
                        .addComponent(EditNoteBtn)
                        .addGap(34, 34, 34)
                        .addComponent(FindBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(MainMenuBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TechnicianNameLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SearchBar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Results, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditNoteBtn)
                    .addComponent(MainMenuBtn)
                    .addComponent(FindBtn))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBtnActionPerformed
        try{
            if(!(SearchBar.getText().equals(""))){
                ArrayList<Note> Notes = new ArrayList<Note>();
                //creates a list model to edit later
                DefaultListModel listModel = new DefaultListModel();
                //switch statement to check the serch condition
                switch(SearchCondition.getSelectedIndex()){
                    case 0:
                    //Retrieves NoteID from the search bar
                    int NoteID = Integer.parseInt(SearchBar.getText());
                    System.out.println(NoteID);
                    //Fills the arraylist wih relevant Note objects
                    Notes = respository.findNotesID(NoteID);
                    //loops through the Notes arraylist and adds the objects to the list models
                    for(Note note : Notes){
                        System.out.println(note.toString());
                        listModel.addElement(note);
                    }
                    //sets the list model
                    ResultsList.setModel(listModel);
                    break;

                    case 1:
                    //Retrieves TicketID from the search bar
                    int TicketID = Integer.parseInt(SearchBar.getText());
                    //Fills the arraylist wih relevant Note objects
                    Notes = respository.findNotesTicketID(TicketID);
                    //loops through the Notes arraylist and adds the objects to the list models
                    for(Note note : Notes){
                        listModel.addElement(note);
                    }
                    //sets the list model
                    ResultsList.setModel(listModel);
                    break;
                    case 2:
                    //Retrieves DeviceID from the search bar
                    int DeviceID = Integer.parseInt(SearchBar.getText());
                    //Fills the arraylist wih relevant note objects
                    Notes = respository.findNotesDeviceID(DeviceID);
                    //loops through the Notes arraylist and adds the objects to the list models
                    for(Note note : Notes){
                        listModel.addElement(note);
                    }
                    //sets the list model
                    ResultsList.setModel(listModel);
                    break;
                }
            }
            ErrorMessage.setVisible(true);    
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
            ErrorMessage.setVisible(true);  
        }
    }//GEN-LAST:event_FindBtnActionPerformed

    private void SearchConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchConditionActionPerformed

    }//GEN-LAST:event_SearchConditionActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        MainMenu main = new MainMenu();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void EditNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditNoteBtnActionPerformed
        
    }//GEN-LAST:event_EditNoteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FindNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindNotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindNotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditNoteBtn;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JButton FindBtn;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JScrollPane Results;
    private javax.swing.JList<String> ResultsList;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JComboBox<String> SearchCondition;
    private javax.swing.JLabel TechnicianNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
