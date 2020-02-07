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
public class numeroMayor {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        int numeroM,numero,mayor;

      

        System.out.println("ingrese la cantidad de numeros : ");
        numeroM=entrada.nextInt();

        mayor=0;

        for (int i=1;i<=numeroM;i++)

        {

            System.out.println("numeo " + i+": ");

            numero=entrada.nextInt();

          
            if (numero>mayor)

            {

                mayor=numero;

            }

      

        }


        System.out.println("El numero mayor es: "+mayor);


    }

    
}
