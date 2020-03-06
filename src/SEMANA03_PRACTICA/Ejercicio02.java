/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ESTHER
 */

class numeros{
    int n;
    int i;
    int aleatorio(int min,int max){
        return (int)(Math.random()*(max-min)+min);
                 
        }
    
 
}
public class Ejercicio02 {
    public static void main(String[] args) {
            numeros n=new numeros();
           ArrayList<Integer> lista=new ArrayList<>(); 
           ArrayList<Integer> lista2=new ArrayList<>(); 

      
        for ( int i = 0; i < 100; i++) {
            lista2.add(i);

            lista.add(n.aleatorio(1,100));
            
             
        }
        System.out.println(lista);
        System.out.println(lista2);
        
               
       
        
            
        

       
    }
    
}
