/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.Set;
import java.util.TreeSet;


 
public class Ejercicio2 {
    public static Integer aleatorio(int max,int min){
        return (int)((max+min-1)*Math.random()+1);
    }
    public static void main(String[] args) {
         TreeSet<Integer>aleatorio=new TreeSet<>();
         for(int i=0;i<100;i++){
            aleatorio.add(aleatorio(1,100));
             
         }
          System.out.println(aleatorio);
     
     }
}
