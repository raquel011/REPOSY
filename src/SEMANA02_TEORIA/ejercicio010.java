/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORIA;

import java.util.ArrayList;

/**
 *
 * @author ESTHER
 */
    class numeros{
    private int x=10;
    void setx(int a){
        this.x=a;
    }
    int getx(){
        return this.x;
    }
}
public class ejercicio010 {
    public static void main(String[] args) {
        numeros num=new numeros();
        ArrayList lista=new ArrayList();
        incrementar(num);
        System.out.println(num.getx());
    }
    static void incrementar(numeros a){
        a.setx(30);
    }
}


    

