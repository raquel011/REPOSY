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
public class veintiSiete {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int sueldoHora,numTrabajadores,Htrabajadas,pago;
        
        System.out.println("ingrese el sueldo por hora: ");
        sueldoHora=entrada.nextInt();
        System.out.println("ingrese el numero de trabajadores ");
        numTrabajadores=entrada.nextInt();
        for (int i = 0; i < numTrabajadores; i++) {
            System.out.println("horas trabajadas: ");
            Htrabajadas=entrada.nextInt();
            pago=0;
            if(Htrabajadas<=40){
             pago=Htrabajadas*sueldoHora;
                System.out.println("sueldo total "+pago);
                
            }
            if(Htrabajadas>40 && Htrabajadas<80){
                sueldoHora=sueldoHora*2;
                pago=Htrabajadas*sueldoHora;
                System.out.println("sueldo total "+pago);
                sueldoHora=sueldoHora/2;
            }
            if(Htrabajadas>=80){
                sueldoHora=sueldoHora*3;
                pago=Htrabajadas*sueldoHora;
                System.out.println("sueldo total "+pago);
                
            }
        }
        
    }
    
}
