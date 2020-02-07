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
public class serieFactorial {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);  
    int numerador=1,denominador=0,factorial,j;
    float f=0;
       
        System.out.println("ingrese n:");
        int n=entrada.nextInt();
    
        for (int i = 1; i < n; i++) {
          factorial=1;
          
            for (j = 1; j < n; j++) {
                factorial=factorial*j;
              f=(float)1/(float)factorial;
                 
            }
            System.out.println(""+numerador+"/"+i+"!"+"="); 
            System.out.println(".."+f); 
            //numerador=numerador+2;
           
        }
    
   
    }
}
