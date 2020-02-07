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
public class veintiNueve {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int integrantes,opcion,favor=0,contra=0,nulo=0,puntajeF,puntajeC,puntajeN;
        
        System.out.println("cantidad de integrantes");
        integrantes=entrada.nextInt();
        
        System.out.println("seleccione la opcion : 1.favor, 2.contra 3.sin comentarios");
        for (int i = 0; i < integrantes; i++) {
            opcion=entrada.nextInt();
            if(opcion==1){
                favor++;
            }else if(opcion==2){
                contra++;
            }else {nulo++;}
        }
        puntajeF=favor*100/integrantes;
        puntajeC=contra*100/integrantes;
        puntajeN=nulo*100/integrantes;
        System.out.println("a favor"+puntajeF);
        System.out.println("en contra "+puntajeC);
        System.out.println("no opinan"+puntajeN);
        
    }
    
}
