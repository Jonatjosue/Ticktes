package com.mycompany.ticktes;
public class ProfileTeamMember extends javax.swing.JFrame {

    public ProfileTeamMember() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Welcome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 210, -1));

        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // Log Out
        Login L = new Login();
        L.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
