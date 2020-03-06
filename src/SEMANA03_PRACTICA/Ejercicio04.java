/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

/**
 *
 * @author ESTHER
 */
class cadena{
 private String texto;
 String acum="";
 int cont=0;
 public cadena(String cadena){
    this.texto=cadena; 
    
 }
 void palabrasrepetidas(){
     for (int i = 0; i < texto.length(); i++) {
         char cad=texto.charAt(i);
         if(cad==' '){
         texto=" ";
                          cont++;

         }
        acum=acum+texto; 

     }
             // System.out.println(acum);
              System.out.println(cont);

  
 }
            
    
}
public class Ejercicio04 {
    public static void main(String[] args) {
        
    
    cadena c=new cadena("hola mundo hola mundo hola mundo");
    c.palabrasrepetidas();
}
}