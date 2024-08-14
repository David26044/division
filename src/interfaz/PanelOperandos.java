/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ACER
 */
public class PanelOperandos extends JPanel {

    private JLabel lblDivisor, lblDividendo;
    private JTextField txtDivisor, txtDividendo;

    public PanelOperandos() {

        setLayout(null);
        setBorder(new LineBorder(Color.black, 2));

        lblDividendo = new JLabel("Dividendo");
        lblDividendo.setBounds(10, 10, 100, 20);
        add(lblDividendo);

        lblDivisor = new JLabel("Divisor.");
        lblDivisor.setBounds(120, 10, 100, 20);
        add(lblDivisor);

        txtDividendo = new JTextField();
        txtDividendo.setBounds(10, 35, 100, 30);
        add(txtDividendo);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(120, 35, 100, 30);
        add(txtDivisor);

        }
        
        public int[] getDates(){

            int[] x =new int[2];
            x[0] = Integer.parseInt(txtDividendo.getText());
            x[1]= Integer.parseInt(txtDivisor.getText());
                    
            return x;
        }
    
        
        
}
