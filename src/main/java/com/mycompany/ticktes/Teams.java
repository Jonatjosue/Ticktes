package com.mycompany.ticktes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class Teams extends javax.swing.JFrame {
    
    private boolean changingCD=true;
    private boolean support=false;
    private int supportNumber=0;

    public Teams() {
        initComponents();
        
        int NumberTeams=0;
        
        setLocationRelativeTo(null);
        
        CreateRadio.setSelected(changingCD);
        
        
         
        
        for(TeamLeaderClass u: MainApp.Lusers){    
            if(u.getBelong()==false){
               TeamLeaderCombo.addItem(u.getLuser()); 
            }
        }
        
        for(TeamsNames l: MainApp.TNames){
            NumberTeams=NumberTeams+1;
            NumberTeam.addItem("Team No. "+NumberTeams);
        }
        
        DefaultTableModel j = new DefaultTableModel(new String[] { "Team Members"}, MainApp.Tusers.size());
            DisplayContent.setModel(j);
            
            TableModel Info =  DisplayContent.getModel();
            TeamMembersClass d=new TeamMembersClass();
            
            for(int i=0; i< MainApp.Tusers.size();i++){
                if(d.getTeamNumber()==1){
                 TeamMembersClass u = MainApp.Tusers.get(i);
                Info.setValueAt(u.getTuser(),i,0);
                    System.out.println("to work");
                }    
            }
            
            TeamsNames o =new TeamsNames();
             // o.getNameofTeam();
            
            for(TeamsNames h: MainApp.TNames){
                TeamNamePrompt.setText(h.getNameofTeam());
                for(TeamLeaderClass i: MainApp.Lusers){
                TeamLeaderPrompt.setText(i.getLuser());
                break;
            }
                break;
            }
            
            
            
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreateDelete = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        NumberTeam = new javax.swing.JComboBox<>();
        CheckTeams = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TeamLPrompt = new javax.swing.JLabel();
        TakeNameTeam = new javax.swing.JTextField();
        TeamLeaderCombo = new javax.swing.JComboBox<>();
        CreateTeamButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayContent = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TeamNamePrompt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TeamLeaderPrompt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DeleteRadio = new javax.swing.JRadioButton();
        CreateRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Create and Check Teams");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 50));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 200, -1));

        jPanel1.add(NumberTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 120, -1));

        CheckTeams.setText("Check");
        CheckTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTeamsActionPerformed(evt);
            }
        });
        jPanel1.add(CheckTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 120, -1));

        jLabel5.setText("Name of Team");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, 20));

        TeamLPrompt.setText("Team Leader");
        jPanel1.add(TeamLPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 130, 20));

        TakeNameTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeNameTeamActionPerformed(evt);
            }
        });
        jPanel1.add(TakeNameTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 250, -1));

        TeamLeaderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamLeaderComboActionPerformed(evt);
            }
        });
        jPanel1.add(TeamLeaderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 120, -1));

        CreateTeamButton.setText("Create");
        CreateTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTeamButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateTeamButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 120, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisplayContent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(DisplayContent);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 400, 300));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Team Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 290, -1));

        TeamNamePrompt.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jPanel2.add(TeamNamePrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setText("Team Leader");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 270, -1));

        TeamLeaderPrompt.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jPanel2.add(TeamLeaderPrompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 280, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 710, 340));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Create");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        jLabel4.setText("Delete");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        CreateDelete.add(DeleteRadio);
        DeleteRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteRadioMouseClicked(evt);
            }
        });
        DeleteRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRadioActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        CreateDelete.add(CreateRadio);
        CreateRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateRadioMouseClicked(evt);
            }
        });
        jPanel3.add(CreateRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 570, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteRadioActionPerformed

    private void TakeNameTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeNameTeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TakeNameTeamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Exit
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CreateRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateRadioMouseClicked
        // create
        changingCD=true;
        TeamLPrompt.setVisible(true);
        TeamLeaderCombo.setVisible(true);
        CreateTeamButton.setText("Create");
        
    }//GEN-LAST:event_CreateRadioMouseClicked

    private void DeleteRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteRadioMouseClicked
        // Delete
        
        changingCD=false;
        TeamLPrompt.setVisible(false);
        TeamLeaderCombo.setVisible(false);
        CreateTeamButton.setText("Delete");
        
         
        
        
        
        
        
        
    }//GEN-LAST:event_DeleteRadioMouseClicked

    private void TeamLeaderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamLeaderComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamLeaderComboActionPerformed

    private void CreateTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTeamButtonActionPerformed
        // Create team button
        String GetTeamNames = TakeNameTeam.getText();
        for(TeamLeaderClass x: MainApp.Lusers){
            support=true;
        }
        
        if(changingCD==true ){
            if( !"".equals(GetTeamNames)  && support==true){
                int supportCreate =1;
            
                
                
            for(TeamsNames t: MainApp.TNames){
                supportCreate=0;
                supportCreate=t.getTeamNumberPosition();
                 supportCreate=supportCreate+1;
            }
            
           
            //-------------------------------------------------------
            
            
            
            TeamsNames i =new TeamsNames();
            i.setNameofTeam(GetTeamNames);
            i.setTeamNumberPosition(supportCreate);
            
            MainApp.TNames.add(i);
            
            
            
          
            
            
            //--------------------------------------------------------
           String TeamLeaderGot = (String) TeamLeaderCombo.getSelectedItem();
           
           for(TeamLeaderClass r: MainApp.Lusers){
               if(TeamLeaderGot.equals(r.getLuser())){
                   r.setBelong(true);
                   r.setTeamNumber(supportCreate);
                   break;
               }
           }
            //--------------------------------------------------------   
           
            
            TeamLeaderCombo.removeAllItems();
            
             for(TeamLeaderClass k: MainApp.Lusers){
                if(k.getBelong()==false){
                 TeamLeaderCombo.addItem(k.getLuser());
                }
                
           }
            
            
            
            TeamLeaderPrompt.setText(TeamLeaderGot);
            
            TeamNamePrompt.setText(GetTeamNames);
            
            TakeNameTeam.setText("");
            
            NumberTeam.addItem( "Team No."+ supportCreate);
            
            for(TeamLeaderClass k: MainApp.Lusers){
                
                 System.out.println(k.getLuser()+" ");
                System.out.println(k.getBelong()+" ");
                System.out.println(k.getTeamNumber());  
                }
                  }else{
                JOptionPane.showMessageDialog(this, "Team Leader Null Or Team Name Null");
               }
        }else{
      //-----------------------------------------------------------------------------------------DELETE  
        
            String DeleteTeam =  TakeNameTeam.getText();
            supportNumber=0;
         
         if(!"".equals(DeleteTeam)){
             System.out.println("proper to work");
              //-----------------------------------------------------
                    for(TeamsNames f: MainApp.TNames){
                        if(DeleteTeam.equals(f.getNameofTeam())){
                            System.out.println("going");
                            break;
                        }
                        supportNumber=supportNumber+1;   
                    }
                    System.out.println("removing" +supportNumber);
                    MainApp.TNames.remove(supportNumber);
                 //--------------------------------------------------------   
                 supportNumber=supportNumber+1;   
                 
                   for(TeamLeaderClass s: MainApp.Lusers){
                       if(supportNumber==s.getTeamNumber()){
                           System.out.println("I am number " +s.getTeamNumber());
                           s.setBelong(false);
                           s.setTeamNumber(0);
                           break;
                       }
                   }
                   
                   //--------------------------------------------------------
                   
                   
                  TeamLeaderCombo.removeAllItems();
                   for(TeamLeaderClass u: MainApp.Lusers){    
                          if(u.getBelong()==false){
                          TeamLeaderCombo.addItem(u.getLuser()); 
                           }
                   }
                   
                   
                   TeamsNames y= new TeamsNames();
                   
                   NumberTeam.removeAllItems();
                   
                   for(TeamsNames n: MainApp.TNames){
                       NumberTeam.addItem("Team No."+n.getTeamNumberPosition());
                   }
                   
                  JOptionPane.showMessageDialog(this, "Team No."+supportNumber+" Deleted Succesfully ");
                  
                  TeamLeaderPrompt.setText("");
                  TeamNamePrompt.setText("");
                    
                }else{
                   
                JOptionPane.showMessageDialog(this, "Enter Name´s Team ");
                }
        }
        
    }//GEN-LAST:event_CreateTeamButtonActionPerformed

    private void CheckTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTeamsActionPerformed
       int NumberTeamCombo;
       
       String TeamNumberSpot = (String) NumberTeam.getSelectedItem();
       char [] cadena_support = TeamNumberSpot.toCharArray();
       String get="";
       for(int i =0; i< cadena_support.length;i++){
           if(Character.isDigit(cadena_support[i])){
               get+=cadena_support[i];
           }
       }
        
       NumberTeamCombo= Integer.valueOf(get);
        
   
       // TeamsNames g= new TeamsNames();
        //TeamLeaderClass e= new TeamLeaderClass();
        
