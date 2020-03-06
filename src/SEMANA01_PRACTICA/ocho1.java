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
import java.util.Scanner;
public class ocho1 {
    public static void main(String[] args) {
                 Scanner entrada=new Scanner(System.in);

        int i,cont=0;
        double compra=0;
        double desc=0,tPagar=0;
        double valorKilo=2.2,Ccompra=0;
        int cantK;
        for ( i = 1; i < 15; i++) {

        //do{
        System.out.println("numero de kilos comprados: ");
        cantK=entrada.nextInt();
        compra=cantK*valorKilo;
        desc =(compra*15);
        tPagar=compra-desc;
        if(cantK>10){
        System.out.println("Usted debe cancelar "+compra+" soles por los "+cantK+" kilos de naranja");

            Ccompra=Ccompra+compra;
                
                    
        }else{
            System.out.println("Usted debe cancelar "+desc+" soles por los "+cantK+" kilos de naranja");

            Ccompra=Ccompra+desc;


                System.out.println("pagar"+compra);
            System.out.println("el descuento"+desc);
        
        cont*=tPagar;
        System.out.println("total de ingresos"+cont);
    }
        

}
         System.out.println("La tienda percibira por esas compras "+Ccompra+" soles");
    }
}