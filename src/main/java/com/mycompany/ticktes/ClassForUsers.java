package com.mycompany.ticktes;
public class ClassForUsers {
    
    
    private String User;
    private  String UserLastName;
    private String Password;
    private String Email;

    /**
     * @return the UserLastName
     */
    public String getUserLastName() {
        return UserLastName;
    }

    /**
     * @param UserLastName the UserLastName to set
     */
    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }
    
  
    /**
     * @return the User
     */
    public String getUser() {
        return User;
    }

    /**
     * @param User the User to set
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
