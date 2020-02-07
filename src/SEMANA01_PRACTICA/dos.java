/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICA;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class dos {
    public static void main(String[] args) {
     Scanner entrada=new Scanner(System.in);
     
    int x,i,meses,contador=0,num=0,suma=0;
    float mes=0,mess=0,interesM=0,acu=0, pendiente=0,total=0;
        
        System.out.println("ingrese el monto prestado X: ");
        x=entrada.nextInt();
        System.out.println("ingrese la cantidad de meses a pagar: ");
        meses=entrada.nextInt();
        for (i = 1; i <= meses; i++) {
            
        System.out.println("mes "+i);
        
        interesM=interesM+(x*(1f/100f))/(float)meses;
        
        mes=((float)x/(float)meses);

        mess=((float)x/(float)meses)+interesM;
        
        acu=acu+interesM;
        
        pendiente=x-mes;
        
         System.out.println("a. la cantidad de interes pagada cada mes es : "+interesM);  
         System.out.println("b. La cantidad de dinero aplicada cada mes al capital por devolver"+mes);
          
         System.out.println("d.- La cantidad del préstamo aún pendiente al final de cada mes: "+pendiente);          
         System.out.println("f.- La cantidad del último pago (probablemente menor que Y): "+mess);
     }  
        System.out.println("c.- La cantidad acumulada de intereses pagados al final de cada mes: "+acu);
         
         System.out.println("e.- El número necesario de pagos mensuales para devolver el préstamo completo."+meses);
         System.out.println("f.- La cantidad del último pago (probablemente menor que Y): "+total);

        
    }
     
}
    

