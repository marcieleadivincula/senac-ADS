/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marciele Adivincula
 */
public class login {

    protected String user;
    protected String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean validarLogin(){
        boolean achou = false;
        
        if ("admin".equals(user) && "123".equals(password)) {
            achou = true;
        }else{
            achou = false;
        }
        return achou;
    }
}
