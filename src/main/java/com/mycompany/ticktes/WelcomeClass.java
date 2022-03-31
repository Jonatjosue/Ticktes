package com.mycompany.ticktes;
public class WelcomeClass extends javax.swing.JFrame {
    
    private ClassForUsers users;
    
    public WelcomeClass(ClassForUsers users) {
        this.users=users;
        initComponents();
        setLocationRelativeTo(null);
        
        PrintUser.setText(this.users.getUser());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PrintUser = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 240, 40));

        PrintUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(PrintUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 270, 40));

        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 252, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // to Log Out
        Login L = new Login();
        L.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel PrintUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
