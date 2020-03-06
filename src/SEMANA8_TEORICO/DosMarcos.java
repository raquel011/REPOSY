/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA8_TEORICO;

import java.text.CollationElementIterator;
import javax.swing.JFrame;

/**
 *
 * @author ESTHER
 */
public class DosMarcos extends JFrame{
    public DosMarcos(){
        super();
        
        setSize(350,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame two=new secondFrame();
        setVisible(true);
        two.setVisible(true);
        
    }
    public static void main(String[] arguments) {
        DosMarcos tf = new DosMarcos();
}
}

class secondFrame  extends JFrame{
    
    public secondFrame(){
        super();
        setSize(150,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
