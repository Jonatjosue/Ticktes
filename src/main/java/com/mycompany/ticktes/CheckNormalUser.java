package com.mycompany.ticktes;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CheckNormalUser extends javax.swing.JFrame {

    
    private char typeuser='1';
   
    public CheckNormalUser() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        DefaultTableModel j = new DefaultTableModel(new String[] { "User Name","Last Name","Email"}, MainApp.Users.size());
            TableShow.setModel(j);
            
            TableModel Info =  TableShow.getModel();
            
            for(int i=0; i< MainApp.Users.size();i++){
                ClassForUsers u = MainApp.Users.get(i);
                Info.setValueAt(u.getUser(),i,0);
                Info.setValueAt(u.getUserLastName(),i,1);
                Info.setValueAt(u.getEmail(),i,2);
            }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableShow = new javax.swing.JTable();
        PromptTypeUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableShow.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TableShow);

        jScrollPane1.setViewportView(jScrollPane2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 730, 390));

        PromptTypeUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PromptTypeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PromptTypeUser.setText("Normal User");
        jPanel1.add(PromptTypeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 250, -1));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 150, -1));

        jLabel1.setText("Check Password of  User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 240, -1));

        jButton2.setText("Search");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 210, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 540));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu2.setText("Normal User");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Team Member User");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Team Leader User");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // show normal user
        DefaultTableModel j = new DefaultTableModel(new String[] { "User Name","Last Name","Email"}, MainApp.Users.size());
            TableShow.setModel(j);
            
            TableModel Info =  TableShow.getModel();
            
            for(int i=0; i< MainApp.Users.size();i++){
                ClassForUsers u = MainApp.Users.get(i);
                Info.setValueAt(u.getUser(),i,0);
                Info.setValueAt(u.getUserLastName(),i,1);
                Info.setValueAt(u.getEmail(),i,2);
            }
            
            PromptTypeUser.setText("Team Member Users");
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // show team member
        DefaultTableModel j = new DefaultTableModel(new String[] { "User Name","Last Name","Age","Email"}, MainApp.Tusers.size());
            TableShow.setModel(j);
            
            TableModel Info =  TableShow.getModel();
            
            for(int i=0; i< MainApp.Tusers.size();i++){
                TeamMembersClass u = MainApp.Tusers.get(i);
                Info.setValueAt(u.getTuser(),i,0);
                Info.setValueAt(u.getTuserlastname(),i,1);
                Info.setValueAt(u.getTage(),i,2);
                Info.setValueAt(u.getTemail(),i,3);
                
            }
            
            PromptTypeUser.setText("Normal Users");
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // show team leader
        DefaultTableModel j = new DefaultTableModel(new String[] { "User Name","Last Name","Deparment","Email"}, MainApp.Lusers.size());
            TableShow.setModel(j);
            
            TableModel Info =  TableShow.getModel();
            
            for(int i=0; i< MainApp.Lusers.size();i++){
                TeamLeaderClass u = MainApp.Lusers.get(i);
                Info.setValueAt(u.getLuser(),i,0);
                Info.setValueAt(u.getLuserlastname(),i,1);
                Info.setValueAt(u.getLdeparment(),i,2);
                Info.setValueAt(u.getLemail(),i,3);
            }
            PromptTypeUser.setText("Team Leader Users");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Exit
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PromptTypeUser;
    private javax.swing.JTable TableShow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
