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
public class ejercicio02_1 {
    public static void main(String[] args) {
        
    
        Scanner entrada=new Scanner(System.in);
        
        int numeroMilimetros;
        
        int metro=1000;
        int centimetro=10;
        int decimetro=100;
       
        
        
            System.out.println("ingrese un numero");
            numeroMilimetros=entrada.nextInt(); 
            
            
            int metros=numeroMilimetros/metro;
            numeroMilimetros=numeroMilimetros%metro;
            
             int deci=numeroMilimetros/decimetro;
            numeroMilimetros=numeroMilimetros%decimetro;
            
            
            int centi=numeroMilimetros/centimetro;
            numeroMilimetros=numeroMilimetros%centimetro;
            
           
            
            
            
            System.out.println("en metros: "+metros);
            System.out.println(" en centimetros: "+centi);
            System.out.println("en decimetros: "+deci);
            System.out.println("en milimetros: "+numeroMilimetros);
            
           
            
      
    
}
    

}