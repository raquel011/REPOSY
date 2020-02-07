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
public class veintiOcho {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int alturaGallina,numeroHuevos;
        double pesoGallina,calidad;
        
        System.out.println("digite la altura de la gallina ");
        alturaGallina=entrada.nextInt();
        System.out.println("digite el peso de la gallina");
        pesoGallina=entrada.nextInt();
        System.out.println("numero de huevos d ela gallina");
        numeroHuevos=entrada.nextInt();
        
        calidad=pesoGallina*alturaGallina;
        calidad=calidad /numeroHuevos;
        System.out.println("la calidad de la gallina"+calidad);
        
        if(calidad>=15){
            pesoGallina=1.2*calidad;
            
            
        }else if(calidad>8){
            pesoGallina=1*calidad;
        }else if(calidad>=8 && calidad<=15){
            pesoGallina=0.80*calidad;
        }
        System.out.println("el precio del huevo de la gallina ");
        System.out.println(pesoGallina);
    }
    
}
