/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc02.Services;

import java.util.ArrayList;
import pc02.beans.ClienteNatural;

/**
 *
 * @author ESTHER
 */
public class MetodoClienteNatural {
    ArrayList<ClienteNatural> misClientesNaturales = new ArrayList<>();

    public ArrayList<ClienteNatural> getmisClientesNaturales() {
        return misClientesNaturales;
    }

    public void setmisClientesNaturales(ArrayList<ClienteNatural> misClientesNaturales) {
        this.misClientesNaturales = misClientesNaturales;
    }
    
    public void AgregarDatosCN(String DNI, String nombre, String ApellidoPaterno, String ApellidoMaterno, String telefono, String correo, String direccion){
        misClientesNaturales.add(new ClienteNatural(DNI, nombre, ApellidoPaterno, ApellidoMaterno, telefono, correo, direccion));
    }
    
    public int BuscarClienteNatural(String DNI){
        int indiceClienteN = -1;
        for(int i=0;i<misClientesNaturales.size();i++){
            if(misClientesNaturales.get(i).getDNI().equals(DNI)){
                indiceClienteN = i;
                break;
            }
        }
        return indiceClienteN;
    }
    
    public void Mostrar(int codigo){
        System.out.println("DNI: "+misClientesNaturales.get(codigo).getDNI());
        System.out.println("Nombre: "+misClientesNaturales.get(codigo).getNombre());
        System.out.println("Apellidos: "+misClientesNaturales.get(codigo).getApellidoPaterno()+" "+misClientesNaturales.get(codigo).getPellidoMaterno());
        System.out.println("Teléfono: "+misClientesNaturales.get(codigo).getTelefono());
        System.out.println("Correo: "+misClientesNaturales.get(codigo).getCorreo());
        System.out.println("Dirección: "+misClientesNaturales.get(codigo).getDireccion());
    }
    
    public void MostrarTodo(){
        for(int i=0;i<misClientesNaturales.size();i++){
            
            System.out.println("DNI: "+misClientesNaturales.get(i).getDNI());
            System.out.println("Nombre: "+misClientesNaturales.get(i).getNombre());
            System.out.println("Apellidos: "+misClientesNaturales.get(i).getApellidoPaterno()+" "+misClientesNaturales.get(i).getPellidoMaterno());
            System.out.println("Teléfono: "+misClientesNaturales.get(i).getTelefono());
            System.out.println("Correo: "+misClientesNaturales.get(i).getCorreo());
            System.out.println("Dirección: "+misClientesNaturales.get(i).getDireccion());
        }
    }
    
    public void update(int cod, String DNI, String nombre, String ApellidoPaterno, String ApellidoMaterno, String telefono, String correo, String direccion){
        misClientesNaturales.get(cod).setDNI(DNI);
        misClientesNaturales.get(cod).setNombre(nombre);
        misClientesNaturales.get(cod).setApellidoPaterno(ApellidoPaterno);
        misClientesNaturales.get(cod).setPellidoMaterno(ApellidoMaterno);
        misClientesNaturales.get(cod).setTelefono(telefono);
        misClientesNaturales.get(cod).setCorreo(correo);
        misClientesNaturales.get(cod).setDireccion(direccion);
    }
    
    public void delete(int codigo){
        misClientesNaturales.remove(codigo);
    }
    
    public void deleteAll(){
        misClientesNaturales.clear();
    }

   
    
}
