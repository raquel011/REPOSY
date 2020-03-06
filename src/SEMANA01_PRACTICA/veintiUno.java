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
    import java.util.Scanner;
public class veintiUno {

	public static void main(String args[]){
                int suma=0,totalProductosDia=0,opcion=0;
		Scanner entrada = new Scanner(System.in);

	do{	
            System.out.println("1. comprar..2:salir");
        if(opcion==1){

            System.out.println("ingrese la cantidad de productos comprados: ");
            int cantP=entrada.nextInt();
            for (int i = 0; i < cantP; i++) {
                System.out.println("ingrese el valor del producto: ");
                int vaP=entrada.nextInt();
                suma=suma+vaP;
            }
            System.out.println(" la suma  de los productos es "+suma);
               totalProductosDia=totalProductosDia+suma;
               suma=0;
        }
        }
        while(opcion!=1);
                System.out.println("la suma es : "+totalProductosDia);
}
    
}
