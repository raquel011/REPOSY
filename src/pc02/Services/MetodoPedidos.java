/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.Services;

import java.util.ArrayList;
import pc02.beans.Pedidos;

/**
 *
 * @author ESTHER
 */
public class MetodoPedidos {
    private ArrayList<Pedidos> MisPedidos = new ArrayList<Pedidos>();
    //private int numP = 1;

    public ArrayList<Pedidos> getMisPedidos() {
        return MisPedidos;
    }
   
    public void setMisPedidos(ArrayList<Pedidos> p) {
        this.MisPedidos = p;
    }
    public void AgregarPedidos(Pedidos p){
        MisPedidos.add(p);
        
    }
    
    public void Mostrar(int numPedido){
        System.out.println("Número de Pedido: "+MisPedidos.get(numPedido).getNumeroPedido());
        System.out.println("Código del Cliente: "+MisPedidos.get(numPedido).getCliente());
        System.out.println("Código del Producto: "+MisPedidos.get(numPedido).getCodigoProducto());
        System.out.println("Cantidad: "+MisPedidos.get(numPedido).getCantidad());
        System.out.println("Fecha del Pedido: "+MisPedidos.get(numPedido).getFechaP());
    }
    
    public void MostrarTodo(){
        for(Pedidos p:MisPedidos ){
           
            /*System.out.println("Número de Pedido: "+MisPedidos.get(i).getNumeroPedido());
            System.out.println("Código del Cliente: "+MisPedidos.get(i).getCliente());
            System.out.println("Código del Producto: "+MisPedidos.get(i).getCodigoProducto());
            System.out.println("Cantidad: "+MisPedidos.get(i).getCantidad());
            System.out.println("Fecha del Pedido: "+MisPedidos.get(i).getFechaP());
*/
        }
    }
    
    public void Modificar(int cod, String fechaP, int cantidad, String cliente, int producto){
        MisPedidos.get(cod).setFechaP(fechaP);
        MisPedidos.get(cod).setCantidad(cantidad);
        MisPedidos.get(cod).setCliente(cliente);
        MisPedidos.get(cod).setCodigoProducto(producto);
    }
    
    public void Eliminar(int id){
       MisPedidos.remove(id);
    }
    
    public void EliminarTodo(){
        MisPedidos.clear();
    }
    
}
