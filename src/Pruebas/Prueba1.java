/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import SEMANA02_PRACTICA.EventoE;
import SEMANA02_PRACTICA.ExpositorPersonaE;
import SEMANA02_PRACTICA.AsistentePersonaE;

/**
 *
 * @author ESTHER
 */
public class Prueba1 {
        
    public static void main(String[] args) {
        
        EventoE E;
        ExpositorPersonaE ex=new ExpositorPersonaE("E-001","Raul" , "Lozano", "lozano@gmail.com");
        AsistentePersonaE as=new AsistentePersonaE("A-001", "Diego", "Rosas", "Rosas@gmail.com", "987654345", "Tingo Maria");
        E=new EventoE("CLOUD REPOSITORIES", 01, ex, "8:30 am","1:00 pm","baja","P", as);
         
        System.out.println(E.MostrarEvento());
        
        E.costoIngresoEvento();
        System.out.println(E.MontoTotalIncluyendoIGV());
        System.out.println(E.MontoDescuentoPorTemporada());
        
    }
}

