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
public class cadastro extends login {

    private String username;
    private String repeatPassword;

    public cadastro(String username, String repeatPassword) {
        this.username = username;
        this.repeatPassword = repeatPassword;
    }

    public boolean validarPassword() {
        boolean achou = false;

        if ("123".equals(repeatPassword)) {
            achou = true;
        } else {
            achou = false;
        }
        return achou;
    }
}
