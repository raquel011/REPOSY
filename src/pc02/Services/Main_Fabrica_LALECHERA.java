/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.Services;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class Main_Fabrica_LALECHERA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        GestionF_LALECHERA_CRUD main = new GestionF_LALECHERA_CRUD();
        int opcion = 0;
        
        do{
            System.out.println("..MENÚ DE OPCIONES..");
            System.out.println("1. AGREGAR CLIENTE NATURAL");
            System.out.println("2. AGREGAR CLIENTE JURIDICO");
            System.out.println("3. AGREGAR PRODUCTO");
            System.out.println("4. AGREGAR PEDIDO");
            System.out.println("5. MOSTRAR CLIENTE NATURAL");
            System.out.println("6. MOSTRAR CLIENTE JURIDICO");
            System.out.println("7. MOSTRAR PRODUCTO");
            System.out.println("8. MOSTRAR PEDIDO");
            System.out.println("9. Salir");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    main.AgregarClienteNatural();
                    break;
                case 2:
                    main.AgregarClienteJuridico();
                    break;
                case 3:
                    main.AgregarProducto(); 
                    break;
                case 4:
                    main.AgregarPedido();
                    break;
                case 5:
                    main.mostrarClientesNaturales();
                    break;
                case 6:
                    main.mostrarClientesJuridicos();
                    break;
                case 7:
                    main.mostrarProductos();
                    break;
                case 8:
                    main.mostrarPedidos();
                    break;
                default:
                    System.out.println("saliendo..");
            }
        }while(opcion != 9);
        
    }
    
}
    

