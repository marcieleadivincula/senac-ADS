/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author marci
 */
public class register extends login {

    private String username;
    private String repeatPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public register(){
        
    }
    
    public register(String username, String repeatPassword) {
        this.username = username;
        this.repeatPassword = repeatPassword;
    }

    public boolean validateRegister() {
        boolean found = false;

        if ("admin".equals(username) && "admin".equals(user) && "123".equals(password) && "123".equals(repeatPassword)) {
            found = true;
        } else {
            found = false;
        }

        return found;
    }
}
