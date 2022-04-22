package com.mycompany.ticktes;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class AddUsers extends javax.swing.JFrame {
    
    private char typeuser='1';
    private boolean accepted = false;
    private boolean testingemail=false;
    
    
    public AddUsers() {
        initComponents();
        setLocationRelativeTo(null);
        
        PromptAdditional.setVisible(false);
        
        Additionalinfo.setVisible(false);
        
        LittlePrompt.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdviseTypeUser = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JButton();
        AddPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserLastNameField = new javax.swing.JTextField();
        AddUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EmailAddressField = new javax.swing.JTextField();
        Validatingpass = new javax.swing.JLabel();
        EmailPrompt = new javax.swing.JLabel();
        LastNamePrompt = new javax.swing.JLabel();
        UserNamePrompt = new javax.swing.JLabel();
        Additionalinfo = new javax.swing.JTextField();
        PromptAdditional = new javax.swing.JLabel();
        LittlePrompt = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 410, 30));

        AddPassword.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                AddPasswordComponentAdded(evt);
            }
        });
        AddPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPasswordActionPerformed(evt);
            }
        });
        AddPassword.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                AddPasswordPropertyChange(evt);
            }
        });
        AddPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(AddPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 310, -1));

        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 20));

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 410, 30));

        jLabel1.setText("User Last Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        UserLastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLastNameFieldActionPerformed(evt);
            }
        });
        UserLastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserLastNameFieldKeyReleased(evt);
            }
        });
        jPanel1.add(UserLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 310, -1));

        AddUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddUserKeyReleased(evt);
            }
        });
        jPanel1.add(AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 310, -1));

        jLabel3.setText("User Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        jLabel2.setText("Email Address");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        EmailAddressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailAddressFieldKeyReleased(evt);
            }
        });
        jPanel1.add(EmailAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 310, -1));

        Validatingpass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Validatingpass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Validatingpass.setText("Enter your password");
        jPanel1.add(Validatingpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, -1));

        EmailPrompt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        EmailPrompt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EmailPrompt.setText("Enter Email");
        jPanel1.add(EmailPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 160, -1));

        LastNamePrompt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LastNamePrompt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LastNamePrompt.setText("Enter Last Name");
        jPanel1.add(LastNamePrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 200, -1));

        UserNamePrompt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        UserNamePrompt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        UserNamePrompt.setText("Enter User Name");
        jPanel1.add(UserNamePrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 220, -1));
        jPanel1.add(Additionalinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 310, -1));

        PromptAdditional.setText("Edad");
        jPanel1.add(PromptAdditional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, -1));

        LittlePrompt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LittlePrompt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LittlePrompt.setText("jLabel5");
        jPanel1.add(LittlePrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 350, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

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
        
        if(testingemail==true){
             if(accepted==true){
            
              switch(typeuser){
           case '1':
        String user = AddUser.getText();
        String password= AddPassword.getText();
        String UserLastname =  UserLastNameField.getText();
        String emailaddress = EmailAddressField.getText();
        ClassForUsers newuser =new ClassForUsers();
        newuser.setPassword(password);
        newuser.setUser(user);
        newuser.setUserLastName(UserLastname);
        newuser.setEmail(emailaddress);
        
        MainApp.Users.add(newuser);
      
        AddUser.setText("");
        AddPassword.setText("");
        UserLastNameField.setText("");
        EmailAddressField.setText("");
        
        JOptionPane.showMessageDialog(this,"User created succesfully ");
               break;
           case '2':
        String Tuser = AddUser.getText();
        String Tpassword= AddPassword.getText();
        String Tuserlastname = UserLastNameField.getText();
        String temail = EmailAddressField.getText();
        String tage = Additionalinfo.getText();
        TeamMembersClass T =new TeamMembersClass();
        T.setTpassword(Tpassword);
        T.setTuser(Tuser);
        T.setTuserlastname(Tuserlastname);
        T.setTemail(temail);
        T.setTage(tage);
        
        MainApp.Tusers.add(T);
      
        AddUser.setText("");
        AddPassword.setText("");
        UserLastNameField.setText("");
        EmailAddressField.setText("");
        Additionalinfo.setText("");
        
        JOptionPane.showMessageDialog(this,"User created succesfully ");
               break;
           case '3':
        String luser = AddUser.getText();
        String lpassword= AddPassword.getText();
        String luserlastname = UserLastNameField.getText();
        String lemail = EmailAddressField.getText();
        String Ldeparment = Additionalinfo.getText();
        TeamLeaderClass l =new TeamLeaderClass();
        l.setLpassword(lpassword);
        l.setLuser(luser);
        l.setLuserlastname(luserlastname);
        l.setLemail(lemail);
        l.setLdeparment(Ldeparment);
        l.setBelong(false);
        
        MainApp.Lusers.add(l);
      
        AddUser.setText("");
        AddPassword.setText("");
        UserLastNameField.setText("");
        EmailAddressField.setText("");
        Additionalinfo.setText("");
        
        JOptionPane.showMessageDialog(this,"User created succesfully ");
               break;
    }
    }else{
          JOptionPane.showMessageDialog(this,"password is still not valid");
        }
            
        }else{
            JOptionPane.showMessageDialog(this, "Email is still not valid");
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
        PromptAdditional.setVisible(false);
        Additionalinfo.setVisible(false);
        LittlePrompt.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // Team Member add
        typeuser='2';
        AdviseTypeUser.setText("Team Member");
        PromptAdditional.setVisible(true);
        Additionalinfo.setVisible(true);
        PromptAdditional.setText("Age");
        LittlePrompt.setVisible(true);
        LittlePrompt.setText("Enter Age");
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // Team Leader add
        typeuser='3';
        AdviseTypeUser.setText("Team Leader");
        PromptAdditional.setVisible(true);
        Additionalinfo.setVisible(true);
        PromptAdditional.setText("Deparment");
        LittlePrompt.setText("Enter Deparment");
    }//GEN-LAST:event_jMenu3MouseClicked

    private void UserLastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLastNameFieldActionPerformed
        
    }//GEN-LAST:event_UserLastNameFieldActionPerformed

    private void AddPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPasswordActionPerformed
        // Setting the password
        
    }//GEN-LAST:event_AddPasswordActionPerformed

    private void AddPasswordPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_AddPasswordPropertyChange
        // just like a test
    }//GEN-LAST:event_AddPasswordPropertyChange

    private void AddPasswordComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_AddPasswordComponentAdded
        // test    
    }//GEN-LAST:event_AddPasswordComponentAdded

    private void AddPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddPasswordKeyReleased
        // Test true
        String support = AddPassword.getText();
        
        String Expretioncheck = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
           
          if(support==null){
              accepted=false;
              Validatingpass.setText("Enter a password");
          }
          
          Pattern p = Pattern.compile(Expretioncheck);
          
          Matcher validated = p.matcher(support);
          
          if(validated.matches()){
              accepted=true;
               Validatingpass.setText("Password is accepted");
          }else{
              accepted=false;
               Validatingpass.setText("Password is not accepted");
          }    
    }//GEN-LAST:event_AddPasswordKeyReleased

    private void EmailAddressFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailAddressFieldKeyReleased
        // Testing email
        String testing = EmailAddressField.getText();
        boolean checking=false;
        int  count = 0;
         if(testing.contains("@")){
             checking=true;
         }
         
          if(checking==true){
              EmailPrompt.setText("Checking Email");
                //------------------------------------------
                for(ClassForUsers y: MainApp.Users){
                    count = count+1;
                    System.out.println("Prompt 1");
              
                }
             //------------------------------------------------
                for(TeamMembersClass o: MainApp.Tusers){
                    count = count+1;
                 System.out.println("Prompt 2");
                }
             //------------------------------------------   
                for(TeamLeaderClass q: MainApp.Lusers){
                    count = count+1;
                      System.out.println("Prompt 3");
                }
             //------------------------------------------    
                if(count==0 ){
                    testingemail=true;
                    EmailPrompt.setText("Email Accepted");
                    System.out.println("Prompt 4");
                }
                //------------------------------------------
               
                if(count>0){
                 
                    for(ClassForUsers i: MainApp.Users){
                    if(i.getEmail().equals(testing)){
                       EmailPrompt.setText("Email already exist");
                       count=1;
                     System.out.println("Prompt 5");
                       break;
                    }else{
                        count=0;
                           System.out.println("I am changing to 0.1");
                    }
                }
            
            
                 for(TeamMembersClass o: MainApp.Tusers) {
                     if(o.getTemail().equals(testing)){
                      EmailPrompt.setText("Email already exist");
                      count=1;
                  System.out.println("Prompt 6");
                     break; 
                     }else{
                         count=0;
                           System.out.println("I am changing to 0.2");
                     }
                 } 
              
              
                   
                  for(TeamLeaderClass e: MainApp.Lusers){
                    if(e.getLemail().equals(testing)){
                     EmailPrompt.setText("Email already exist");
                     count=1;
                     System.out.println("Prompt 7");
                     break;  
                    }else{
                        count=0;
                          System.out.println("I am changing to 0.3"); 
                    }
                 }
              
               
              }
                
                if(count==0){
                    testingemail=true;
                    EmailPrompt.setText("Email Accepted");
                    System.out.println("Prompt 8");
                }
          
                //------------------------------------------
                
        
      }else{
              EmailPrompt.setText("This is not a valid Email");
          }
         
        
        
    }//GEN-LAST:event_EmailAddressFieldKeyReleased

    private void AddUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddUserKeyReleased
        // Add name with capital letter
        
       // capital= Character.toString(check);
        
      
       
           try{
               String capital = AddUser.getText();
               char check = capital.charAt(0);
               
                if(Character.isUpperCase(check)){
                        UserNamePrompt.setText("Name Accepted");
                    }else{
                         UserNamePrompt.setText("Capital letter in the beginning");
                              } 
           }catch(StringIndexOutOfBoundsException sio){
               UserNamePrompt.setText("Enter Name");
           }
                   
         
         
    }//GEN-LAST:event_AddUserKeyReleased

    private void UserLastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserLastNameFieldKeyReleased
        // capital letter last name
         
       // capital= Character.toString(check);
        
          try{
              String capital = UserLastNameField.getText();
              char check = capital.charAt(0);
              
               if(Character.isUpperCase(check)){
              LastNamePrompt.setText("Last Name Accepted");
          }else{
              LastNamePrompt.setText("Capital letter in the beginning");
          }
      
          }catch(StringIndexOutOfBoundsException sio){
               LastNamePrompt.setText("Enter Last Name ");
          }
             
          
          
    }//GEN-LAST:event_UserLastNameFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AddPassword;
    private javax.swing.JTextField AddUser;
    private javax.swing.JTextField Additionalinfo;
    private javax.swing.JLabel AdviseTypeUser;
    private javax.swing.JTextField EmailAddressField;
    private javax.swing.JLabel EmailPrompt;
    private javax.swing.JLabel LastNamePrompt;
    private javax.swing.JLabel LittlePrompt;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JLabel PromptAdditional;
    private javax.swing.JTextField UserLastNameField;
    private javax.swing.JLabel UserNamePrompt;
    private javax.swing.JLabel Validatingpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
