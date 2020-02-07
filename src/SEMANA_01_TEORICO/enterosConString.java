/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_01_TEORICO;

/**
 *
 * @author ESTHER
 */

import java.util.Scanner;

public class enterosConString {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,acu=0;
        String numero="";
        
        System.out.println("ingrese un numero String");
        numero=entrada.next();
        
        int i=numero.length()-1;
        
        while (i>=0){
            acu+=Integer.parseInt(numero.charAt(i)+"");
            i--;
            System.out.println("la suma de los digitos es: "+acu);
            
        }
        
        
    }
    
    
}
