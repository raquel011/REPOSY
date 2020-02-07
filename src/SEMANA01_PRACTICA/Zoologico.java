/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICA;

/**
 *
 * @author ESTHER
 */
  
import java.io.IOException;
import java.util.Scanner;
public class Zoologico {


public class principal {
 
      public static void main(String[] args){
        Scanner entrada=new Scanner(System.in); 
    
        
        System.out.println("1.- Elefante");
        System.out.println("2.- Jirafas");
        System.out.println("3.- Chimpances");
        System.out.println("Eliga uno de los 3 Animales:");
        int num = entrada.nextInt();
        int edad;
        float nino = 0;
        float joven = 0;
        float adulto = 0;
        float rs1;
        float rs2;
        float rs3;
 
        switch (num) {
            case 1:
                System.out.println("Elefantes");
                for (int i = 1; i <= 20; i++) {
                    System.out.println("Edad del Animal Nº" + i + ":");
                    edad = entrada.nextInt();
 
                    if (edad == 0 || edad == 1) {
                        nino++;
                    } else if (edad > 1 && edad < 3) {
                        joven++;
                    } else if (edad >= 3) {
                        adulto++;
                    }
                }
                rs1=(nino/20)*100 ;
                rs2=(joven/20)*100 ;
                rs3=(adulto/20)*100 ;
                System.out.println("Procentajes de Animales entre 0-1: "+rs1);
                System.out.println("Procentajes de Animales entre 1-3: "+rs2);
                System.out.println("Procentajes de Animales entre 3-a mas: "+rs3);
                break;
            case 2:
                System.out.println("Jirafas");
                for (int i = 1; i <= 15; i++) {
                    System.out.println("Edad del Animal Nº" + i + ":");
                    edad = entrada.nextInt();
 
                    if (edad == 0 || edad == 1) {
                        nino++;
                    } else if (edad > 1 && edad < 3) {
                        joven++;
                    } else if (edad >= 3) {
                        adulto++;
                    }
                }
                 rs1=(nino/15)*100 ;
                 rs2=(joven/15)*100 ;
                 rs3=(adulto/15)*100 ;
                System.out.println("Procentajes de Animales entre 0-1: "+rs1);
                System.out.println("Procentajes de Animales entre 1-3: "+rs2);
                System.out.println("Procentajes de Animales entre 3-a mas: "+rs3);
                break;
            case 3:
                System.out.println("Chimpances");
                for (int i = 1; i <= 40; i++) {
                    System.out.println("Edad del Animal Nº" + i + ":");
                    edad = entrada.nextInt();
 
                    if (edad == 0 || edad == 1) {
                        nino++;
                    } else if (edad > 1 && edad < 3) {
                        joven++;
                    } else if (edad >= 3) {
                        adulto++;
                    }
                }
                 rs1=(nino/40)*100 ;
                 rs2=(joven/40)*100 ;
                 rs3=(adulto/40)*100 ;
                System.out.println("Procentajes de Animales entre 0-1: "+rs1);
                System.out.println("Procentajes de Animales entre 1-3: "+rs2);
                System.out.println("Procentajes de Animales entre 3-a mas: "+rs3);
                break;
        }
          
    }
}
    
}
