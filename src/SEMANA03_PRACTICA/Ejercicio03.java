/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ESTHER
 */
class cuentaW implements Iterable<String >{
    private String cadena="hola mundo hola+";
    int contador=0;
    
    Scanner entrada=new Scanner(System.in);

    public cuentaW() {
        
    }
    void tam(){
        System.out.println(cadena);
        System.out.println("tamanio"+cadena.length()); 
        
        for (int i = 0; i < cadena.length(); i++) {
         if((cadena.charAt(i)==' ') && (cadena.charAt(i+1)!=' ')){
             contador++;
         }
             
           
        }
        System.out.println("mostrar la cantidad de letras: "+contador);
        int replace = cadena.length() - cadena.replace("+",",").length();
        System.out.println("numeros de signo"+replace);

    }
    public Iterator iterator(){
        return null;
    }
    
}
public class Ejercicio03 {
    public static void main(String[] args) {
        
       cuentaW c=new cuentaW();
       c.tam();
    }
}
