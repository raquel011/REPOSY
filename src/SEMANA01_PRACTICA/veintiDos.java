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
public class veintiDos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int ultimoPeso,peso,pesoAcu=0,promPeso,diferencia;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("persona "+i);
            System.out.println("cual es ultimo peso? ");
            ultimoPeso=entrada.nextInt();
            for (int j = 1; j <=10; j++) {
               peso=entrada.nextInt();
               pesoAcu=pesoAcu+peso;
               
            }
            promPeso=pesoAcu/10;
            diferencia=promPeso-ultimoPeso;
            if(diferencia>0){
                System.out.println(" SUBIO");  
            }else if(diferencia<0){
                System.out.println("BAJO");
            }
            
        }
    }
    
}
