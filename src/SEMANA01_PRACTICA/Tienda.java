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
public class Tienda {
    public static void main(String[] args) {
        
     Scanner entrada=new Scanner(System.in);
    
    int ventas,Vtotales,clientes,suma=0;
    ventas=0;
    Vtotales=0;
    clientes=0;
    int cont=0,contC=0;
        System.out.println("ingrese la cantidad de clientes: ");
        clientes=entrada.nextInt();
        System.out.println("la cantidad de ventas: ");
        int maxVentas=entrada.nextInt();
        for (int i = 0; i < clientes; i++) {
            System.out.println("clientes:  "+i+" : ");
            String nombreCliente=entrada.next();
            
            for (int j = 0; j < maxVentas; j++) {
                System.out.println("compra "+j+" :");
                ventas=entrada.nextInt();
                
              suma+=ventas;
              cont++;
            }
            System.out.println("el monto total de venta del cliente: "+i+" :"+suma);
            contC++;
            suma=0;
        }
       		   System.out.println("el total de la venta es: "+cont);
                   System.out.println("el numero de clientes atendidos es: "+contC);
                   

		
    }
        
}
