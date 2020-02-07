/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICA;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class seis {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int galones, galon;
        double g=3.785,suma=0,acu=0;
        String tipo;
        
        System.out.println("ingrese la ventas de galones: ");
        int ventas=entrada.nextInt();
        
        for (int i = 1; i <= ventas; i++) {
            System.out.println("venta "+i+" ");
            System.out.println("cuantos galones: ");
            galones=entrada.nextInt();
            System.out.println("Tipo ");
            tipo=entrada.next();
            
            
               
               if(tipo.equals("A")){
                 suma=  (galones*g)*50;
                   System.out.println("el total a pagar es: "+suma);
               }else if(tipo.equals("B")){
                   suma=(galones*g)*55;
                   System.out.println("el total a pagar es: "+suma);
               }else if(tipo.equals("C")){
                   suma=(galones*g)*60;
                   System.out.println("el total a pagar es: "+suma);
               }
              
             
            if(tipo.equals("D")){
             break;
               }
            
         acu=acu+suma; 
            
            
    }
                
            System.out.println("el total recaudado es : "+acu);
    
    
    }
}