//        for(int i=0; i< MainApp.Lusers.size();i++){
//                    TeamLeaderClass u = MainApp.Lusers.get(i);
//                    Info.setValueAt(u.getLuser(),i,0);
//                    Info.setValueAt(u.getLpassword(),i,1);
//                    
//                    confirmationButton.setText("Deleted Successfully");
//            }

             DefaultTableModel j = new DefaultTableModel(new String[] { "Team Members"}, MainApp.Tusers.size());
            DisplayContent.setModel(j);
            
            TableModel Info =  DisplayContent.getModel();
            TeamMembersClass d=new TeamMembersClass();
            
            for(int i=0; i< MainApp.Tusers.size();i++){
                if(d.getTeamNumber()==NumberTeamCombo){
                 TeamMembersClass u = MainApp.Tusers.get(i);
                Info.setValueAt(u.getTuser(),i,0);
                }    
            }
        
            for(TeamLeaderClass g: MainApp.Lusers){
                if(g.getTeamNumber()==NumberTeamCombo){
                    TeamLeaderPrompt.setText(g.getLuser());
                }   
            }
        
                for(TeamsNames v: MainApp.TNames){
                  if(NumberTeamCombo==v.getTeamNumberPosition()){
                      TeamNamePrompt.setText(v.getNameofTeam());
                      break;
                  }
            }
        
              
         
        
    }//GEN-LAST:event_CheckTeamsActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckTeams;
    private javax.swing.ButtonGroup CreateDelete;
    private javax.swing.JRadioButton CreateRadio;
    private javax.swing.JButton CreateTeamButton;
    private javax.swing.JRadioButton DeleteRadio;
    private javax.swing.JTable DisplayContent;
    private javax.swing.JComboBox<String> NumberTeam;
    private javax.swing.JTextField TakeNameTeam;
    private javax.swing.JLabel TeamLPrompt;
    private javax.swing.JComboBox<String> TeamLeaderCombo;
    private javax.swing.JLabel TeamLeaderPrompt;
    private javax.swing.JLabel TeamNamePrompt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
