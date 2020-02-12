/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_PRACTICA;
import Entidades.PersonaE;
/**
 *
 * @author ESTHER
 */
public class ExpositorPersonaE extends PersonaE{

    public ExpositorPersonaE(String codigo, String nombre, String apellido, String correo) {
        super(codigo, nombre, apellido, correo);
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /*public void MostrarExpositor() {
                
        System.out.println( "ExpositorPersonaE{"+"Codigo ="+Codigo+"Nombre="+ Nombre+"Apellido"+Apellido+"Correo="+Correo+'}');
    }
    
    */  
    

}
