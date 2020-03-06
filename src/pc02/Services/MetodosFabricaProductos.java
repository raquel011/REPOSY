/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.Services;

import java.util.ArrayList;
import pc02.beans.Fabrica_Productos;

/**
 *
 * @author ESTHER
 */
public class MetodosFabricaProductos {
        private ArrayList<Fabrica_Productos> FP = new ArrayList<>();
    private int numP = 1;

    public ArrayList<Fabrica_Productos> getFP() {
        return FP;
    }

    public void setFP(ArrayList<Fabrica_Productos> p) {
        this.FP = p;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int np) {
        this.numP = np;
    }
    
    public void AgregarProductos(Fabrica_Productos Fproducto){
        FP.add(Fproducto);
        //numP++;
    }
    
    public void Mostrar(int cod){
        System.out.println("Codigo del Producto: "+FP.get(cod).getCodigo());
        System.out.println("Tipo: "+FP.get(cod).getDescripcion());
        System.out.println("Precio:"+FP.get(cod).getPrecio());
        System.out.println("Unidad: "+FP.get(cod).getUnidadMedida());
        System.out.println("Stock Actual: "+FP.get(cod).getStock());
    }
    
    public void MostrarTodo(){
        for(int i=0;i<FP.size();i++){
            System.out.println("Codigo del Producto: "+FP.get(i).getCodigo());
            System.out.println("Tipo: "+FP.get(i).getDescripcion());
            System.out.println("Precio: s/."+FP.get(i).getPrecio());
            System.out.println("Unidad: "+FP.get(i).getUnidadMedida());
            System.out.println("Stock Actual: "+FP.get(i).getStock());
        }
    }
    
    public void Modificar(int id, String descripcion, double precio, int stock, String unidadMedida){
        FP.get(id).setCodigo(id);
        FP.get(id).setDescripcion(descripcion);
        FP.get(id).setPrecio(precio);
        FP.get(id).setStock(stock);
        FP.get(id).setUnidadMedida(unidadMedida);
    }
    
    public void Eliminar(int cod){
        FP.remove(cod);
    }
    
    public void EliminarTodo(){
        FP.clear();
    }

    public boolean consultarStock(int id, int cantidad){
        
        return (cantidad<=FP.get(id).getStock());
    }

    public int Buscar(int codigoProducto){
        int indiceP=-1;
        for(int i=0;i<FP.size();i++){
            if(codigoProducto == FP.get(i).getCodigo()){
                indiceP = i;
                break;
            }
        }
        return indiceP;
    }
    
    public void ReducirStock(int id, int cantidad){
        int stock = FP.get(id).getStock();
        int newStock = FP.get(id).getStock() - cantidad;
        FP.get(id).setStock(newStock);
    }

    void AgregarProductos(int codigo, String descripcion, double precio, int stock, String unidadMedida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    

