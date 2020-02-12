/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.Services;

import java.util.ArrayList;
import java.util.Scanner;
import pc02.beans.Fabrica_Productos;
import pc02.beans.Pedidos;

/**
 *
 * @author ESTHER
 */
public class GestionF_LALECHERA_CRUD {
    Scanner leer = new Scanner(System.in);
    
    MetodosFabricaProductos MFP = new  MetodosFabricaProductos();
    MetodoClienteNatural MCN= new  MetodoClienteNatural();
    MetodoClienteJuridico MCJ = new MetodoClienteJuridico();
    MetodoPedidos MP = new MetodoPedidos();

    public MetodosFabricaProductos getMFP() {
        return MFP;
    }

    public void setGproductos(MetodosFabricaProductos p) {
        this.MFP = p;
    }

    public MetodoPedidos getMP() {
        return MP;
    }

    public void setMP(MetodoPedidos pedidos) {
        this.MP = pedidos;
    }

    public MetodoClienteNatural getMCN() {
        return MCN;
    }

    public void setMCN(MetodoClienteNatural Mcn) {
        this.MCN = Mcn;
    }

    public MetodoClienteJuridico getMCJ() {
        return MCJ;
    }

    public void setMCJ(MetodoClienteJuridico mcj) {
        this.MCJ = mcj;
    }
    
    public void AgregarClienteNatural(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("DNI: ");
        String DNI = leer.next();
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido Paterno: ");
        String aPaterno = leer.next();
        System.out.println("Apellido Materno: ");
        String aMaterno = leer.next();
        System.out.println("Teléfono: ");
        String telefono = leer.next();
        System.out.println("Correo: ");
        String correo = leer.next();
        System.out.println("Dirección: ");
        String direccion = leer.next();
        
        MCN.AgregarDatosCN(DNI, nombre, aPaterno, aMaterno, telefono, correo, direccion);
       
    }
    
    public void AgregarClienteJuridico(){
        System.out.println("Ingrese los datos del cliente: ");
        System.out.println("Nombre de la Tienda: ");
        String nombreT = leer.next();
        System.out.println("RUC: ");
        String RUC = leer.next();
        System.out.println("Teléfono: ");
        String telefono = leer.next();
        System.out.println("Correo: ");
        String correo = leer.next();
        System.out.println("Dirección: ");
        String direccion = leer.next();
        
        MCJ.AgregarDatos(nombreT, RUC, telefono, correo, direccion);
        System.out.println("CLIENTE JURÍDICO REGISTRADO.");
    }
    
    public void AgregarProducto(){
        System.out.println("Ingrese los datos del producto: ");
        System.out.println("Tipo: ");
        String descripcion = leer.next();
        System.out.println("Precio: ");
        double precio = leer.nextDouble();
        System.out.println("Stock: ");
        int stock = leer.nextInt();
        System.out.println("Unidad de Medida: ");
        String unidadMedida = leer.next();
        
        MFP.AgregarProductos(descripcion, precio, stock, unidadMedida);
        System.out.println("PRODUCTO REGISTRADO.");
    }
    
    public void AgregarPedido(){
        System.out.println("Ingrese los datos del producto: ");
        System.out.println("Tipo de cliente: 1. Cliente Natural 2.Cliente Juridico");
        int tipoCliente = leer.nextInt();
        
        switch(tipoCliente){
            case 1:
                System.out.println("Ingrese el DNI del cliente: ");
                String DNI = leer.next();
                int idClienteN = MCN.BuscarClienteNatural(DNI);
                if(idClienteN != -1){
                    System.out.println("Ingrese el Código del Producto: ");
                    int codigoProducto = leer.nextInt();
                    int idProducto = MFP.Buscar(codigoProducto);
                    if(idProducto != -1){
                        System.out.println("Ingrese la cantidad: ");
                        int cantidad = leer.nextInt();
                        
                        if(cantidad < 100){
                            if(MFP.consultarStock(idProducto, cantidad)){
                                MFP.ReducirStock(idProducto, cantidad);
                                System.out.println("Ingrese la fecha que desea recibir el pedido: ");
                                String fecha = leer.next();
                                
                               MP.AgregarPedidos(fecha, cantidad, DNI, codigoProducto);
                                System.out.println("PEDIDO REGISTRADO");
                            }else{
                                System.out.println("La cantidad solicitada excede el Stock del producto.");
                            }
                        }else{
                            System.out.println("Los clientes naturales solo pueden solicitar una cantidad menor a 100.");
                        }
                    }else{
                        System.out.println("Producto no registrado");
                    }
                    
                }else{
                    System.out.println("Cliente Natural no registrado");
                }
                break;
            case 2:
                System.out.println("Ingrese el RUC del cliente: ");
                String RUC = leer.next();
                int idClienteJ = MCJ.Buscar(RUC);
                if(idClienteJ != -1){
                    System.out.println("Ingrese el Código del Producto: ");
                    int codigoProducto = leer.nextInt();
                    int idProducto = MFP.Buscar(codigoProducto);
                    if(idProducto != -1){
                        System.out.println("Ingrese la cantidad: ");
                        int cantidad = leer.nextInt();
                        
                        if(cantidad%100 == 0){
                            if(MFP.consultarStock(idProducto, cantidad)){
                                MFP.ReducirStock(idProducto, cantidad);
                                System.out.println("Ingrese la fecha que desea recibir el pedido: ");
                                String fecha = leer.next();
                                
                                MP.AgregarPedidos(fecha, cantidad, RUC, codigoProducto);
                                System.out.println("TOTAL A PAGAR: s/."+MFP.getFP().get(idProducto).getPrecio()*cantidad);
                                System.out.println("PEDIDO REGISTRADO");
                            }else{
                                System.out.println("La cantidad solicitada excede el Stock del producto.");
                            }
                        }else{
                            System.out.println("Los clientes naturales solo pueden solicitar una cantidad menor a 100.");
                        }
                    }else{
                        System.out.println("Producto no registrado");
                    }
                    
                }else{
                    System.out.println("Cliente Natural no registrado");
                }
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
    
    public void mostrarClientesNaturales(){
        System.out.println("LISTA DE CLIENTES NATURALES");
        MCN.MostrarTodo();
    }
    
    public void mostrarClientesJuridicos(){
        System.out.println("LISTA DE CLIENTES JURÍDICOS");
        MCJ.MostrarTodo();
    }
    
    public void mostrarProductos(){
        System.out.println("LISTA DE PRODUCTOS");
        MFP.MostrarTodo();
    }
    
    public void mostrarPedidos(){
        System.out.println("LISTA DE PEDIDOS");
        MP.MostrarTodo();
    }
    
}


    
    

