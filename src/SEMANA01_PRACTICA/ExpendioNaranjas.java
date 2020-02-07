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
import java.util.Scanner;
public class ExpendioNaranjas {
    public static void main(String[] args) {
        
        int i,cont=0;
        float compra=0;
        double desc=0,tPagar=0;
    
         Scanner entrada=new Scanner(System.in);
        System.out.println("cantidad de kilos comprados: ");
        int cantK=entrada.nextInt();
        System.out.println("cantidad de kilos");
        int kilo=entrada.nextInt();
        
        for ( i = 1; i < 15; i++) {
        compra=cantK*kilo;
        if(kilo>10){
       desc=compra*0.15;
        tPagar=compra-desc;
            System.out.println("pagar"+compra);
            System.out.println("el descuento"+desc);
            
        }else {
            tPagar=compra;
            System.out.println("no tiene descuento");
            System.out.println("debe pagar"+tPagar);
          
            
        }
        
        cont*=tPagar;
        System.out.println("total de ingresos"+cont);
}
    }

}