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
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> listaFamilia=new ArrayList<>();
        listaFamilia.add("A");
        listaFamilia.add("B");
        listaFamilia.add("C");
        listaFamilia.add("D");
        listaFamilia.add("E");
        listaFamilia.add("F");
        Iterator it=listaFamilia.iterator();
       
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
        
       
    }
    
}
