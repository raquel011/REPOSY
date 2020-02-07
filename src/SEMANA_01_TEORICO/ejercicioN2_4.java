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
public class ejercicioN2_4 {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        int hora;
        int minutos;
        int segundos;
        System.out.println("ingrse la hora: ");
        hora=entrada.nextInt();
        
        minutos=hora*60;
        segundos=minutos*60;
        
        System.out.println("la hora: "+hora);
        System.out.println("minutos: "+minutos );
        System.out.println("segundos: "+segundos);
        
        
    }
    
    
    
    
    
}
