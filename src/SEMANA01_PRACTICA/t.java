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
public class t {
    
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);

        float notas;
        float notasTotal=0;
        float promedioGral;
        float suma = 0;
        float promedio;
        int a;
        int alumno;

        
        System.out.println("ingrese el maximo de laumnos");
        int maximoA=leer.nextInt();
        for(alumno = 0; alumno < maximoA; alumno++){
            System.out.println("alumno "+alumno);
            System.out.println("ingrese la maxima nota: ");
            int maxNota=leer.nextInt();
        for(a=1;a<=maxNota;a++)

        {  
          System.out.println("ingresa la nota:"+ a +"");
          notas=leer.nextFloat();
          suma=suma+notas;



        } 

        notasTotal = notasTotal + suma; //Para poder sacar el promedio 
                                          //de todos los alumnos
        promedio=suma/(a-1);
        System.out.println("el promedio de las notas es:"+promedio);


        if (promedio >= 5.0)
            System.out.println("El alumno esta aprobado:");

        else
            System.out.println("El alumno esta reprobado:");
    }

    suma = 0; //para limpiar esta variable y calcular el promedio del 
                 //siguiente alumno
    
    // Para calcular el promedio general de todos los estudiantes:
    promedioGral = notasTotal/5;
    System.out.println("Promedio de todos los alumnos:" + promedioGral);
    }
    
}