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
public class veintiSeis {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad,pago;
                double acu=0,acu2=0,acu3=0,acu4=0,acu5=0;
        double descuento=0;
        do{
            System.out.println("ingrese su edad: ");
            edad=entrada.nextInt();
            
            System.out.println("ingrese el pago");
            pago=entrada.nextInt();
            
            if(edad>=5 &&edad<=14){
                descuento=0;
                descuento=pago*0.50;
                acu=acu+descuento;
            }else if(edad >=15 && edad<=19){
               descuento=0;
               descuento=pago*0.35;
               acu2=acu2+descuento;
            }else if(edad>=20 &&edad<=45){
                descuento=0;
                descuento=pago*0.10;
                acu3=acu3+descuento;
            }else if(edad>=46 && edad<=65){
                descuento=0;
                descuento=pago*0.25;
                acu4=acu4+descuento;
            }else if(edad>=66){
              descuento=0;
              descuento=pago*0.35;
              acu5=acu5+descuento;
                System.out.println("el total de su descuento es : ");
                System.out.println(descuento);
            }else {
                System.out.println("no puede ingresar");
            }
            System.out.println("desea continuar? ");
            
            
        }while(pago!=-1);
        System.out.println("el teatro deja de recibir por personas entre 5 y 14 "+acu);
        System.out.println("entre 15 y 19"+acu2);
        System.out.println("entre 20 y 45 "+acu3);
        System.out.println("entre 46 y 65"+acu4);
        System.out.println("mas de 66"+acu5);
        
        
        
        
        
    }
    
}
