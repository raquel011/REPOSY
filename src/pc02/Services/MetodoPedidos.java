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
    private int numP = 1;//Número de Pedidonp

    public ArrayList<Pedidos> getMisPedidos() {
        return MisPedidos;
    }
   
    public void setP(ArrayList<Pedidos> p) {
        this.MisPedidos = p;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int np) {
        this.numP = np;
    }
    
    public void AgregarPedidos(String fechaP, int cantidad, String cliente, int producto){
        MisPedidos.add(new Pedidos(numP,fechaP, cantidad, cliente, producto));
        numP++;
    }
    
    public void Mostrar(int codigo){
        System.out.println("Número de Pedido: "+MisPedidos.get(codigo).getNumeroPedido());
        System.out.println("Código del Cliente: "+MisPedidos.get(codigo).getCliente());
        System.out.println("Código del Producto: "+MisPedidos.get(codigo).getCodigoProducto());
        System.out.println("Cantidad: "+MisPedidos.get(codigo).getCantidad());
        System.out.println("Fecha del Pedido: "+MisPedidos.get(codigo).getFechaP());
    }
    
    public void MostrarTodo(){
        for(int i=0;i<MisPedidos.size();i++){
            System.out.println("Número de Pedido: "+MisPedidos.get(i).getNumeroPedido());
            System.out.println("Código del Cliente: "+MisPedidos.get(i).getCliente());
            System.out.println("Código del Producto: "+MisPedidos.get(i).getCodigoProducto());
            System.out.println("Cantidad: "+MisPedidos.get(i).getCantidad());
            System.out.println("Fecha del Pedido: "+MisPedidos.get(i).getFechaP());
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
