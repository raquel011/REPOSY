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
public class treintaYocho {
    public static void main(String[] args) {
        int suma=0;
        Scanner entrada=new Scanner(System.in);
        
        
        for (int i = 100; i > 0; i=i-2) {
            System.out.print(i+" +"); 
            suma=suma+i;
            
        }
        System.out.println("la suma total es: "+ suma);
    }
    
}
