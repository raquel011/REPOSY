/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_TEORIA;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ESTHER
 */
class disco{
    protected String titulo;
    protected String autor;

    public disco(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "disco{" + "titulo=" + titulo + ", autor=" + autor+"  ";
    }
    
}
class genero extends disco{
    protected String nombregenero;

    public genero(String nombregenero, String titulo, String autor) {
        super(titulo, autor);
        this.nombregenero = nombregenero;
    }
    String mostrargenero(){
        return this.toString()+", nombregenero="+nombregenero;
    }
    
}
class formato extends genero{
    protected String nombreformato;

    public formato(String nombreformato, String nombregenero, String titulo, String autor) {
        super(nombregenero, titulo, autor);
        this.nombreformato = nombreformato;
    }
    String mostrarformato(){
        return this.mostrargenero()+", nombreformato="+nombreformato;
    }
    
}
class valor extends formato{
    protected double valor;

    public valor(double valor, String nombreformato, String nombregenero, String titulo, String autor) {
        super(nombreformato, nombregenero, titulo, autor);
        this.valor = valor;
    }
    String mostrarvalor(){
        return this.mostrarformato()+", valor ="+valor;
    }
}
class ListaMultimedia implements Iterable<valor>{
    ArrayList<valor > listaD=new ArrayList<>();
    int limite;
    public ListaMultimedia(int tam) {
        this.limite=tam;
    }
    
   

    
    void agregar(valor v){
        if(listaD.size()<limite){
        listaD.add(v);
        }else{
            System.out.println("lista llena");
        }
        
        
        
    }
    public Iterator iterator(){
        return listaD.iterator();
    }
    
}
public class ejercicio03 {
    public static void main(String[] args) {
     ListaMultimedia listamultimedia=new ListaMultimedia(20);
     
     
     valor disco1=new valor(50.5,"formato1","genero1","titulo1","autor1");
     valor disco2=new valor(30.5,"formato1","genero1","titulo1","autor1");
      valor disco3=new valor(20.5,"formato1","genero1","titulo1","autor1");

     disco nd=new disco("titulodisco"," autordiscoN");

     
     listamultimedia.agregar(disco1);
     listamultimedia.agregar(disco2);
     listamultimedia.agregar(disco3);

     
     
     for(valor val:listamultimedia){
         
         System.out.println(val.mostrarvalor());  
         
     }
     }
    }