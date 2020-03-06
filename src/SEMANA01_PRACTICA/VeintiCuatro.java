/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICA;

/**
 *
 * @author ESTHER
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class VeintiCuatro {
    

    public static void main(String[] args) {
        double total;
        DecimalFormat format=new DecimalFormat("##.#");
    Scanner entrada=new Scanner(System.in);
    
        System.out.println("ingrese la color de la bolita: ");
        String color=entrada.next();
        System.out.println("importe: ");
        int importe=entrada.nextInt();


    if (color.equals("roja")){
        
          double descuento=importe*0.40;

      total=importe-descuento;
        System.out.println("descuento  -"+format.format(descuento));
        System.out.println("total a pagar : "+format.format(total));
              }
              else 
        if (color.equals("amarilla")){
       double descuento=importe*0.25;

      total=importe-descuento;
        System.out.println("descuento  -"+format.format(descuento));

            System.out.println("total a pagar  :"+format.format(total));
              }else
            if(color.equals("blanca")){
                System.out.println("no hay descuentos");
                System.out.println(importe);
            }
      
   
}}
