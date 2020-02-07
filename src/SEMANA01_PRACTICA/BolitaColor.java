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
import java.util.Scanner;
public class BolitaColor {
    

    public static void main(String[] args) {
        double total;
    Scanner entrada=new Scanner(System.in);
    
        System.out.println("ingrese la color de la bolita: ");
        String color=entrada.next();
        System.out.println("importe: ");
        int importe=entrada.nextInt();


    if (color=="r"){
        
    
      total=importe-(importe*0.40);
        System.out.println("pagara: "+total);
              }
              else 
        if (color=="a"){
      total=importe-(importe*0.25);
            System.out.println("pagara :"+total);
              }
      
   
}}
