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
public class treintayTres {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int impresiones,total=0,maxOffset=10000,maxStandar=50000,numero;
        
        System.out.println("ingres euna opcion de tipo ");
        System.out.println("1. offset 2. standar");
        int opcion=entrada.nextInt();
        do{
        if(maxOffset>0){
            System.out.println("cantidad de impresion disponible: ");
            System.out.println(maxOffset);
            System.out.println("cuantas impresiones desea hacer? ");
            impresiones=entrada.nextInt();
            while((maxOffset-impresiones)>0){
                System.out.println("soprepasa el limite de impresion");  
                System.out.println("..");
            }
            maxOffset=maxOffset-impresiones;
            total=impresiones;
        }else {System.out.println("ya no hay impresiones ");}
       
        if(maxStandar>0){
            System.out.println("cantidad impresion disponible ");
            System.out.println(maxStandar);
            System.out.println("cantidad impresion a rwalizar ");
            impresiones=entrada.nextInt();
            while(maxStandar-impresiones>0){
                System.out.println("sobrepasa el limite"); 
                System.out.println("..");
            }
            maxStandar=maxStandar-impresiones;
            total=impresiones;
        }else {System.out.println("no hay impresiones");}
        
        System.out.println("presione una tecla para salir"); 
        numero=entrada.nextInt();
    }while(numero!=-1);
    if(total>0){
            System.out.println("el cliente realizo una imresion de ");
            System.out.println("total");
            
    }else {System.out.println("el cliente no pudo realizar impresion");
}
}
}
