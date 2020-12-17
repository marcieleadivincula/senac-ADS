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
public class saldoUser {

    private int value;
    private int limit;

    public saldoUser(int valor, int limite) {
        this.value = value;
        this.limit = limit;
    }

    public boolean validarSaldo() {
        return (value - limit) < 100;
    }
}
