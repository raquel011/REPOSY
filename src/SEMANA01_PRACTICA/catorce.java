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
public class catorce {
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);  
    
       int i,j,temp1=0,temp2=0;
     System.out.println("INGRESE LA CANTIDAD DE ALUMNOS: ");
        int maximoA=entrada.nextInt();
      
      
        
        for(i = 1; i <= maximoA; i++){
            
           System.out.println("alumno "+i +" :");
            System.out.println("sexo [1:varon-2:mujer]");
            int sexo=entrada.nextInt();
            if(sexo==1){
                temp1++;
                
            }else if(sexo==2){
                temp2++;
                
        
        }
   
        }
        System.out.println("la cantidad de varones : "+temp1);
        System.out.println("la cantidad de mujeres: "+temp2);
    }
}
        
        
