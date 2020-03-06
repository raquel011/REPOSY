/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ESTHER
 */

class bag <t> implements Iterable<t>{
    ArrayList<t> lista=new ArrayList<>();
    int tope;
    public bag(int x){
        this.tope=x;
    }
    void add(t p){
        if(lista.size()<=tope)
            lista.add(p);
        else
            throw new RuntimeException("Esta lleno!!");
    }
    @Override
    public Iterator<t> iterator(){
        return lista.iterator();
    }  
}
public class ejercicio08 {
    public static void main(String[] args) {
        bag<golosin> bolsitag=new bag(5);
        bag<chocolatin> bolsitac=new bag(5);
        golosin g1=new golosin("chicle");
        golosin g2=new golosin("Caramelo");
        golosin g3=new golosin("tofis");
        chocolatin c1=new chocolatin("koka");
        chocolatin c2=new chocolatin("keke");
        chocolatin c3=new chocolatin("koko");
        bolsitac.add(c1);
        bolsitac.add(c2);
        bolsitac.add(c3);
        bolsitag.add(g1);
        bolsitag.add(g2);
        bolsitag.add(g3);
        for(golosin g:bolsitag){
            System.out.println(g.getMarca());
        }
        for(chocolatin c:bolsitac){
            System.out.println(c.getNombre());
        }
    }
}


       
    

    

