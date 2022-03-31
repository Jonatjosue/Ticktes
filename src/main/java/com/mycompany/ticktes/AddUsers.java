package com.mycompany.ticktes;
import javax.swing.JOptionPane;
public class AddUsers extends javax.swing.JFrame {
    
    private char typeuser='1';
    
    
    public AddUsers() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddUser = new javax.swing.JTextField();
        AddPassword = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        AdviseTypeUser = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 20));

        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 20));
        getContentPane().add(AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 310, -1));
        getContentPane().add(AddPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 310, -1));

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 410, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdviseTypeUser.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        AdviseTypeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdviseTypeUser.setText(" Normal User");
        jPanel1.add(AdviseTypeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 40));

        LogOutButton.setText("Exit");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 410, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 380));

        jMenu1.setText("Normal User");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Team Member");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Team Leader");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // Add button to create user
       switch(typeuser){
           case '1':
        String user = AddUser.getText();
        String password= AddPassword.getText();
        ClassForUsers newuser =new ClassForUsers();
        newuser.setPassword(password);
        newuser.setUser(user);
        
        MainApp.Users.add(newuser);
      
        AddUser.setText("");
        AddPassword.setText("");
        
        JOptionPane.showMessageDialog(this,"User created succesfully ");
               break;
           case '2':
        String Tuser = AddUser.getText();
        String Tpassword= AddPassword.getText();
        TeamMembersClass T =new TeamMembersClass();
        T.setTpassword(Tpassword);
        T.setTuser(Tuser);
        
        MainApp.Tusers.add(T);
      
        AddUser.setText("");
        AddPassword.setText("");
        
        JOptionPane.showMessageDialog(this,"User created succesfully ");
               break;
    }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // to Log out
        this.dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // Normal User add
        typeuser='1';
        AdviseTypeUser.setText("Normal User");
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // Team Member add
        typeuser='2';
        AdviseTypeUser.setText("Team Member");
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // Team Leader add
        typeuser='3';
        AdviseTypeUser.setText("Team Leader");
    }//GEN-LAST:event_jMenu3MouseClicked

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AddPassword;
    private javax.swing.JTextField AddUser;
    private javax.swing.JLabel AdviseTypeUser;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
