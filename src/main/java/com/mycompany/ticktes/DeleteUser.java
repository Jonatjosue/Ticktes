package com.mycompany.ticktes;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class DeleteUser extends javax.swing.JFrame {
    
    private char typedelete='1';
    private ClassForUsers modify;
    
    public DeleteUser() {
        initComponents();
        setLocationRelativeTo(null);
         DefaultTableModel j = new DefaultTableModel(new String[] { "User","Email"}, MainApp.Users.size());
            TableInfo.setModel(j);
            
            TableModel Info =  TableInfo.getModel();
            
            for(int i=0; i< MainApp.Users.size();i++){
                ClassForUsers u = MainApp.Users.get(i);
                Info.setValueAt(u.getUser(),i,0);
                Info.setValueAt(u.getEmail(),i,1);
            }
        //filltable();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInfo = new javax.swing.JTable();
        AdviseField = new javax.swing.JLabel();
        DeleteUserField = new javax.swing.JTextField();
        DeleteUserButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        confirmationButton = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        ExitButton = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableInfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 400));

        AdviseField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdviseField.setText("Normal User");
        jPanel1.add(AdviseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 200, 20));
        jPanel1.add(DeleteUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 240, -1));

        DeleteUserButton.setText("Delete");
        DeleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        jLabel1.setText("Add name to delete it: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 150, -1));

        confirmationButton.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        confirmationButton.setForeground(new java.awt.Color(0, 0, 0));
        confirmationButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(confirmationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 240, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        jMenu2.setText("File");

        jMenu6.setText("Help");
        jMenu2.add(jMenu6);

        ExitButton.setText("Exit");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        jMenu2.add(ExitButton);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Delete ");

        jMenu3.setText("Normal Users");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setText("Team Members");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenu5.setText("Team Leaders");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        // Exit
        this.dispose();
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // delete normal user
        AdviseField.setText("Normal User");
        DefaultTableModel j = new DefaultTableModel(new String[] { "User","Email"}, MainApp.Users.size());
            TableInfo.setModel(j);
            
            TableModel Info =  TableInfo.getModel();
            
            for(int i=0; i< MainApp.Users.size();i++){
                ClassForUsers u = MainApp.Users.get(i);
                Info.setValueAt(u.getUser(),i,0);
                Info.setValueAt(u.getEmail(),i,1);
        typedelete = '1';
            }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // Team member delete
        AdviseField.setText("Team Member");
        DefaultTableModel j = new DefaultTableModel(new String[] { "User","email"}, MainApp.Tusers.size());
            TableInfo.setModel(j);
            
            TableModel Info =  TableInfo.getModel();
            
            for(int i=0; i< MainApp.Tusers.size();i++){
                TeamMembersClass u = MainApp.Tusers.get(i);
                Info.setValueAt(u.getTuser(),i,0);
                Info.setValueAt(u.getTemail(),i,1);
        typedelete = '2';
            }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void DeleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtonActionPerformed
        
        
         switch(typedelete){
        case '1':
            try{
            String duser =DeleteUserField.getText();
            int o=0;
            for( ClassForUsers u: MainApp.Users ){
            if(u.getUser().equals(duser)){
                break;
            }
            o= o+1;
          }
  
            MainApp.Users.remove(o);
            
            DefaultTableModel j = new DefaultTableModel(new String[] { "User","Email"}, MainApp.Users.size());
            TableInfo.setModel(j);
            TableModel Info =  TableInfo.getModel();
            for(int i=0; i< MainApp.Users.size();i++){
                    ClassForUsers u = MainApp.Users.get(i);
                    Info.setValueAt(u.getUser(),i,0);
                    Info.setValueAt(u.getEmail(),i,1);
                    
                    confirmationButton.setText("Deleted Successfully");
            }
            }
            catch(Exception e){
                confirmationButton.setText("Deleted Unsuccessfully");
            }
            break;
        case '2':
             try{
            String duser =DeleteUserField.getText();
            int o=0;
            for( TeamMembersClass u: MainApp.Tusers ){
            if(u.getTuser().equals(duser)){
                break;
            }
            o= o+1;
          }
  
            MainApp.Tusers.remove(o);
            
            DefaultTableModel j = new DefaultTableModel(new String[] { "User","Password"}, MainApp.Tusers.size());
            TableInfo.setModel(j);
            TableModel Info =  TableInfo.getModel();
            for(int i=0; i< MainApp.Tusers.size();i++){
                    TeamMembersClass u = MainApp.Tusers.get(i);
                    Info.setValueAt(u.getTuser(),i,0);
                    Info.setValueAt(u.getTpassword(),i,1);
                    
                    confirmationButton.setText("Deleted Successfully");
            }
            }
            catch(Exception e){
                confirmationButton.setText("Deleted Unsuccessfully");
            }
            break;
        case '3':
              try{
            String duser =DeleteUserField.getText();
            int o=0;
            for( TeamLeaderClass u: MainApp.Lusers ){
            if(u.getLuser().equals(duser)){
                break;
            }
            o= o+1;
          }
  
            MainApp.Lusers.remove(o);
            
            DefaultTableModel j = new DefaultTableModel(new String[] { "User","Password"}, MainApp.Lusers.size());
            TableInfo.setModel(j);
            TableModel Info =  TableInfo.getModel();
            for(int i=0; i< MainApp.Lusers.size();i++){
                    TeamLeaderClass u = MainApp.Lusers.get(i);
                    Info.setValueAt(u.getLuser(),i,0);
                    Info.setValueAt(u.getLpassword(),i,1);
                    
                    confirmationButton.setText("Deleted Successfully");
            }
            }
            catch(Exception e){
                confirmationButton.setText("Deleted Unsuccessfully");
            }
            break;
    }
         
    }//GEN-LAST:event_DeleteUserButtonActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // Team  leader display 
         AdviseField.setText("Team Leader");
        DefaultTableModel j = new DefaultTableModel(new String[] { "User","Email"}, MainApp.Lusers.size());
            TableInfo.setModel(j);
            
            TableModel Info =  TableInfo.getModel();
            
            for(int i=0; i< MainApp.Lusers.size();i++){
                TeamLeaderClass u = MainApp.Lusers.get(i);
                Info.setValueAt(u.getLuser(),i,0);
                Info.setValueAt(u.getLemail(),i,1);
        typedelete = '3';
            }
       
    }//GEN-LAST:event_jMenu5MouseClicked

    
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdviseField;
    private javax.swing.JToggleButton DeleteUserButton;
    private javax.swing.JTextField DeleteUserField;
    private javax.swing.JMenu ExitButton;
    private javax.swing.JTable TableInfo;
    private javax.swing.JLabel confirmationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
