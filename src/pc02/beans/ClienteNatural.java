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
public class ClienteNatural extends TipoCliente{
   private String DNI;
   private String Nombre;
   private String ApellidoPaterno;
   private String pellidoMaterno;

    public ClienteNatural(String DNI, String Nombre, String ApellidoPaterno, String pellidoMaterno, String Direccion, String Correo, String Telefono) {
        super(Direccion, Correo, Telefono);
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.pellidoMaterno = pellidoMaterno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getPellidoMaterno() {
        return pellidoMaterno;
    }

    public void setPellidoMaterno(String pellidoMaterno) {
        this.pellidoMaterno = pellidoMaterno;
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

