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
public class DoctorArrayL {

    public static void main(String[] args) {
        ArrayList<Doctor> main=new ArrayList<Doctor>();
        main.add(new Doctor(01,"jose"));
        main.add(new Doctor(02,"luis"));
        for (Doctor d:main) {
            System.out.println(d);
        }
    }
    
        
}

