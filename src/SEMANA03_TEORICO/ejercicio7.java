/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ESTHER
 */
class bolsa implements Iterable{
    ArrayList<Object> lista=new ArrayList<>();
    int tope;
    public bolsa(int x){
    super();
    this.tope=x;
            }

    


public void add(Object objeto){
if(lista.size()<=tope){
    lista.add(objeto);
    
}else {throw new RuntimeException("no caben mas");
}
   
    
}
    public Iterator iterator(){  
            return lista.iterator();

        }

        
    }
class golosin{
    private String marca;
    public golosin(String m){
        this.marca=m;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }    
}
class chocolatin{
    private String nombre;
    public chocolatin(String n){
        this.nombre=n;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
}
    


public class ejercicio7 {
   public static void main(String[] args) {
        bolsa mercado=new bolsa(5);
        chocolatina c1=new chocolatina("koka");
        chocolatina c2=new chocolatina("keke");
        chocolatina c3=new chocolatina("koko");
        golosina g1=new golosina("chicle");
        golosina g2=new golosina("Caramelo");
        mercado.add(c1);
        mercado.add(c2);
        mercado.add(c3);
        mercado.add(g1);
        mercado.add(g2);
        for(Object ob:mercado){
            if(ob instanceof chocolatina)
                System.out.println("Chocolatia de nombre: "+((chocolatin) ob).getNombre());
            if(ob instanceof golosina)
                System.out.println("Golosina: "+((golosin)ob).getMarca());
        }   
        
    }
}
 
    

