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
public class vector2 {
    public static void main(String[] args) {
         
        Scanner entrada=new Scanner(System.in);
        
        int numero;
        int suma=0;
        float p1=0;
        int vector[]=new int[4];
        
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("numero "+i+" :");
          numero= entrada.nextInt();
          vector[i]=numero;
          
        }
        for (int i = 0; i < vector.length; i++) {
          suma+= vector[i];
            //System.out.println(""+suma);
        }
       
            System.out.println("suma: "+suma);   
        
        for (int i = 0; i < vector.length; i++) {
            p1=((float)(vector[i]*100f)/(float)suma);
            System.out.println("porcentaje: "+i+" :"+p1+" %");
        }
       
        
    }
     
    
}
