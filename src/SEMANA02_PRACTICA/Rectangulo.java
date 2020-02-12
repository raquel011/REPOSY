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
public class Rectangulo {
    private int numero1;
    private int numero2;

    Scanner entrada=new Scanner(System.in);

    public Rectangulo() {
    }
    
    public Rectangulo(int num,int num2) {
        this.numero1=num;
        this.numero2=num2;
        
    }
    public void calcular(){
        System.out.println("ingrese base");
        numero1=entrada.nextInt();
        System.out.println("ingrese altura");
        numero2=entrada.nextInt();
        int area=numero1+numero2;
        System.out.println("el area es : "+area);
   
    }
    
 
    
    
    
}
