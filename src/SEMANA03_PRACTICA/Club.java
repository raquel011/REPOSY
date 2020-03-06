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

class Socio{
    private String nombre;
    private int tiempo;

    public Socio(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
}




public class Club {
    private Socio socio1,socio2,socio3;

    public Club() {
    }
    public void MayorTiempo(){
    socio1=new Socio("raul",12);
    socio2=new Socio("juan",8);
    socio3=new Socio("laura",7);
    
    }
    public void Imprimir(){
        if(socio1.getTiempo()>socio2.getTiempo() &&socio1.getTiempo()>socio3.getTiempo()){
            System.out.println("el socio con mayor tiempo "+socio1.getNombre());  
        }else if(socio2.getTiempo()>socio1.getTiempo() &&socio2.getTiempo()>socio3.getTiempo()){
            System.out.println("el socio con mayor tiempo "+socio2.getNombre());  

    }else if(socio3.getTiempo()>socio1.getTiempo() &&socio3.getTiempo()>socio2.getTiempo()){
            System.out.println("el nombre del socio con mayor tiempo: "+socio3.getNombre());  

    }
    }
    public static void main(String[] args) {
       Club c=new Club();
       c.MayorTiempo();
       c.Imprimir();
    }
    
}
