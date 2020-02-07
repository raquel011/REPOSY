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
public class sumaDigitosEnteros {
    int numero;
    int result=0;
Scanner entrada=new Scanner(System.in);
    public void sumaDigitosE() {
        System.out.println("ingrese un numeros entero: ");
        numero=entrada.nextInt();
        
        while(numero>0){
            
        result=result+numero%10;
         numero=numero/10;
        }
        System.out.println("la suma es: "+result);
        
    }
    
    
    public static void main(String[] args) {
       sumaDigitosEnteros p=new sumaDigitosEnteros();
       p.sumaDigitosE();
    }
    
}
