/*desarrollar una clas egeneric llamada clase operacionres dondee tendra 2 variables y 
realizar las operaciones de suma, resta y producto.
crear un test con los siguientes datos:
operaciones <FLloat> op=new operaciones(5,5);
operaciones <Integer> op=new operaciones (4,3);*/

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

class operaciones<Float> implements Iterable{
//ArrayList<Float> lista=new ArrayList<Float>();
float numero1,numero2,suma=0;


public operaciones(int num1,int num2){
  this.numero1=num1;
this.numero2=num2;
}
public void suma(){
  suma=numero1+numero2;
 }
public void resta(){
 suma=numero1*numero2;   
}
void multiplicacion(){
 suma=numero1*numero2;   
    System.out.println(suma);
}
float retorn(){
    return suma;
}
public Iterator iterator(){
    return null;
}  

}

public class ejercicio9 {
    public static void main(String[] args) {
      operaciones<Float> op=new operaciones(5,5); 
        op.multiplicacion();
        op.suma();
      //operaciones<Integer>op=new operaciones();
    }
  
}
