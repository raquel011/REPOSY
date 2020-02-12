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
public class TipoCliente {
    protected String Direccion;
    protected String Correo;
    protected String Telefono;
    
    public TipoCliente(){
        Direccion = "";
        Correo = "";
    
        Telefono = "";
    }

    public TipoCliente(String Direccion, String Correo, String Telefono) {
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    }
    

    
