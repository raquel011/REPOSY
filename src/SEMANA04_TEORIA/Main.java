/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04_TEORIA;

/**
 *
 * @author ESTHER
 */
class Humano{
    protected String nombre;
    protected String apellido;
    public Humano(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
        
    }
/*
    
    public String nombreCompleto(){
        return this.apellido+", "+this.nombre;
        
    }
    public String identifcacion(){
        return this.nombreCompleto();
    }*/

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}

public class Main extends Humano{
private String ciudadno;
    public Main(String c,String nombre, String apellido) {
        super(nombre, apellido);
        this.ciudadno=c;
    }
    
    

    
    /*public String nombreCompleto() {
        return super.nombreCompleto(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    public String identifcacion() {
        return super.identifcacion(); //To change body of generated methods, choose Tools | Templates.
    }

    */
    public String toStringciudadano() {
        return this.toString()+ "ciudadno=" + ciudadno + '}';
    }

   
   
    
    

    public static void main(String[] args) {
        Main m=new Main("gg","JOSE ","FLORES");
        System.out.println(m.toStringciudadano());
        //System.out.println(m.identifcacion());
    }


    
}
