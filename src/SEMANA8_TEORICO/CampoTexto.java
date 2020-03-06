/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ESTHER
 */
public class CampoTexto extends JFrame{
  public CampoTexto(){
      super();
      setSize(400,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JLabel etiquetaPagina=new JLabel("direccion agina web "+JLabel.RIGHT);
      JTextField direccionPagina=new JTextField("escribe aqui "+30);
      FlowLayout flo = new FlowLayout();
      setLayout(flo);
      add(etiquetaPagina);
      add(direccionPagina);
      setVisible(true);
      
  }   
}
