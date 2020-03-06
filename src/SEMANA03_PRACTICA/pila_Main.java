/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_PRACTICA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author ESTHER
 */


class nodo{
    nodo siguiente;
    int x;
    public nodo(int x){
     this.x=x;
     siguiente=null;
    }
            
}
class metodo{
 nodo ultimo;

public metodo() {
        this.ultimo = null;
    }


void agregar(int n){
    nodo nuevonodo=new nodo(n);
    if(ultimo==null){
        ultimo=nuevonodo;
    }else
    {
        nuevonodo.siguiente=ultimo;
        ultimo=nuevonodo;
    }
    
}  
void mostrar(){
     nodo temp=ultimo;
        while(temp!=null){
            System.out.println(temp.x);
            temp=temp.siguiente;
        }
    }
void sacarpila(){
    if(ultimo==null){
        System.out.println("lista vacia");
}else{
        ultimo=ultimo.siguiente;
    }

}
void scola(){
    nodo temp=ultimo;
    if(ultimo==null){
        System.out.println("lista vacia");
    }else
        if(temp.siguiente==null){
            ultimo=null;
    }else{
            while(temp!=null){
                temp.siguiente.siguiente=null;
                
            }
                
        
    }
    
}
void eliminarElemento(int n){
    
 nodo temp=ultimo;
 if(temp!=null){
  nodo aux;
    nodo anterior=null;
    aux=temp;
    while((aux!=null)&&(aux.x!=n)){
        anterior=aux;
        aux=aux.siguiente;
     
 }
    //el elemento o a sifo¿do enontrado
    if(aux==null){
        System.out.println("no se encotro");
    
    }
    else if(anterior==null){
        aux=aux.siguiente;
       ;
    }
    else{anterior.siguiente=aux.siguiente;
    
    aux=aux.siguiente;
 }
}
}
}


public class pila_Main{
    public static void main(String[] args) {
        
    
    metodo me=new metodo();
    me.agregar(3);
    me.agregar(5);
    me.agregar(7);
    me.agregar(9);
    me.agregar(12);
    
    me.mostrar();
    me.sacarpila();
        System.out.println("eliminado un elemento");
    me.mostrar();
    
    }
    
}

