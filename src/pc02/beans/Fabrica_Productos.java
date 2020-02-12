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
public class Fabrica_Productos {
    private int Codigo;
    private String Descripcion;
    private double Precio;
    private int StockActual;
    private String UnidadMedida;
    
    public Fabrica_Productos(){
        Codigo = 0;
        Descripcion = "";
        Precio = 0;
        StockActual = 0;
        UnidadMedida = "";
    }

    public Fabrica_Productos(int codigo, String descripcion, double precio, int stock, String unidadMedida) {
        this.Codigo = codigo;
        this.Descripcion = descripcion;
        this.Precio = precio;
        this.StockActual = stock;
        this.UnidadMedida = unidadMedida;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public int getStock() {
        return StockActual;
    }

    public void setStock(int stock) {
        this.StockActual = stock;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.UnidadMedida = unidadMedida;
    }
    
}


