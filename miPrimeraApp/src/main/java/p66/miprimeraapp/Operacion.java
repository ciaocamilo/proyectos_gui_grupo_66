/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p66.miprimeraapp;

/**
 *
 * @author Camilo A
 */
public class Operacion {
    
    private int numero1;
    private int numero2;
    private int resultado;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int sumar() {
        resultado = numero1 + numero2;
        return resultado;
    }
    
}
