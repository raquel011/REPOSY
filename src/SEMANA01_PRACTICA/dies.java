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
public class dies {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int suma=0,t;
        for (int i = 0; i < 10; i++) {
            System.out.println("dia "+i+" ");
           int tiempo=entrada.nextInt();
           
           
           suma=suma+tiempo;
          
           
        }
        t=suma/10;
        if(t<=15){
            System.out.println("tiempo "+ t);
         System.out.println("APTO PARA LA PRUEBA");   
        }else {System.out.println("NO ES APTO PARA LA PRUEBA");
        
        
        
    }
    }
    
}
