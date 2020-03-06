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
public class cuatro {
    
    public static void main(String[] args) {
   
        Scanner entrada=new Scanner(System.in);
        int max,numero,m;
        
        System.out.println("ingrese el numero: ");
        numero=entrada.nextInt();
        System.out.println("ingrese el maximo: ");
        max=entrada.nextInt();
        
        for (int i = 0; i <=max; i++) {
            System.out.println(numero+"*"+i+"="+numero*i);   
      
        }
        
    }
    
}
