/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_01_TEORICO;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class saludo {
    String saludo;
Scanner entrada=new Scanner(System.in);
    public saludo() {
    

    saludo=entrada.next();
            
      
        System.out.println(saludo);
    }
    public static void main(String[] args) {
    
    saludo main=new saludo();
    
        
    }
    
}
