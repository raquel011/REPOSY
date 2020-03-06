/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03_TEORICO;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class Alumno {
    private String Nombre;
    private int edad;

    public Alumno(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
    public String MostrarMensaje() {
        if(edad>=18){
            System.out.println("myor de edad");
            
        }else {   System.out.println("menor de edad ");

    }
            return "ALUMNO {" + "Nombre :" + Nombre + ", edad :" + edad + '}';
    }
    
    
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingrese nombre");
        String nombre=entrada.next();
        System.out.println("ingrese edad");
        int edad=entrada.nextInt();
        
       Alumno a=new Alumno(nombre,edad);
        System.out.println(a.MostrarMensaje());
       
    }
   
}
