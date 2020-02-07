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
public class veintiCinco {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cantidadMaxima,cantidadP,precio,suma,total=0;
        
        System.out.println("ingrese la cantidad de productos comprados: ");
        cantidadMaxima=entrada.nextInt();
        
        for (int i = 0; i < cantidadMaxima; i++) {
            
            System.out.println("cantidad de cada producto: ");
            cantidadP=entrada.nextInt();
            suma=0;
            for (int j = 0; j < 10; j++) {
                System.out.println("precio: ");
            
            precio=entrada.nextInt();
            
            suma=precio*cantidadP;
            }
            System.out.println(" el costo total de la compra "+i);
            System.out.println(suma);
            total=total+suma;
            
        }
        System.out.println("el costo final de la compra es: "+total);
        }
    }
    

