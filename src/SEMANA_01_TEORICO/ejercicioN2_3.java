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
public class ejercicioN2_3 {
    

    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
        
        int numeroMaximo;
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        
        System.out.println("ingrese numero 1");
        numero1=entrada.nextInt();
        System.out.println("ingrese numero 2");
        numero2=entrada.nextInt();
        System.out.println("ingrese numero 3");
        numero3=entrada.nextInt();
        System.out.println("ingrese numero 4");
        numero4=entrada.nextInt();
        
        int suma=numero1+numero2+numero3+numero4;
        System.out.println("la suma es: "+suma);
        float p1=((float)numero1/(float)100)*suma;
        float p2=((float)numero2/(float)100)*suma;
        float p3=((float)numero3/(float)100)*suma;
        float p4=((float)numero4/(float)100)*suma;
        
        System.out.println("promedio N1: "+p1);
        System.out.println("promedio N2"+p2);
        System.out.println("promedio N3"+p3);
        System.out.println("promedio N4"+p4);
        
        
        }
}