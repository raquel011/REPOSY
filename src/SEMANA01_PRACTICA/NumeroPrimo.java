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
public class NumeroPrimo {
            
        public static void main(String[] args) {
        
    
        Scanner entrada=new Scanner(System.in);
        int max,numero,m;
        int contador,temp=0,i;
        System.out.println("ingrese el maximo: ");
        max=entrada.nextInt();
        
        for ( i = 1; i < max; i++) {
            
            contador=0;
            
           for (int j = 1; j <=i; j++) {
      
            if(i%j==0)
              
             contador++; 
     
           }
            if(contador==2){
                
                System.out.println(i);
            }
            

        } 
}

}