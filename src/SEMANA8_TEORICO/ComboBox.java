/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author ESTHER
 */
public class ComboBox extends JFrame{
  public ComboBox(){
      super();
      setSize(500,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      JComboBox combo=new JComboBox();
      FlowLayout dis = new FlowLayout();
      combo.addItem("curso1");
      combo.addItem("curso2");
      combo.addItem("curso3");
      combo.addItem("curso4");
      setLayout(dis);
      add(combo);
      setVisible(true);
  }
    public static void main(String[] args) {
        ComboBox c=new ComboBox();
    }
    
}
