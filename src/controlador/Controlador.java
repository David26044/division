/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import mundo.Dividir;

/**
 *
 * @author ACER
 */
public class Controlador {
 
    private Dividir div;
    
    public Controlador(){
        this.div = new Dividir();
    }
    public float send(int[] operadores, int operando){
        return div.dividir(operadores, operando);
    }
}
