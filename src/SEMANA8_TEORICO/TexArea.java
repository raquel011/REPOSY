/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ESTHER
 */
public class TexArea extends JFrame {
    
    public TexArea(){
            super("texto area");
            setLocationRelativeTo(null);
    //setUndecorated(true);
    setBounds(350,100, 400,500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    

    JPanel Panel=new JPanel();
    //Panel.setLayout(null);
    //Panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED),"", TitledBorder.ABOVE_BOTTOM, TitledBorder.RIGHT));
    Panel.setBounds(350,100, 400,490);
    Panel.setBackground(new Color(220,200,255));
    this.getContentPane().add(Panel);
    //setBounds(350,100, 600,500);

    JTextField texto=new JTextField("BIENVENIDO");
    texto.setBackground(new Color(220,200,255));
    texto.setBounds(100, 40, 120, 100);

    Panel.add(texto);

        
    }
        public static void main(String[] args) {
        TexArea principal=new TexArea();
        
        principal.setVisible(true);
    }
    
}
