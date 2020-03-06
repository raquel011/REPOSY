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
public class diecinueve {
        public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        int numeroM,numero,menor;

        double media;

        System.out.println("ingrese la cantidad de numeros : ");
        numeroM=entrada.nextInt();

        menor=100;

        for (int i=1;i<=numeroM;i++)

        {

            System.out.println("numeo " + i+": ");

            numero=entrada.nextInt();

          
            if (numero<menor)

            {

                menor=numero;

            }

      

        }


        System.out.println("El numero menor es: "+menor+"\n");


    }

 

} 
        


