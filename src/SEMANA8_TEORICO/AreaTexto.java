/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author ESTHER
 */
public class AreaTexto extends JFrame{
   public AreaTexto(){
       super();
       setSize(500,180);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JTextArea comentarios=new JTextArea();
       FlowLayout dis=new FlowLayout();
       setLayout(dis);
       add(comentarios);
       setVisible(true);
   } 
}
