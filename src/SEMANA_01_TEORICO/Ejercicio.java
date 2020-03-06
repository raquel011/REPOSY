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
public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int min;
        int me;
        int dec;
        int cen;
        System.out.println("Ingresar milimetros:");
        min=sc.nextInt();
        me=min/1000;
        min=min%1000;
        dec=min/100;
        min=min%100;
        cen=min/10;
        min%=10;
        System.out.println("Metro: "+me
                +"Decimetro: "+dec
                +"Centimetro: "+cen
                +"Milimetro: "+min);
    }
}

    

