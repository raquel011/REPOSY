/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_01_TEORICO;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class Ejerccicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String num;
        int acu=0;
        System.out.println("ingrese un numero ");
        num=entrada.next();
        int i=num.length()-1;
        
        while(i>=0){
            acu=acu+Integer.parseInt(num.charAt(i)+"");
          //acu=acu+Character.getNumericValue(num.charAt(i));
          i--;
        }
        System.out.println("la suma de los digitos de un numero es: "+acu);
        
    }
}
