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
public class AsistentePersonaE extends PersonaE{
    private String Telefono;
    private String Direccion;

    public AsistentePersonaE(String codigo, String nombre, String apellido, String correo, String telefono, String direccion) {
        super(codigo, nombre, apellido, correo);
        this.Telefono=telefono;
        this.Direccion=direccion;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String MostrarAsistente(){
        return "ExpositorPersonaE{"+"Codigo ="+Codigo+"Nombre="+ Nombre+"Apellido"+Apellido+"Correo="+Correo+"telefono="+this.Telefono+"direccion="+'}';

    }
}


    

