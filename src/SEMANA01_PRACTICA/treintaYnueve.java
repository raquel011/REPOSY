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
public class treintaYnueve {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota,i;
        for (i = 0; i < 50; i++) {
            System.out.println("alumno "+i);
            nota=entrada.nextInt();
            if(nota<70){
                System.out.println("reprobados ");  
            }
        }
        i=(i*100)/50;
        System.out.println("porsentaje "+i);
    }
    
}
