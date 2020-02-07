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
public class cuarentaYuno {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota,unidad,cont=0;
        double suma=0,promedio;
        for (int i = 0; i < 40; i++) {
            System.out.println("alumno "+i);
            for (int j = 0; j < 5; j++) {
                
            nota=entrada.nextInt();
            suma=suma+nota;
            
        }
            
           promedio  =suma/5;   
            if(promedio<11) 
                cont++;
            }
        System.out.println("la cantidad de alumnos que no entraran al examen ");
          System.out.println(cont);  
        }
    }
    

