/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICA;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class multiplicacion {
    private int numero1;
    private int numero2;

    Scanner entrada=new Scanner(System.in);

    public multiplicacion() {
    }
    
    public multiplicacion(int num,int num2) {
        this.numero1=num;
        this.numero2=num2;
        
    }
    public void calcular(){
        System.out.println("ingrese numero1");
        numero1=entrada.nextInt();
        System.out.println("ingrese numero 2");
        numero2=entrada.nextInt();
        int suma=numero1*numero2;
        System.out.println("la multiplicacion es : "+suma);
   
    }
    
    
    
    
    
}
