package com.mycompany.ticktes;
public class AdminProfile extends javax.swing.JFrame {
    
    
    
    public AdminProfile() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ChangePasswordbutton = new javax.swing.JToggleButton();
        LogOutbutton = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CreateUserButton = new javax.swing.JToggleButton();
        DeleteUserButton = new javax.swing.JToggleButton();
        CreateTeamButton = new javax.swing.JToggleButton();
        AssingMemberButton = new javax.swing.JToggleButton();
        CheckStatusTicktesButton = new javax.swing.JToggleButton();
        BulkNUsersButton = new javax.swing.JToggleButton();
        BulkTMembersButton = new javax.swing.JToggleButton();
        BulkTicktesButton = new javax.swing.JToggleButton();
        CheckNormalUser = new javax.swing.JButton();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 54, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 164, 59));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ticktes Administrator ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 180, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 50));

        jPanel4.setBackground(new java.awt.Color(36, 47, 64));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name: Jonathan Josue Cifuentes Rodas");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course: Programming");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Carnet: 3190-21-10033");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Section : B");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));

        ChangePasswordbutton.setBackground(new java.awt.Color(54, 54, 54));
        ChangePasswordbutton.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordbutton.setText("Change Password");
        ChangePasswordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(ChangePasswordbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, -1));

        LogOutbutton.setBackground(new java.awt.Color(54, 54, 54));
        LogOutbutton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutbutton.setText("Log Out");
        LogOutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(LogOutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 240, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 290, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 500));

        jPanel2.setBackground(new java.awt.Color(54, 56, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 164, 59));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 164, 59));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Create and Delete Users");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 286, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 370, 10));

        jPanel6.setBackground(new java.awt.Color(204, 164, 59));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 370, 10));

        jPanel7.setBackground(new java.awt.Color(204, 164, 59));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 164, 59));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("jLabel7");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 30));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 370, 10));

        jPanel8.setBackground(new java.awt.Color(204, 164, 59));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 164, 59));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("jLabel7");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 30));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 30));

        jPanel11.setBackground(new java.awt.Color(204, 164, 59));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("jLabel7");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 30));

        jPanel12.setBackground(new java.awt.Color(204, 164, 59));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("jLabel7");
        jPanel12.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 30));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 30));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 30));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 370, 10));

        jPanel13.setBackground(new java.awt.Color(204, 164, 59));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 10));

        jPanel14.setBackground(new java.awt.Color(204, 164, 59));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 370, 10));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Check Information of User");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 340, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Create and Delete an User");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Create a Team And Check Teams");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 340, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Assign Members to a Team");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 340, 20));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Check Ticktes Status");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 340, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bulk Load of Users Team members and  Ticktes");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 340, 20));

        CreateUserButton.setBackground(new java.awt.Color(229, 229, 229));
        CreateUserButton.setForeground(new java.awt.Color(51, 51, 51));
        CreateUserButton.setText("Create User");
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CreateUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, -1));

        DeleteUserButton.setBackground(new java.awt.Color(229, 229, 229));
        DeleteUserButton.setForeground(new java.awt.Color(51, 51, 51));
        DeleteUserButton.setText("Delete User");
        DeleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 180, -1));

        CreateTeamButton.setBackground(new java.awt.Color(229, 229, 229));
        CreateTeamButton.setForeground(new java.awt.Color(51, 51, 51));
        CreateTeamButton.setText("Teams");
        CreateTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTeamButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CreateTeamButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, -1));

        AssingMemberButton.setBackground(new java.awt.Color(229, 229, 229));
        AssingMemberButton.setForeground(new java.awt.Color(51, 51, 51));
        AssingMemberButton.setText("Assing Member ");
        AssingMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssingMemberButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AssingMemberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 370, -1));

        CheckStatusTicktesButton.setBackground(new java.awt.Color(229, 229, 229));
        CheckStatusTicktesButton.setForeground(new java.awt.Color(51, 51, 51));
        CheckStatusTicktesButton.setText("Check Status Tickets");
        jPanel2.add(CheckStatusTicktesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 370, -1));

        BulkNUsersButton.setBackground(new java.awt.Color(229, 229, 229));
        BulkNUsersButton.setForeground(new java.awt.Color(51, 51, 51));
        BulkNUsersButton.setText("Users");
        jPanel2.add(BulkNUsersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 110, -1));

        BulkTMembersButton.setBackground(new java.awt.Color(229, 229, 229));
        BulkTMembersButton.setForeground(new java.awt.Color(51, 51, 51));
        BulkTMembersButton.setText("T Members");
        BulkTMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulkTMembersButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BulkTMembersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 110, -1));

        BulkTicktesButton.setBackground(new java.awt.Color(229, 229, 229));
        BulkTicktesButton.setForeground(new java.awt.Color(51, 51, 51));
        BulkTicktesButton.setText("Ticktes");
        jPanel2.add(BulkTicktesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 100, -1));

        CheckNormalUser.setBackground(new java.awt.Color(229, 229, 229));
        CheckNormalUser.setForeground(new java.awt.Color(0, 0, 0));
        CheckNormalUser.setText("Check Users");
        CheckNormalUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNormalUserActionPerformed(evt);
            }
        });
        jPanel2.add(CheckNormalUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 370, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BulkTMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulkTMembersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BulkTMembersButtonActionPerformed

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
        // Add User
        AddUsers add= new AddUsers();
        add.setVisible(true);
        
    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void LogOutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutbuttonActionPerformed
        // Log Out
        Login L = new Login();
        L.setVisible(true);
         this.dispose();
        
       
        
        
     
    }//GEN-LAST:event_LogOutbuttonActionPerformed

    private void DeleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtonActionPerformed
        // Delete users
        DeleteUser D = new DeleteUser();
        D.setVisible(true);
    }//GEN-LAST:event_DeleteUserButtonActionPerformed

    private void ChangePasswordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordbuttonActionPerformed
        
        ChangePassword C = new ChangePassword();
        C.setVisible(true);
        
       
        
    }//GEN-LAST:event_ChangePasswordbuttonActionPerformed

    private void CheckNormalUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNormalUserActionPerformed
        // check normal user
        CheckNormalUser U = new CheckNormalUser();
        U.setVisible(true);
    }//GEN-LAST:event_CheckNormalUserActionPerformed

    private void CreateTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTeamButtonActionPerformed
        // Create teams and check
        Teams T = new Teams();
        T.setVisible(true);
        
    }//GEN-LAST:event_CreateTeamButtonActionPerformed

    private void AssingMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssingMemberButtonActionPerformed
        // Asign Members
        AssignMembers w= new AssignMembers();
        w.setVisible(true);
    }//GEN-LAST:event_AssingMemberButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AssingMemberButton;
    private javax.swing.JToggleButton BulkNUsersButton;
    private javax.swing.JToggleButton BulkTMembersButton;
    private javax.swing.JToggleButton BulkTicktesButton;
    private javax.swing.JToggleButton ChangePasswordbutton;
    private javax.swing.JButton CheckNormalUser;
    private javax.swing.JToggleButton CheckStatusTicktesButton;
    private javax.swing.JToggleButton CreateTeamButton;
    private javax.swing.JToggleButton CreateUserButton;
    private javax.swing.JToggleButton DeleteUserButton;
    private javax.swing.JToggleButton LogOutbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

   
}
