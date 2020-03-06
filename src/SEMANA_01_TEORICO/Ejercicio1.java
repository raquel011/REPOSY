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
public class Ejercicio1 {
    public static void main(String[] args) {
        //profesor
       Scanner sc=new Scanner(System.in);
        int num, acu=0;
        System.out.println("Ingresa nro: ");
        num=sc.nextInt();
        int aux=num;
        while(num>0){
            acu=acu+num%10;
            num=num/10;
        }
        System.out.println("La suma de digitos  "
                +aux+ " es: "+acu);
    }         
        
        //yo
        
        /*int num, aux,mod=0,suma=0;
        Scanner entrada=new Scanner(System.in);
        num=entrada.nextInt();
        //aux=num;
        while(num>0){
         mod=num%10;
         num=num/10;
         suma=suma+mod;
       }
        System.out.println("la suma de los digitos del numero es: "+suma);
    }*/
    
}

