/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.*;

/**
 *
 * @author ESTHER
 */
class uno {

    Scanner entrada=new Scanner(System.in);
    public uno() {
    }
    
    public void insisoA(){
        boolean x=false;
        if(x=8>5 && 6 > 10 || true){
            System.out.println(x);
        }
    }
    public void insisoB(){
        System.out.println("ingrese un valor double ");
        double valorDouble=entrada.nextDouble();
        System.out.println(valorDouble);
    }
    public void insisoC(){
        int x=3;
        int z;
        int y=z=6;
        
       int result=2*x+y/z;
       
        System.out.println(".."+result);
        
        
    }
    
    public void insisoD(){
        int x;
        x =-1 + 4*7-27 /3;
        if (x%2!=0)
            x+=4;
        else
            x*=4;
        System.out.println ("Valor de X= "+ x);
    }
    
    public static void main(String[] args) {
        uno u=new uno();
        
        u.insisoA();
        u.insisoC();
        u.insisoD();
        
    }
    
}
