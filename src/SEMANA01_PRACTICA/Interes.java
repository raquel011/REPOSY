/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICA;

/**
 *
 * @author ESTHER
 */
import java.util.Scanner;
public class Interes {
   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double acu=0;double monto=0;
        
     
         
        
        

        System.out.println("ingrese el monto: ");
        double montoI=entrada.nextInt();
   
       monto= montoI;
        for (int i = 0; i < 3; i++) {
            
        
        monto=monto+monto*(2f/100f);
        //acu=acu+monto;
        }
        System.out.println("el monto al año es: "+monto);
        
        
        
        
        
        }
}


