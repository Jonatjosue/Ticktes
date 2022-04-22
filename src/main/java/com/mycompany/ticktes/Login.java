package com.mycompany.ticktes;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
     private static String Padminget="";
     private  boolean Validating = false;
  
     
    public String getPadminget() {
        return Padminget;
    }

    
    public void setPadminget(String Padminget) {
        Login.Padminget = Padminget;
    }
    
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GetUser = new javax.swing.JTextField();
        GetPassword = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Validatingpass = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 170, 30));

        jLabel2.setText("User");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 30));

        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        GetUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetUserActionPerformed(evt);
            }
        });
        GetUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GetUserKeyReleased(evt);
            }
        });
        jPanel1.add(GetUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 260, -1));

        GetPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GetPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(GetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 260, -1));

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 350, -1));

        jToggleButton1.setText("Sign up");
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 350, -1));

        jLabel5.setText("No account ? Sign up here");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 170, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 153));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel6.setText("   Ticktes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 80));

        Validatingpass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Validatingpass.setText("Enter Password");
        jPanel1.add(Validatingpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 260, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetUserActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // the first one I need to set up
        
        
        
        if(Validating==true){
             String user = GetUser.getText();
        String password = GetPassword.getText();
        boolean emailORuser =false;
        
          if(user.contains("@")){
                emailORuser=true;
            }
        
         boolean UserFound = false;
         
         if(Padminget==""){
             Padminget="admin";
             ChangePassword p = new ChangePassword();
             p.setCurrentpassword(Padminget);
         }else{
             ChangePassword p = new ChangePassword();
             p.setCurrentpassword(Padminget);
         }
         
        if(user.equals("admin")&& Padminget.equals(password)){
            AdminProfile A= new AdminProfile();
            A.setVisible(true);
            UserFound= true;
        }else{
              //----------------------------------------------------------
              if(emailORuser==true){
             //----------------------------------------------------------
                  if (UserFound==false){
                      for(ClassForUsers u: MainApp.Users){
                            if(u.getPassword().equals(password)&& u.getEmail().equals(user)){
                                        WelcomeClass welcome = new WelcomeClass(u);
                                        welcome.setVisible(true);
                                        UserFound=true;
                                        break;
                                     }
                             } 
                   }
                     
                    if(UserFound==false){
                             for(TeamMembersClass t: MainApp.Tusers){
                                        if(t.getTpassword().equals(password)&& t.getTemail().equals(user)){
                                                ProfileTeamMember h= new ProfileTeamMember();
                                                h.setVisible(true);
                                                UserFound=true;
                                                 break;
                                                 }
                                         }
                             }
                     if(UserFound==false){
                             for(TeamLeaderClass t: MainApp.Lusers){
                                        if(t.getLpassword().equals(password)&& t.getLemail().equals(user)){
                                                ProfileTeamLeader h= new ProfileTeamLeader();
                                                h.setVisible(true);
                                                UserFound=true;
                                                 break;
                                                 }
                                         }
                             }  
                  
                    //----------------------------------------------------------
              }else{
                  if (UserFound==false){
                      for(ClassForUsers u: MainApp.Users){
                            if(u.getPassword().equals(password)&& u.getUser().equals(user)){
                                        WelcomeClass welcome = new WelcomeClass(u);
                                        welcome.setVisible(true);
                                        UserFound=true;
                                        break;
                                     }
                             } 
                   }
                     
                    if(UserFound==false){
                             for(TeamMembersClass t: MainApp.Tusers){
                                        if(t.getTpassword().equals(password)&& t.getTuser().equals(user)){
                                                ProfileTeamMember h= new ProfileTeamMember();
                                                h.setVisible(true);
                                                UserFound=true;
                                                 break;
                                                 }
                                         }
                             }
                     if(UserFound==false){
                             for(TeamLeaderClass t: MainApp.Lusers){
                                        if(t.getLpassword().equals(password)&& t.getLuser().equals(user)){
                                                ProfileTeamLeader h= new ProfileTeamLeader();
                                                h.setVisible(true);
                                                UserFound=true;
                                                 break;
                                                 }
                                         }
                             }
                       //----------------------------------------------------------
              }
            
                   
         
        }  
         if(UserFound ==true){
                this.dispose();
                
                
           }else{
             JOptionPane.showMessageDialog(this, "User not Found try again");
            }
        }else{
             JOptionPane.showMessageDialog(this, "Password needs more characteres");
        }
        
       
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void GetPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GetPasswordKeyReleased
        // testing password
        String support = GetPassword.getText();
        int wide = support.length();
        
        if(support.equals("admin")){
            Validatingpass.setText("Enter password");
            Validating=true;
        }else{
             switch(wide){
             case 0:
                 Validatingpass.setText("Enter Password");
                     break;
             case 1:
                 Validatingpass.setText(" 7 characteres Left");
                 break;
             case 2:
                 Validatingpass.setText(" 6 characteres Left");
                 break;
             case 3:
                 Validatingpass.setText(" 5 characteres Left");
                 break;
             case 4:
                 Validatingpass.setText(" 4 characteres Left");
                 break;
              case 5:
                  Validatingpass.setText(" 3 characteres Left");
                 break;
               case 6:
                   Validatingpass.setText(" 2 characteres Left");
                 break;
                case 7:
                    Validatingpass.setText(" 1 character Left");
                    Validating= false;
                 break;
               case 8:
                   Validatingpass.setText("Hint Login to check password");
                   Validating= true;
                 break;
        }    
        }
            
            
    }//GEN-LAST:event_GetPasswordKeyReleased

    private void GetUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GetUserKeyReleased
        // testing admin
    }//GEN-LAST:event_GetUserKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GetPassword;
    private javax.swing.JTextField GetUser;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Validatingpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    
}
