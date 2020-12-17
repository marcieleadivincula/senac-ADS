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
public class FacadeUser {
    private static int limit = 1000;

    private login login;

    private saldoUser saldo;

    public FacadeUser(String usuario, String senha, int value) {
        login = new login(usuario, senha);
        saldo = new saldoUser(value, limit);
    }

    public boolean validar() {
        return login.validarLogin() && saldo.validarSaldo();
    }
}
