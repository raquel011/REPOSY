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
class cpu{
 private String marca; 

    public cpu(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "cpu{" + "marca=" + marca + '}';
    }
 
}
class pantalla{
 private int pulgadas;

    public pantalla(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "pantalla{" + "pulgadas=" + pulgadas + '}';
    }
 
}
class teclado{
 private String modelo;  

    public teclado(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "teclado{" + "modelo=" + modelo + '}';
    }
 
}
class raton{
private String marca;  

    public raton(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "raton{" + "marca=" + marca + '}';
    }

}
public class Ordenador {
    cpu marca;
    pantalla pant;
    teclado modelo;
    raton marcaraton;

    public Ordenador(cpu marca, pantalla pant, teclado modelo, raton marcaraton) {
        this.marca = marca;
        this.pant = pant;
        this.modelo = modelo;
        this.marcaraton = marcaraton;
    }


    public String mostrar(){
       return ""+ marca.toString()+pant.toString()+modelo.toString()+marcaraton.toString();
    }
    
    
    public static void main(String[] args) {
        cpu c=new cpu("Samsung");
        pantalla p=new pantalla(15);
        teclado t=new teclado("teclado");
        raton r=new raton("raton");
        
        Ordenador main=new Ordenador(c,p,t,r);
        main=null;
        System.out.println(c.toString());
        
    }
  
    
    
    
}
