/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import interfaz.PanelOperadores;
import interfaz.PanelOperandos;
import interfaz.PanelResultado;
import javax.swing.JOptionPane;
import mundo.Dividir;

/**
 *
 * @author ACER
 */
public class Controlador {
 
    private Dividir dividir;
    private PanelOperadores pnlOperadores;
    private PanelOperandos pnlOperandos;
    private PanelResultado pnlResultado;
    
    public Controlador(){
        dividir = new Dividir();
    }
    public float send(int[] operadores, int operando){
        return dividir.dividir(operadores, operando);
    }
    
    public void conectar(PanelOperadores pnlOperadores, PanelOperandos pnlOperandos, PanelResultado pnlResultado){
        
        this.pnlOperadores = pnlOperadores;
        this.pnlOperandos = pnlOperandos;
        this.pnlResultado = pnlResultado;
        
    }

    public void resultado(){
        try{
        String res = String.valueOf(dividir.dividir(pnlOperandos.getDates(), pnlOperadores.getOption()));
        pnlResultado.setResultado(res);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "NumberFormatException");
        }catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "ArithmeticException");
        }
        
    }
}
