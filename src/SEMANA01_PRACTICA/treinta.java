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
public class treinta {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double pr,descuento,prec,total=0;
        
        System.out.println("cantidad de articulos a comprar");
        int cantidad=entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            
        
        System.out.println("nombre");
        String nombre=entrada.next();
        System.out.println("precio ");
        float precio=entrada.nextFloat();
        System.out.println("el articulo tiee etiqueta roja? si=1 no=2");
        int etiqueta=entrada.nextInt();
        
        pr=precio*cantidad;
        if(etiqueta==1 || etiqueta==2){
            descuento=pr*0.20;
            prec=pr-descuento;
            total=total+prec;
            System.out.println("precio por unidad"+pr);
            System.out.println("control de cantidad "+total);
            
        }
        }
        System.out.println("cantidad total a pagar "+total);
        
        
    }
    
}
