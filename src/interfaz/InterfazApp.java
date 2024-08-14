/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class InterfazApp extends JFrame {

    PanelOperadores pnlOperadores;
    PanelOperandos pnlOperandos;
    PanelResultado pnlResultado;
    Controlador ctrl;
    
    public InterfazApp(Controlador ctrl) {

        getContentPane().setLayout(null);
        setSize(530, 315);
        setResizable(false); //no deja cambiar el tamaño del Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cerrar al darle en la X
        setLocationRelativeTo(null);	//centrar JFrame
        
        pnlOperandos = new PanelOperandos();
        pnlOperandos.setBounds(10, 10, 500,80 );
        add(pnlOperandos);
        
        pnlOperadores = new PanelOperadores();
        pnlOperadores.setBounds(10, 100, 500, 80);
        add(pnlOperadores);
        
        pnlResultado = new PanelResultado(pnlOperadores, pnlOperandos, ctrl);
        pnlResultado.setBounds(10, 190, 500, 80);
        add(pnlResultado);
        
        this.ctrl = ctrl;
        
    }

    public static void main(String[] args) {
        InterfazApp frmMain = new InterfazApp(new Controlador());
        frmMain.setVisible(true);
    }

}
