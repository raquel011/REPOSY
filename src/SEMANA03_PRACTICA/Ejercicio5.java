/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.ArrayList;

/**
 *

 */


class PaLinea{
    
    private String frase;
    private ArrayList<String> Letras;
    private ArrayList<Integer> listaPosicion;
    
    public PaLinea(String cadena){
        this.frase = cadena;
       Letras = new ArrayList<>();
        listaPosicion = new ArrayList<>();
    }
    
    public void setCadena(String cadena){
        this.frase = cadena;
    }
    
    private boolean letrasMinus(char i){
        for(char c = 'a';c<='z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
    private boolean letrasMayus(char i){
        for(char c = 'A';c<='Z';c++){
            if(i==c)
                return true;
        }   
        return false;
    }
    
    public String letra(int pos){
        return ""+frase.charAt(pos);
    }
    
    public void infoLetras(){
        for(int i=0;i<frase.length();i++){
            if(letrasMayus(frase.charAt(i))){
                Letras.add(letra(i));
                listaPosicion.add(i);
            }else if(letrasMinus(frase.charAt(i))){
                Letras.add(letra(i));
                listaPosicion.add(i);
            }                                
        }
    }
    
    
    public String mostrar(){
        String cad = "";
        for(int i=0;i<Letras.size();i++){
            cad+=" Letra: "+Letras.get(i)+", posicion: "+listaPosicion.get(i)+"\n";
        }
        return cad;
    }
    
    
}
public class Ejercicio5 {
    public static void main(String[] args) {
        PaLinea pl = new PaLinea("hola mundo hola");
        pl.infoLetras();
        System.out.println(pl.mostrar());
    }
    
    
}