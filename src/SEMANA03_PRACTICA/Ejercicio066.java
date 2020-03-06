/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio066 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        palabra p=new palabra();
        p.guardar("hola");
        p.guardar("jose");
        p.guardar("luisa");
        p.longitud(4);
            
            System.out.println(  p.ListaOrdenada());
        
    }
}

class palabra{
        
    private ArrayList<String> mipalabra;
    private ArrayList<String> listap;
    public palabra(){        
         mipalabra = new  ArrayList<String>();

         listap = new ArrayList<>();
    }
    
    public void guardar(String cad){
        mipalabra.add(cad);
    }
            
    public void longitud(int longitud){
        for(int i=0;i<mipalabra.size();i++){
            if(longitud==mipalabra.get(i).length()){
                listap.add(mipalabra.get(i));
            }
        }
    }
    
    public String ListaOrdenada(){
        String cad = "";
        Collections.sort(listap);
        for(String s: listap)
            cad+=s;
        listap.clear();
        return cad;
    }
    
    
}
    
