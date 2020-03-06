/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.beans;

/**
 *
 * @author ESTHER
 */
public class Pedidos {
    private int NumeroPedido;
    private String FechaP;
    private int Cantidad;
    private String cliente;
    private int codigoProducto;

    public Pedidos(){
       
    }
    
    public Pedidos(int numeroP, String fechaP, int cantidad, String cliente, int codigoProducto) {
        this.NumeroPedido = numeroP;
        this.FechaP = fechaP;
        this.Cantidad = cantidad;
        this.cliente = cliente;
        this.codigoProducto = codigoProducto;
    }

    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(int NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public String getFechaP() {
        return FechaP;
    }

    public void setFechaP(String FechaP) {
        this.FechaP = FechaP;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "NumeroPedido=" + NumeroPedido + ", FechaP=" + FechaP + ", Cantidad=" + Cantidad + ", cliente=" + cliente + ", codigoProducto=" + codigoProducto + '}';
    }

    
    
}
