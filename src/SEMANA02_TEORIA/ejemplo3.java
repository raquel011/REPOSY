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
    
public class ejemplo3 {
    public static void main(String[] args) {
        
    
    ArrayList<String> miCadena=new ArrayList<String>();
    miCadena.add("A");
    miCadena.add("B");
    Iterator it=miCadena.iterator();
    while(it.hasNext()){
        System.out.println(it.next().toString());
       
        
     
   
}
      /*  for (int i = 0; i < 10; i++) {
            System.out.println(miCadena.get(i));
        }
    */  
}

    
}
