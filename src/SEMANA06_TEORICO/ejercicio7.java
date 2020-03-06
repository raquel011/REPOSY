/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06_TEORICO;

import java.util.ArrayList;

/**
 *
 * @author ESTHER
 */
interface Iimpresion{
    public void save(Object o);
        
    
    
}
class persona{
    private String nombre;
    private double sueldo;

    public persona(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
}
class padron{
    ArrayList<persona> listaP=new ArrayList<>();
    void guardar(persona p){
        listaP.add(p);
    }
    void mostrar(){
        for(persona p:listaP)
            System.out.println(listaP.get(0).toString());
        }
    }
    

class servicio{
    Iimpresion impresion;
    void setimpresion(Iimpresion imp){
        this.impresion=imp;
    }
    void savepersona(persona p){
        this.impresion.save(p);
    }
}
class tinta implements Iimpresion{
  public void save(Object o){
      if(o instanceof persona){
          System.out.println("la imoresion se esta realizando");
      }
  }  
}
class termica implements Iimpresion {
    public void save(Object o){
      if(o instanceof persona){
          System.out.println("la impresion se esta realizando");
      }
  }  
        
}
class laser implements Iimpresion{
    public void save(Object o){
      if(o instanceof persona){
          System.out.println("la impresion se esta reaizando ");
      }
  }  
    
}

public class ejercicio7 {
    public static void main(String[] args) {
     
        termica t=new termica();
        padron p=new padron();
        persona per=new persona(" luis",20);
        p.guardar(per);
        
        
    servicio ih=new servicio();
    
    ih.setimpresion(new termica());
    
    ih.savepersona(new persona(" uu",30));
    
   
    
    } 
}
