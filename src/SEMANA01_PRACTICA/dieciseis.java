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
import java.text.*;

public class dieciseis {
    public static void main(String[] args){
      
        Scanner leer= new Scanner(System.in);

        float nota;
        float notasTotal=0;
        float promedioTodos;
        float promedio;
        int i,j;
        float suma = 0;
        int acumulador=0;

        
        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS: ");
        int maximoA=leer.nextInt();
        System.out.println("INGRESE LA MAXIMA NOTA PARA CADA ALUMNO: ");
        int maxNota=leer.nextInt();
        
        for(i = 1; i <= maximoA; i++){
            
           System.out.println("alumno "+i +" :");
          
        for(j=1;j<=maxNota;j++){ 
          System.out.println("ingrese la nota:"+ j +" :");
          nota=leer.nextFloat();
          suma+=nota;



        } 

         
        
        promedio=suma/(maxNota);
        System.out.println("el promedio de las notas es:"+promedio);


        if (promedio >= 10.5)
            System.out.println("El alumno esta aprobado:");

        else
            System.out.println("El alumno esta reprobado:");
        
        
    suma = 0;
    acumulador+=promedio;
    }

   
    promedioTodos = acumulador/maximoA;
    System.out.println("Promedio de todos los alumnos:" + promedioTodos);
        
        
    }
}

    

