/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01_PRACTICA;

import java.util.Scanner;

/**
 *
 * @author ESTHER
 */
public class cuarentaYdos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int voto,x=1,cand1=0,cand2=0,cand3=0;

        System.out.println("ingrese su preferencia 1 2 3");
        for (int i = 0; i < 250000; i++) {
            
        voto=entrada.nextInt();


if (voto==1)
{
cand1++; ;
}
else
if (voto==2)
{
cand2++; ;
}
else
if (voto==3)
{
cand3++; ;
}
if ((cand1>cand2)&&(cand1>cand3))
{
    System.out.println("el ganador es "+cand1);
}

else
if ((cand2>cand1)&&(cand2>cand3))
{
    System.out.println("el ganador es "+cand2);}
else
if ((cand3>cand1)&&(cand3>cand2))
{
    System.out.println("el ganador es "+cand3);}
else
if (cand1==cand2)
{
    System.out.println("empate 1 y 2");}
else
if (cand2==cand3)
{
    System.out.println("empate 2 y 3");}
else
if (cand1==cand3)
{
    System.out.println("empate 1 y 3");




    }
    
}
    }
}
