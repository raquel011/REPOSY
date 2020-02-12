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
public class ClienteJuridico extends TipoCliente {

    private String NombreTienda;
    private String RUC;

    public ClienteJuridico(String nombreTienda,String RUC,String Direccion, String Correo, String Telefono) {
        super(Direccion, Correo, Telefono);
        
        this.NombreTienda=nombreTienda;
        this.RUC=RUC;
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

    public String getNombreTienda() {
        return NombreTienda;
    }

    public void setNombreTienda(String NombreTienda) {
        this.NombreTienda = NombreTienda;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
}
