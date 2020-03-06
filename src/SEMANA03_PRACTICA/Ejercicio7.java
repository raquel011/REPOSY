/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.ArrayList;

class num{
    private int x;

    public num() {
    }

    public num(int n) {
        this.x = n;
    }

    public int getN() {
        return x;
    }

    public void setN(int n) {
        this.x = n;
    }

    @Override
    public String toString() {
        return "numero{"  + x + '}';
    }
}
class numero{
      ArrayList<num>Listanum=new ArrayList<>();
    
    public void agregar(num d){
        Listanum.add(d);
    }
    public void mostrarcola(){
        for(int i=0;i<Listanum.size();i++){
            System.out.println(Listanum.get(i).toString());
        }
   }
    public void mostrarPila(){
         for(int i=(Listanum.size()-1);i>=0;i--){
            System.out.println(Listanum.get(i).toString());
        }
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        numero n=new numero();
        num d1=new num(4);
        num d2=new num(3);
        num d3=new num(5);
        num d4=new num(6);

        n.agregar(d1);
        n.agregar(d2);
        n.agregar(d3);
        n.agregar(d4);
        
        
        System.out.println("..COLA...");
        n.mostrarcola();
           
           System.out.println("...PILA...");
           n.mostrarPila();
    }
}