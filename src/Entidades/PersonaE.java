/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ESTHER
 */
public class PersonaE {
    protected String Codigo;
    protected String Nombre;
    protected String Apellido;
    protected String Correo;

    public PersonaE(String codigo, String nombre, String apellido, String correo) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo = correo;
    }
    
}
