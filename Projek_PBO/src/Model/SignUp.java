/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class SignUp {
    private String Username;
    private String Email;
    private String Password;
    private String Confirm_Password;
    
    /**
     * @return the id
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    /**
     * @return the id
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    /**
     * @return the nim
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Jenis
     */
    public String getConfirm_Password() {
        return Confirm_Password;
    }

    /**
     * @param Confirm_Password
     */
    public void setConfirm_Password(String Confirm_Password) {
        this.Confirm_Password = Confirm_Password;
    }
}
