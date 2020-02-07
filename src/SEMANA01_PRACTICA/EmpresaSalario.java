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
public class EmpresaSalario {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         int salario=0,hora,suma=0;
         
         System.out.println("ingrese la cantidad de horas: ");
         hora=entrada.nextInt();
         System.out.println("horas extras: ");
         int hE=entrada.nextInt();
         
         if(hora<=40){
          salario=hora*20;   
             
         }else if(hora>40){
             salario=20*hora+hE*25;
             
         }
         System.out.println("el salario es: "+salario);
    }
    
}
