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
public class ejercicioN2_5 {
    public static void main(String[] args) {
        
        int numeroF;
        int result;
        float celcius=0;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("ingrese un numero: ");
        numeroF=entrada.nextInt();
        
        
        
        celcius=(numeroF-32)*(5f/9f);
        
        
       
        System.out.println("de F a C: "+celcius);
        
        
    }
    
}
