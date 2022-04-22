
package com.mycompany.ticktes;

import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AssignMembers extends javax.swing.JFrame {
    
    private String GetItem;
    private String GetComboItem;
//    public  CreateCheckBox(){
//           TableModel Info =  TableMembers.getModel();
//            JCheckBox L= new JCheckBox();
//            add(L);
//    }
    
    public AssignMembers() {
        initComponents();
        setLocationRelativeTo(null);
        
        
         DefaultTableModel j = new DefaultTableModel(new String[] { "Name","Last Name"}, MainApp.Tusers.size());
            TableMembers.setModel(j);
            
            TableModel Info =  TableMembers.getModel();
            TeamMembersClass y= new TeamMembersClass();
        
            
            for(int i=0; i< MainApp.Tusers.size();i++){
                if(y.getBelongToTeam()==false){
                 TeamMembersClass u = MainApp.Tusers.get(i); 
                Info.setValueAt(u.getTuser(),i,0);
                Info.setValueAt(u.getTuserlastname(),i,1);
                }
              
                
            }
            
            for(TeamsNames t: MainApp.TNames){
                TeamNameCombo.addItem(t.getNameofTeam());
            }
        
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TeamNameCombo = new javax.swing.JComboBox<>();
        AssingButton = new javax.swing.JButton();
        ExitOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMembers = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GetTeamMember = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PromptAssign = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.add(TeamNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 150, -1));

        AssingButton.setText("Add");
        AssingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssingButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AssingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 150, -1));

        ExitOut.setText("Exit");
        ExitOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitOutActionPerformed(evt);
            }
        });
        jPanel1.add(ExitOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 150, 20));

        TableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Boolean(false), null, null, null},
                { new Boolean(false), null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableMembers);
        if (TableMembers.getColumnModel().getColumnCount() > 0) {
            TableMembers.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableMembers.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 330, 310));

        jLabel1.setText("Team Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 150, -1));

        jLabel3.setText("Assign Team Member");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 30));
        jPanel1.add(GetTeamMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 150, -1));

        jLabel2.setText("Team Member Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 150, -1));
        jPanel1.add(PromptAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 150, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AssingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssingButtonActionPerformed
        //Add Team Member
        boolean Support=false;
        int SupportNumberItem=0;
        
        GetItem= GetTeamMember.getText();
        GetComboItem = (String) TeamNameCombo.getSelectedItem();
        
        for(TeamsNames i: MainApp.TNames){
            if(GetComboItem.equals(i.getNameofTeam())){
                SupportNumberItem=i.getTeamNumberPosition();
            }
        }
        
        
        for(TeamMembersClass s: MainApp.Tusers){
            if(GetItem.equals(s.getTuser())){
                Support =true;
                break;
            }
        }
        
        if(Support==true){
                   for(TeamMembersClass s: MainApp.Tusers){
                    if(GetItem.equals(s.getTuser())){
                         s.setBelongToTeam(true);
                         s.setTeamName(GetComboItem);
                         s.setTeamNumber(SupportNumberItem);
                         System.out.println(s.getTuser());
                         System.out.println(s.getTeamName());
                         System.out.println(s.getTeamNumber());
                         System.out.println(s.getBelongToTeam());
                        break;
                    }
                    
                }
                   PromptAssign.setText("Assignment Succesfully");
                  
        }else{
             PromptAssign.setText("Assignment Unsuccesfully");
        }
        
         DefaultTableModel j = new DefaultTableModel(new String[] { "Name","Last Name"}, MainApp.Tusers.size());
            TableMembers.setModel(j);
            
            TableModel Info =  TableMembers.getModel();  
          //  TeamMembersClass r= new TeamMembersClass();
            
            for(int i=0; i< MainApp.Tusers.size();i++){
                
                    
                    TeamMembersClass u = MainApp.Tusers.get(i); 
                    if(u.getBelongToTeam()==false){
                        System.out.println("");
                 Info.setValueAt(u.getTuser(),i,0);
                Info.setValueAt(u.getTuserlastname(),i,1);
                    }
                
                
                
            }
        
        
    }//GEN-LAST:event_AssingButtonActionPerformed

    private void ExitOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitOutActionPerformed
        //Exit assing
        this.dispose();
        
    }//GEN-LAST:event_ExitOutActionPerformed

  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssingButton;
    private javax.swing.JButton ExitOut;
    private javax.swing.JTextField GetTeamMember;
    private javax.swing.JLabel PromptAssign;
    private javax.swing.JTable TableMembers;
    private javax.swing.JComboBox<String> TeamNameCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
