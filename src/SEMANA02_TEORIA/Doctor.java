/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02_TEORIA;

/**
 *
 * @author ESTHER
 */
public class Doctor {
        private int id;
        private String nombre;

    public Doctor(int id,String nombre) {
        this.id=id;
        this.nombre = nombre;
    }  

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
