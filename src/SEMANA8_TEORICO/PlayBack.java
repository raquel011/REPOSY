/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ESTHER
 */
public class PlayBack extends JFrame{
  public PlayBack(){
      super();
      setSize(225,85);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      FlowLayout dis=new FlowLayout();
      setLayout(dis);
      JButton play=new JButton("play");
      JButton stop=new JButton("stop");
      JButton pausa=new JButton("pausa");
      add(play);
      add(stop);
      add(pausa);
      setVisible(true);
      
  }   
}
