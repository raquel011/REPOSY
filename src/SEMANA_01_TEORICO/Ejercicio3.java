/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA_01_TEORICO;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class Ejercicio3 {
    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("###.##%");

        int n1,n2,n3,n4;
        System.out.println("Ingresar n1:");
        n1=sc.nextInt();
        System.out.println("Ingresar n2:");
        n2=sc.nextInt();
        System.out.println("Ingresar n3:");
        n3=sc.nextInt();
        System.out.println("Ingresar n4:");
        n4=sc.nextInt();
        int acu=n1+n2+n3+n4;
        System.out.println("Procentaje de "+n1+" de la suma total es: "
                +formato.format((double)n1/(double)acu));
        System.out.println("Procentaje de "+n2+" de la suma total es "
                +formato.format((float)n2/(float)acu));
        System.out.println("Procentaje de "+n3+" de la suma total es "
                +formato.format((float)n3/(float)acu));
        System.out.println("Procentaje de "+n4+" de la suma total es "
                +formato.format((float)n4/(float)acu));

    }
    
}
