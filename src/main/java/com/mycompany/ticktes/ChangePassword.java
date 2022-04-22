package com.mycompany.ticktes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ChangePassword extends javax.swing.JFrame {

    public  String newpassword;
    public  String oldpassword;
    private  static  String Currentpassword;
    private boolean Validating = false;
    
    
    
    public ChangePassword() {
        initComponents();
        setLocationRelativeTo(null);    
        
      
    }
    
  
    public String getCurrentpassword() {
        return Currentpassword;
    }


    public void setCurrentpassword(String Currentpassword) {
        this.Currentpassword = Currentpassword;
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PromptField = new javax.swing.JLabel();
        ChangeButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        OldPasswordField = new javax.swing.JPasswordField();
        NewPasswordField = new javax.swing.JPasswordField();
        Validatingpass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(471, 373));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(471, 373));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Change Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, 50));

        jLabel2.setText("Old Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jLabel3.setText("New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        PromptField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        PromptField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(PromptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 250, 60));

        ChangeButton.setText("Change");
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 250, 120, -1));

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 290, 120, -1));
        jPanel1.add(OldPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 260, -1));

        NewPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NewPasswordFieldKeyReleased(evt);
            }
        });
        jPanel1.add(NewPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 260, -1));

        Validatingpass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Validatingpass.setText("Enter new Password");
        jPanel1.add(Validatingpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 214, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // exit button

        this.dispose();

    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
        // Change password
        oldpassword = OldPasswordField.getText();
        newpassword = NewPasswordField.getText();

        if(oldpassword.equals(getCurrentpassword())){

            PromptField.setText("");
            PromptField.setText("Changed Succesfully");

            Login L = new Login();
            L.setPadminget(newpassword);

            Currentpassword = newpassword;

        }else{

            PromptField.setText("Old Password is Incorrect");
        }
    }//GEN-LAST:event_ChangeButtonActionPerformed

    private void NewPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewPasswordFieldKeyReleased
        // validating password
        String support = NewPasswordField.getText();
        
         String Expretioncheck = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,20}$";
          Pattern p = Pattern.compile(Expretioncheck);
          
          Matcher validated = p.matcher(support);
          
          if(validated.matches()){
              Validating=true;
               Validatingpass.setText("Password is accepted");
          }else{
              Validating=false;
               Validatingpass.setText("Password is not accepted yet");
          }  
         
    }//GEN-LAST:event_NewPasswordFieldKeyReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPasswordField NewPasswordField;
    private javax.swing.JPasswordField OldPasswordField;
    private javax.swing.JLabel PromptField;
    private javax.swing.JLabel Validatingpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    

   
}
