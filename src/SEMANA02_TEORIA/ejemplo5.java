/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORIA;

/**
 *
 * @author ESTHER
 */
class perro{
    String nombre;
    int edad;
    String raza;

    public perro() {
        this.nombre="";
       this.edad=0;
       this.raza="";
    }

    
    public perro(String cad) {
    }
    public perro(String cad, int n){
        
    }
    public perro(int n,String cad){
        
    }
}
public class ejemplo5 {
    public static void main(String[] args) {
        perro p1=new perro();
        perro p2 =new perro("fido");
        perro p3=new perro("",5);
    }
    
}
