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
import java.util.ArrayList;
public class testDoctor {

    public static void main(String[] args) {
        ArrayList <Doctor> listaDoctor=new ArrayList<>();
        listaDoctor.add(new Doctor(1,"Juan"));
        listaDoctor.add(new Doctor(2,"maria"));
        listaDoctor.add(new Doctor(3,"antonio"));
        listaDoctor.add(new Doctor(4,"nela"));
        
        for(Doctor datos:listaDoctor){
            System.out.println(datos.toString());
        }
        
    }
    
        
}

