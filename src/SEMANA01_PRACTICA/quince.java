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
public class quince {
    public static void main(String[] args) {
        
     Scanner entrada=new Scanner(System.in);
    
    int autos;
    
    
 
        System.out.println("ingrese la cantidad de Autos : ");
        autos=entrada.nextInt();
        
        
        for (int i = 0; i < autos; i++) {
            System.out.println("placa:  "+i+" : ");
            int placa=entrada.nextInt();    
                   
               
                placa=placa%10;
                System.out.println("resto "+placa);
                if(placa==0||placa==2){
                    System.out.println("calcomania amarilla ");
                    
            }else if(placa==3||placa==4){
                    System.out.println("calcomania rosa ");
            }else if(placa==5||placa==6){
                    System.out.println("calcomania roja");
            }else if(placa==7||placa==8){
                    System.out.println("calcomania verde");
            }else if(placa ==9||placa==10){
                    System.out.println("calcomania azul");
            }
            }
            
                
               
            }

    
}
