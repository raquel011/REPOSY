/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_01_TEORICO;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author ESTHER
 */
public class saludoBuffer {
        public static void main(String[] args) throws IOException {
        
            BufferedReader n=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingrese un nombre");
            String nombre=n.readLine();
            System.out.println("su nombre es:"+nombre);
    }



    
}
    

