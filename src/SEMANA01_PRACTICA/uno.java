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
public class uno {
     public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
     
    int numero,contador=0,num,suma=0;
    float prom=0;
    
     
    do{
        num=entrada.nextInt();
        if(num>0){
            contador++;
        suma=suma+num; 
        prom=(float)suma/(float)contador;
         
        }      
     }while(num!=-1);
                   
         System.out.println("la suma total es : "+suma);   
         System.out.println("el promedio es: "+prom);
     }  
     
}


    

