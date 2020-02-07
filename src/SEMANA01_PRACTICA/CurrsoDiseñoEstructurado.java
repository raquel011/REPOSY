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
public class CurrsoDiseñoEstructurado {
    public static void main(String[] args) {
        
     Scanner entrada=new Scanner(System.in);
    
    int materia,Vtotales,suma=0;
    int ventas=0;
    Vtotales=0;
    int alumnos;
    float promedio=0;
    int cont=0,contC=0;
    
    float n=0;
        System.out.println("ingrese la cantidad de Alumnos: ");
        alumnos=entrada.nextInt();
        
        
        for (int i = 0; i < alumnos; i++) {
            System.out.println("Alumno:  "+i+" : ");
            System.out.println("numero de control: ");
            int numControl=entrada.nextInt();
            
            
            
            for (int j = 0; j < 5; j++) {
                System.out.println("Materia "+j+" :");
                materia=entrada.nextInt();
                
              suma+=materia;
              promedio=suma/5;
              cont++;
            }
            System.out.println("el promedio del alumno : "+i+" :"+promedio);
            contC++;
            suma=0;
            if(promedio>0){
                
                //System.out.println("el numero de control del mayor promedio: "+numControl);
               n=numControl; 
            }

            }
                    
              System.out.println("el numero de control del mayor promedio: "+n);  
        }
       		 
                   

		
    }
        



    

