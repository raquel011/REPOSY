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
public class dieciocho {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int alumnos,edad,totalEdadM=0,totalEdadV=0,contadorM=0,contadorF=0,promF=0,promM=0;
        String sexo;
        
        System.out.println("ingrese la cantidad de alumnos: ");
        alumnos=entrada.nextInt();
        for (int i = 0; i < alumnos; i++) {
            System.out.println("alumno "+i+" ");  
            System.out.println("sexo ");
            sexo=entrada.next();
            System.out.println(" edad");
            edad=entrada.nextInt();
            if(sexo.equals("F")){
                contadorF++;
              totalEdadM=totalEdadM+edad; 
              promF=totalEdadM/contadorF;
                
            }if (sexo.equals("M")){
                contadorM++;
                totalEdadV=totalEdadV+edad;
                promM=totalEdadV/contadorM;

                
            }
            
        }
        System.out.println("el promedio de edad de mujres es : "+promF); 
                            System.out.println("el promedio de varones es: "+promM);
    }
    
}
