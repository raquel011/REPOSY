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
public class treintayUno {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nivel,i,contadorP=0,contadorS=0,contadorCT=0,contadorProfesional=0,contadorpos=0;
        float p1,p2,p3,p4,p5;
        System.out.println("ingrese nivel de estudios ");
        System.out.println("1.primaria 2.secundaria 3.CT 4.EP 5. EPSGRADO");
        do{
        i=0; 
            System.out.println(" : "+i);
        nivel=entrada.nextInt();
        i++;
        if(nivel==1){
            contadorP++;
        }
        if(nivel==2){
          contadorS++;  
        }
        if(nivel==3)
           contadorCT++; 
        if(nivel==4)
            contadorProfesional++;
        if(nivel==5)
            contadorpos++;
        }while(nivel!=6);
        p1=contadorP*100/i;
        p2=(contadorS*100)/i;
        p3=contadorCT*100/i;
        p4=contadorProfesional*100/i;
        p5=contadorpos*100/i;
        System.out.println("1. "+p1);
        System.out.println("2 "+p2);
        System.out.println("3 "+p3);
        System.out.println("4 "+p4);
        System.out.println("5 "+p5);
        
    }
    
}
