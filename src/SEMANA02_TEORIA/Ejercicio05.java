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

    class perr{
    String name;
    int edad;
    String raza;
    public perr(){
        this.name="";
        this.edad=0;
        this.raza="";
    }
    public perr(String cad){
        this.name=cad;
    }
    public perr(String cad, int x){
        this.name=cad;
        this.edad=x;
    }
    public perr(int t,String y){
//        this.name=cad;
//        this.edad=x;
    }
}
public class Ejercicio05 {
    public static void main(String[] args) {
        perro p1=new perro();
        perro p2=new perro("fido");
        perro p3=new perro("fido",5);
        //perro p4=new perro("fido",5,"boxer");
    }
}


    

