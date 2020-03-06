/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;


import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author DEYGLIS MIDDLEY
 */
public class Ejercicio4 {
    public static void main(String args[]) {
        
        ClaseWUR frase = new ClaseWUR("hola  hola gg");
        frase.sacanPalabras();
        
        for(int i=0;i<frase.mensaje.size();i++){
            System.out.print("Palabra: "+i+" : ");
            System.out.println(frase.mensaje.get(i));
        }
        
    }
}


class ClaseWUR{
    
    private String frase;
    
    ArrayList<String> mensaje;
    ArrayList<String> Palabrasduplicadas;
    TreeSet<String> nodupli;
    String cadena;
    
    public ClaseWUR(String frase){
        this.frase = frase;
        this.Palabrasduplicadas = new ArrayList<>();
        this.nodupli = new TreeSet<>();
        this.mensaje = new ArrayList<>();
        this.cadena = "";
    }
    
    
    private boolean letraMayus(char a){
        for(char i = 'a';i<='z';i++)
            if(a==i)
                return true;
        return false;
    }
    
    private boolean letraMinus(char a){
        for(char i = 'A';i<='Z';i++)
            if(a==i)
                return true;
        return false;
    }
    
    private String letra(int pos){        
        return ""+frase.charAt(pos);
    }
    
    public void sacanPalabras(){
        boolean ban = false;
        int tamanio = frase.length();
        for(int i=0;i<frase.length();i++){
            if(letraMayus(frase.charAt(i))){
                cadena+=letra(i);
                ban = false;
            }else if(letraMinus(frase.charAt(i))){
                cadena+=letra(i);
                ban = false;
            }else if(letra(i).equals("")){
                ban=true;
            }
            
            if(ban){
                System.out.println("cad: "+cadena);
                mensaje.add(cadena);                    
                cadena="";
                ban = false;
            }            
            if(i==tamanio-1){
                mensaje.add(cadena);
                cadena="";
                break;
            }
                        
        }                
    }
    
    public void AsignacionPalabras(){
        int tam = mensaje.size()-1;
        for(int i=0;i<mensaje.size();i++){
            for(int j=0;j<i;j++){                
                if(mensaje.get(j).equals(mensaje.get(i))){
                    Palabrasduplicadas.add(mensaje.get(j));
                }else if(j==tam-1)
                    nodupli.add(mensaje.get(j));
            }
        }                
    }
    
    
    
}

