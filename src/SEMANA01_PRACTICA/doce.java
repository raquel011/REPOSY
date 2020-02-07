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
public class doce {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int vendedores,contador,sueldoBase,venta;
        double ventaAcu=0,comision,total=0;
        
        
        System.out.println("cantidad de vendedores: ");
        vendedores=entrada.nextInt();
        System.out.println("sueldo base del empleado : ");
        sueldoBase=entrada.nextInt();
        for (int i = 0; i < vendedores; i++) {
            System.out.println("vendedor "+i);
            for (int j = 0; j < 3; j++) {
                       
                venta=entrada.nextInt();
                ventaAcu=ventaAcu+venta;
               
               
               
                           
            }

            comision=ventaAcu*0.10;
            total=comision+ventaAcu+sueldoBase;
            
            System.out.println("el sueldo total del empleado"+i+" :");
            System.out.println(""+i+" "+total);
            System.out.println("comisiones total"+comision);
            ventaAcu=0;
        }
        
    }
    
}
