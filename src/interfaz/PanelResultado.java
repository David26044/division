/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import controlador.Controlador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author ACER
 */
public class PanelResultado extends JPanel implements ActionListener {

    private JButton jbtAceptar;
    private JTextField txtResultado;
    private PanelOperadores pnlOperadores;
    private PanelOperandos pnlOperandos;
    private Controlador ctrl;

    public PanelResultado(PanelOperadores pnlOperadores, PanelOperandos pnlOperandos, Controlador ctrl) {
        setLayout(null);
        setBorder(new LineBorder(Color.black, 2));

        txtResultado = new JTextField();
        txtResultado.setBounds(10, 25, 100, 25);
        add(txtResultado);

        jbtAceptar = new JButton("Aceptar");
        jbtAceptar.setBounds(400, 25, 80, 25);
        jbtAceptar.addActionListener(this);
        add(jbtAceptar);

        this.pnlOperadores = pnlOperadores;
        this.pnlOperandos = pnlOperandos;
        this.ctrl = ctrl;

    }

    public void setResultado(String resultado){
        txtResultado.setText(String.valueOf(resultado));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Aceptar")) {
            ctrl.resultado();
        }
    }

}
