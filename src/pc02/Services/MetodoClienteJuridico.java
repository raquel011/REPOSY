/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.Services;
import pc02.beans.ClienteJuridico;

import java.util.ArrayList;

/**
 *
 * @author ESTHER
 */
public class MetodoClienteJuridico {
    private ArrayList<ClienteJuridico> misClientesJuridicos= new ArrayList<>();

    public ArrayList<ClienteJuridico> getmisClientesJuridicos() {
        return misClientesJuridicos;
    }

    public void setisClientesJuridicos(ArrayList<ClienteJuridico> misClientesJuridicos) {
        this.misClientesJuridicos = misClientesJuridicos;
    }
    
    public void AgregarDatos(String nombreTienda, String RUC, String telefono, String correo, String direccion){
        misClientesJuridicos.add(new ClienteJuridico(nombreTienda, RUC, telefono, correo, direccion));
    }
    
    public void Mostrar(int codigo){
        System.out.println("Nombre de la Tienda: "+misClientesJuridicos.get(codigo).getNombreTienda());
        System.out.println("RUC: "+misClientesJuridicos.get(codigo).getRUC());
        System.out.println("Teléfono: "+misClientesJuridicos.get(codigo).getTelefono());
        System.out.println("Correo: "+misClientesJuridicos.get(codigo).getCorreo());
        System.out.println("Dirección: "+misClientesJuridicos.get(codigo).getDireccion());
    }
    
    public void MostrarTodo(){
        for(int i=0;i<misClientesJuridicos.size();i++){
            System.out.println(""
                    + "");
            System.out.println("Nombre de la Tienda: "+misClientesJuridicos.get(i).getNombreTienda());
            System.out.println("RUC: "+misClientesJuridicos.get(i).getRUC());
            System.out.println("Teléfono: "+misClientesJuridicos.get(i).getTelefono());
            System.out.println("Correo: "+misClientesJuridicos.get(i).getCorreo());
            System.out.println("Dirección: "+misClientesJuridicos.get(i).getDireccion());
        }
    }
    
    public void Modificar(int codigo, String nombreTienda, String RUC, String telefono, String correo, String direccion){
        misClientesJuridicos.get(codigo).setNombreTienda(nombreTienda);
        misClientesJuridicos.get(codigo).setRUC(RUC);
        misClientesJuridicos.get(codigo).setTelefono(telefono);
        misClientesJuridicos.get(codigo).setCorreo(correo);
        misClientesJuridicos.get(codigo).setDireccion(direccion);
    }
    
    public void Eliminar(int codigo){
        misClientesJuridicos.remove(codigo);
    }
    
    public void deleteAll(){
        misClientesJuridicos.clear();
    }
    
    public int Buscar(String ruc){
        int indice = -1;
        for(int i=0;i<misClientesJuridicos.size();i++){
            if(misClientesJuridicos.get(i).getRUC().equals(ruc)){
                indice= i;
                break;
            }
        }
        return indice;
    }
    
}

