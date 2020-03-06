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

class nodocola{
nodo siguiente;
int x;
public nodocola(int x){
    x=x;
    siguiente=null;
}

}
class metodocola{
  nodo ultimo;

    public metodocola() {
        this.ultimo = null;
    }


void agregar(int n){
    nodo nuevonodo=new nodo(n);
    if(ultimo==null){
   nuevonodo=ultimo;   
  }
    
}  
void mostrar(){
     nodo temp=ultimo;
        while(temp!=null){
            System.out.println(temp.x);
            temp=temp.siguiente;
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
  
}

public class Cola {
    public static void main(String[] args) {
       metodocola mc=new metodocola();
       mc.agregar(8);
       mc.agregar(7);
       mc.agregar(4);
       mc.agregar(2);
      
        mc.mostrar();
       //mc.scola();
       //mc.mostrar();
    }
    
}
