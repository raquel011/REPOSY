/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ESTHER
 */
public class ChecBox extends JFrame{
 public ChecBox(){
     super("..JCheckBox..");
        setLocationRelativeTo(null);
        //setUndecorated(true);
        setBounds(350,100, 400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        JPanel panel=new JPanel();
        panel.setBounds(350,100, 400,490);
        panel.setBackground(new Color(220,200,255));
        this.getContentPane().add(panel);
     
        JCheckBox box=new JCheckBox();
        //box.setBackground(new Color(220,200,255));
        JCheckBox box1=new JCheckBox();   
        JCheckBox box2=new JCheckBox();   
        JCheckBox box3=new JCheckBox();    



        //box.setBounds(100, 180, 120, 100);
        //box1.setBounds(100, 180, 120, 100);
        //box2.setBounds(100, 180, 120, 100);
        //box3.setBounds(100, 180, 120, 100);


        panel.add(box);
        panel.add(box1);
        panel.add(box2);
        panel.add(box3);





     
     
 }
    public static void main(String[] args) {
        ChecBox b=new ChecBox();
        b.setVisible(true);
    }
    
}
