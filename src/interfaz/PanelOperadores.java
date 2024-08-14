/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;


/**
 *
 * @author ACER
 */
public class PanelOperadores extends JPanel {
    
    private JRadioButton jrb1, jrb2, jrb3;
    private ButtonGroup grpButton;
    
    public PanelOperadores(){
        setLayout(null);
        setBorder(new LineBorder(Color.black, 2));
        
        grpButton = new ButtonGroup();
        
       jrb1 = new JRadioButton("Divison real.");
       jrb1.setBounds(10, 25, 100, 25);
       add(jrb1);
       
       jrb2 = new JRadioButton("Módulo.");
       jrb2.setBounds(110, 25, 100, 25);
       add(jrb2);
       
       jrb3 = new JRadioButton("Cociente.");
       jrb3.setBounds(220,25,100,25);
       add(jrb3);
       
       grpButton.add(jrb1); grpButton.add(jrb2); grpButton.add(jrb3);
    }
    
    public int getOption(){
        if (jrb1.isSelected()) {
            return 0;
        }
        if (jrb2.isSelected()) {
            return 1;
        }
        if (jrb3.isSelected()) {
            return 2;
        }
        return -1;
    }
    
}
