    package com.mycompany.ticktes;
import java.util.ArrayList;
public class MainApp {
    
    public static ArrayList<ClassForUsers> Users;
    
    public static ArrayList<TeamMembersClass>Tusers;
    
    public static ArrayList<TeamLeaderClass>Lusers;
    
    public static ArrayList<TeamsNames>TNames;
    
    static String CurrentPasswordAdmin;
    
    
    public static void main(String[] args) {
        Login L= new Login();
        L.setVisible(true);
        Users= new ArrayList<>();
        
        Tusers= new ArrayList<>();
        
        Lusers= new ArrayList<>();
        
        TNames= new ArrayList<>();
        
        
        
    }

    
}
