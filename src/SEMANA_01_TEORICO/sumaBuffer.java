/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_01_TEORICO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ESTHER
 */
public class sumaBuffer {
            public static void main(String[] args) throws IOException {
        
            BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un numero 1: ");
            int num=Integer.parseInt(n.readLine());
                System.out.println("ingrese numero 2: ");
             
               int num2=Integer.parseInt(n.readLine());
                
                int suma=num+num2;
                
                System.out.println(suma);
    }



    
}

